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
package org.apache.camel.kafkaconnector.kafkabatchazureschemaregistrysource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelKafkabatchazureschemaregistrysourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.topic";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_DOC = "Comma separated list of Kafka topic names";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BOOTSTRAP_SERVERS_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.bootstrapServers";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BOOTSTRAP_SERVERS_DOC = "Comma separated list of Kafka Broker URLs";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BOOTSTRAP_SERVERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SECURITY_PROTOCOL_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.securityProtocol";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SECURITY_PROTOCOL_DOC = "Protocol used to communicate with brokers. SASL_PLAINTEXT, PLAINTEXT, SASL_SSL and SSL are supported";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SECURITY_PROTOCOL_DEFAULT = "SASL_SSL";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SASL_MECHANISM_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.saslMechanism";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SASL_MECHANISM_DOC = "The Simple Authentication and Security Layer (SASL) Mechanism used.";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SASL_MECHANISM_DEFAULT = "PLAIN";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.password";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_PASSWORD_DOC = "Password to authenticate to kafka";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_COMMIT_ENABLE_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.autoCommitEnable";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DOC = "If true, periodically commit to ZooKeeper the offset of messages already fetched by the consumer";
    public static final Boolean CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DEFAULT = true;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.allowManualCommit";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DOC = "Whether to allow doing manual commits";
    public static final Boolean CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DEFAULT = false;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_ON_ERROR_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.pollOnError";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_ON_ERROR_DOC = "What to do if kafka threw an exception while polling for new messages. There are 5 enums and the value can be one of DISCARD, ERROR_HANDLER, RECONNECT, RETRY, STOP";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_ON_ERROR_DEFAULT = "ERROR_HANDLER";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_OFFSET_RESET_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.autoOffsetReset";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_OFFSET_RESET_DOC = "What to do when there is no initial offset. There are 3 enums and the value can be one of latest, earliest, none";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_OFFSET_RESET_DEFAULT = "latest";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_CONSUMER_GROUP_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.consumerGroup";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_CONSUMER_GROUP_DOC = "A string that uniquely identifies the group of consumers to which this source belongs Example: my-group-id";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_CONSUMER_GROUP_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_DESERIALIZE_HEADERS_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.deserializeHeaders";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_DESERIALIZE_HEADERS_DOC = "When enabled the Kamelet source will deserialize all message headers to String representation.";
    public static final Boolean CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_DESERIALIZE_HEADERS_DEFAULT = true;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_VALUE_DESERIALIZER_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.valueDeserializer";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_VALUE_DESERIALIZER_DOC = "Deserializer class for value that implements the Deserializer interface.";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_VALUE_DESERIALIZER_DEFAULT = "com.microsoft.azure.schemaregistry.kafka.avro.KafkaAvroDeserializer";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AZURE_REGISTRY_URL_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.azureRegistryUrl";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AZURE_REGISTRY_URL_DOC = "The Apicurio Schema Registry URL";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AZURE_REGISTRY_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SPECIFIC_AVRO_VALUE_TYPE_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.specificAvroValueType";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SPECIFIC_AVRO_VALUE_TYPE_DOC = "The Specific Type Avro will have to deal with Example: com.example.Order";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SPECIFIC_AVRO_VALUE_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCH_SIZE_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.batchSize";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCH_SIZE_DOC = "The maximum number of records returned in a single call to poll()";
    public static final Integer CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCH_SIZE_DEFAULT = 500;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_TIMEOUT_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.pollTimeout";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_TIMEOUT_DOC = "The timeout used when polling the KafkaConsumer";
    public static final Integer CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_MAX_POLL_INTERVAL_MS_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.maxPollIntervalMs";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_MAX_POLL_INTERVAL_MS_DOC = "The maximum delay between invocations of poll() when using consumer group management";
    public static final Integer CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_MAX_POLL_INTERVAL_MS_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCHING_INTERVAL_MS_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.batchingIntervalMs";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCHING_INTERVAL_MS_DOC = "In consumer batching mode, then this option is specifying a time in millis, to trigger batch completion eager when the current batch size has not reached the maximum size defined by maxPollRecords. Notice the trigger is not exact at the given interval, as this can only happen between kafka polls (see pollTimeoutMs option).";
    public static final Integer CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCHING_INTERVAL_MS_DEFAULT = null;
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_IS_PATTERN_CONF = "camel.kamelet.kafka-batch-azure-schema-registry-source.topicIsPattern";
    public static final String CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_IS_PATTERN_DOC = "Whether the topic is a pattern (regular expression). This can be used to subscribe to dynamic number of topics matching the pattern.";
    public static final Boolean CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_IS_PATTERN_DEFAULT = false;

    public CamelKafkabatchazureschemaregistrysourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelKafkabatchazureschemaregistrysourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BOOTSTRAP_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BOOTSTRAP_SERVERS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BOOTSTRAP_SERVERS_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SECURITY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SECURITY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SECURITY_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SASL_MECHANISM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SASL_MECHANISM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SASL_MECHANISM_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_COMMIT_ENABLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_COMMIT_ENABLE_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_ALLOW_MANUAL_COMMIT_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_ON_ERROR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_OFFSET_RESET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_OFFSET_RESET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AUTO_OFFSET_RESET_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_CONSUMER_GROUP_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_CONSUMER_GROUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_CONSUMER_GROUP_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_DESERIALIZE_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_DESERIALIZE_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_DESERIALIZE_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_VALUE_DESERIALIZER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_VALUE_DESERIALIZER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_VALUE_DESERIALIZER_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AZURE_REGISTRY_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AZURE_REGISTRY_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_AZURE_REGISTRY_URL_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SPECIFIC_AVRO_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SPECIFIC_AVRO_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_SPECIFIC_AVRO_VALUE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCH_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCH_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCH_SIZE_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_POLL_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_MAX_POLL_INTERVAL_MS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_MAX_POLL_INTERVAL_MS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_MAX_POLL_INTERVAL_MS_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCHING_INTERVAL_MS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCHING_INTERVAL_MS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_BATCHING_INTERVAL_MS_DOC);
        conf.define(CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_IS_PATTERN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_IS_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KAFKABATCHAZURESCHEMAREGISTRYSOURCE_KAMELET_TOPIC_IS_PATTERN_DOC);
        return conf;
    }
}