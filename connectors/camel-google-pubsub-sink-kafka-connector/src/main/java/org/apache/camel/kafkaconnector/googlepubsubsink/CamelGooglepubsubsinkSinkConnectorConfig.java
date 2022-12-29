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
 */package org.apache.camel.kafkaconnector.googlepubsubsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglepubsubsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_PROJECT_ID_CONF = "camel.kamelet.google-pubsub-sink.projectId";
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_PROJECT_ID_DOC = "The Google Cloud Pub/Sub Project ID.";
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_PROJECT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_DESTINATION_NAME_CONF = "camel.kamelet.google-pubsub-sink.destinationName";
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_DESTINATION_NAME_DOC = "The destination name.";
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_SERVICE_ACCOUNT_KEY_CONF = "camel.kamelet.google-pubsub-sink.serviceAccountKey";
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_SERVICE_ACCOUNT_KEY_DOC = "The service account key to use as credentials for the Pub/Sub publisher/subscriber. You must encode this value in base64.";
    public static final String CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_SERVICE_ACCOUNT_KEY_DEFAULT = null;

    public CamelGooglepubsubsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglepubsubsinkSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_PROJECT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_PROJECT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_PROJECT_ID_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_SERVICE_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_SERVICE_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUBSINK_KAMELET_SERVICE_ACCOUNT_KEY_DOC);
        return conf;
    }
}