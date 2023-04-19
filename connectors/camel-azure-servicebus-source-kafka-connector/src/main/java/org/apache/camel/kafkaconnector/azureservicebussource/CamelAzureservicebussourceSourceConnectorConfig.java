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
package org.apache.camel.kafkaconnector.azureservicebussource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzureservicebussourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_TOPIC_OR_QUEUE_NAME_CONF = "camel.kamelet.azure-servicebus-source.topicOrQueueName";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_TOPIC_OR_QUEUE_NAME_DOC = "Topic Or Queue Name for the Azure Servicebus instance";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_TOPIC_OR_QUEUE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_CONNECTION_STRING_CONF = "camel.kamelet.azure-servicebus-source.connectionString";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_CONNECTION_STRING_DOC = "Connection String for Azure Servicebus instance";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_CONNECTION_STRING_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SERVICE_BUS_RECEIVE_MODE_CONF = "camel.kamelet.azure-servicebus-source.serviceBusReceiveMode";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SERVICE_BUS_RECEIVE_MODE_DOC = "Sets the receive mode for the receiver";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SERVICE_BUS_RECEIVE_MODE_DEFAULT = "PEEK_LOCK";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SUBSCRIPTION_NAME_CONF = "camel.kamelet.azure-servicebus-source.subscriptionName";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SUBSCRIPTION_NAME_DOC = "Sets the name of the subscription in the topic to listen to. This parameter is mandatory in case of topic.";
    public static final String CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SUBSCRIPTION_NAME_DEFAULT = null;

    public CamelAzureservicebussourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzureservicebussourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_TOPIC_OR_QUEUE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_TOPIC_OR_QUEUE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_TOPIC_OR_QUEUE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_CONNECTION_STRING_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_CONNECTION_STRING_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_CONNECTION_STRING_DOC);
        conf.define(CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SERVICE_BUS_RECEIVE_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SERVICE_BUS_RECEIVE_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SERVICE_BUS_RECEIVE_MODE_DOC);
        conf.define(CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SUBSCRIPTION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SUBSCRIPTION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESERVICEBUSSOURCE_KAMELET_SUBSCRIPTION_NAME_DOC);
        return conf;
    }
}