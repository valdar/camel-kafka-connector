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
package org.apache.camel.kafkaconnector.kafkaapicurioregistrynotsecuredsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelKafkaapicurioregistrynotsecuredsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.topic";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_DOC = "Comma separated list of Kafka topic names";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_BOOTSTRAP_SERVERS_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.bootstrapServers";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_BOOTSTRAP_SERVERS_DOC = "Comma separated list of Kafka Broker URLs";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_BOOTSTRAP_SERVERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_COMMIT_ENABLE_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.autoCommitEnable";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DOC = "If true, periodically commit to ZooKeeper the offset of messages already fetched by the consumer";
    public static final Boolean CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DEFAULT = true;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.allowManualCommit";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DOC = "Whether to allow doing manual commits";
    public static final Boolean CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DEFAULT = false;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_POLL_ON_ERROR_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.pollOnError";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_POLL_ON_ERROR_DOC = "What to do if kafka threw an exception while polling for new messages. There are 5 enums and the value can be one of DISCARD, ERROR_HANDLER, RECONNECT, RETRY, STOP";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_POLL_ON_ERROR_DEFAULT = "ERROR_HANDLER";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_OFFSET_RESET_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.autoOffsetReset";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_OFFSET_RESET_DOC = "What to do when there is no initial offset. There are 3 enums and the value can be one of latest, earliest, none";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_OFFSET_RESET_DEFAULT = "latest";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_CONSUMER_GROUP_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.consumerGroup";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_CONSUMER_GROUP_DOC = "A string that uniquely identifies the group of consumers to which this source belongs Example: my-group-id";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_CONSUMER_GROUP_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_DESERIALIZE_HEADERS_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.deserializeHeaders";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_DESERIALIZE_HEADERS_DOC = "When enabled the Kamelet source will deserialize all message headers to String representation.";
    public static final Boolean CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_DESERIALIZE_HEADERS_DEFAULT = true;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_VALUE_DESERIALIZER_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.valueDeserializer";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_VALUE_DESERIALIZER_DOC = "Deserializer class for value that implements the Deserializer interface.";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_VALUE_DESERIALIZER_DEFAULT = "io.apicurio.registry.serde.jsonschema.JsonSchemaKafkaDeserializer";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_APICURIO_REGISTRY_URL_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.apicurioRegistryUrl";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_APICURIO_REGISTRY_URL_DOC = "The Apicurio Schema Registry URL";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_APICURIO_REGISTRY_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_IS_PATTERN_CONF = "camel.kamelet.kafka-apicurio-registry-not-secured-source.topicIsPattern";
    public static final String CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_IS_PATTERN_DOC = "Whether the topic is a pattern (regular expression). This can be used to subscribe to dynamic number of topics matching the pattern.";
    public static final Boolean CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_IS_PATTERN_DEFAULT = false;

    public CamelKafkaapicurioregistrynotsecuredsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelKafkaapicurioregistrynotsecuredsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_BOOTSTRAP_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_BOOTSTRAP_SERVERS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_BOOTSTRAP_SERVERS_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_COMMIT_ENABLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_POLL_ON_ERROR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_POLL_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_POLL_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_OFFSET_RESET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_OFFSET_RESET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_AUTO_OFFSET_RESET_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_CONSUMER_GROUP_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_CONSUMER_GROUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_CONSUMER_GROUP_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_DESERIALIZE_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_DESERIALIZE_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_DESERIALIZE_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_VALUE_DESERIALIZER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_VALUE_DESERIALIZER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_VALUE_DESERIALIZER_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_APICURIO_REGISTRY_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_APICURIO_REGISTRY_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_APICURIO_REGISTRY_URL_DOC);
        conf.define(CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_IS_PATTERN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_IS_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKAAPICURIOREGISTRYNOTSECUREDSOURCE_KAMELET_TOPIC_IS_PATTERN_DOC);
        return conf;
    }
}