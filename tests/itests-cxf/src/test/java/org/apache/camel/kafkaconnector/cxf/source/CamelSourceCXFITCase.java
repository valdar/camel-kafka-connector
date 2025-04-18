/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.cxf.source;

import org.apache.camel.kafkaconnector.common.test.CamelSourceTestSupport;
import org.apache.camel.kafkaconnector.common.test.TestMessageConsumer;
import org.apache.camel.kafkaconnector.common.utils.NetworkUtils;
import org.apache.camel.kafkaconnector.cxf.client.CXFServiceUtil;
import org.apache.camel.kafkaconnector.cxf.common.HelloService;
import org.apache.camel.test.infra.common.TestUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


public abstract class CamelSourceCXFITCase extends CamelSourceTestSupport {

    protected static final int PORT = NetworkUtils.getFreePort("localhost");
    protected static final String SIMPLE_ENDPOINT_ADDRESS = "http://localhost:" + PORT + "/CxfConsumerTest/test";
    protected static final String SIMPLE_ENDPOINT_URI = SIMPLE_ENDPOINT_ADDRESS
            + "?serviceClass=org.apache.camel.kafkaconnector.cxf.common.HelloService"
            + "&publishedEndpointUrl=http://www.simple.com/services/test";

    protected static final Logger LOG = LoggerFactory.getLogger(CamelSourceCXFITCase.class);

    protected final int expect = 10;

    @Override
    protected String[] getConnectorsInTest() {
        return new String[] {"camel-cxf-kafka-connector"};
    }


    @Override
    protected void produceTestData() {
        TestUtils.waitFor(() -> NetworkUtils.portIsOpen("localhost", PORT));

        try {
            HelloService client = CXFServiceUtil.getService(SIMPLE_ENDPOINT_ADDRESS, HelloService.class);

            for (int i = 0; i < expect; i++) {
                client.echo("Test message " + i);
            }


        } catch (Exception e) {
            LOG.info("Unable to invoke service: {}", e.getMessage(), e);
            fail("Unable to invoke service");
        }
    }

    @Override
    protected void verifyMessages(TestMessageConsumer<?> consumer) {
        LOG.info("Consumed messages: {}", consumer.consumedMessages());

        for (ConsumerRecord<String, ?> record : consumer.consumedMessages()) {
            Object receivedObject = consumer.consumedMessages().get(0).value();
            if (!(receivedObject instanceof String)) {
                fail("Unexpected message type");
            }

            String result = (String) receivedObject;
            assertTrue(result.contains("Test message"));
        }
    }

}
