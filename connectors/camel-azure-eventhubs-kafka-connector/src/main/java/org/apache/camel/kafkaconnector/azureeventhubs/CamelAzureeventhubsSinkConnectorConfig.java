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
package org.apache.camel.kafkaconnector.azureeventhubs;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzureeventhubsSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AZUREEVENTHUBS_PATH_NAMESPACE_CONF = "camel.sink.path.namespace";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_PATH_NAMESPACE_DOC = "EventHubs namespace created in Azure Portal";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_PATH_NAMESPACE_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_PATH_EVENT_HUB_NAME_CONF = "camel.sink.path.eventHubName";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_PATH_EVENT_HUB_NAME_DOC = "EventHubs name under a specific namcespace";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_PATH_EVENT_HUB_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_RETRY_OPTIONS_CONF = "camel.sink.endpoint.amqpRetryOptions";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_RETRY_OPTIONS_DOC = "Sets the retry policy for EventHubAsyncClient. If not specified, the default retry options are used.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_RETRY_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_TRANSPORT_TYPE_CONF = "camel.sink.endpoint.amqpTransportType";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_TRANSPORT_TYPE_DOC = "Sets the transport type by which all the communication with Azure Event Hubs occurs. Default value is AmqpTransportType#AMQP. One of: [Amqp] [AmqpWebSockets]";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_TRANSPORT_TYPE_DEFAULT = "AMQP";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AUTO_DISCOVER_CLIENT_CONF = "camel.sink.endpoint.autoDiscoverClient";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AUTO_DISCOVER_CLIENT_DOC = "Setting the autoDiscoverClient mechanism, if true, the component will look for a client instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AUTO_DISCOVER_CLIENT_DEFAULT = true;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_ID_CONF = "camel.sink.endpoint.partitionId";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_ID_DOC = "Sets the identifier of the Event Hub partition that the events will be sent to. If the identifier is not specified, the Event Hubs service will be responsible for routing events that are sent to an available partition.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_KEY_CONF = "camel.sink.endpoint.partitionKey";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_KEY_DOC = "Sets a hashing key to be provided for the batch of events, which instructs the Event Hubs service to map this key to a specific partition. The selection of a partition is stable for a given partition hashing key. Should any other batches of events be sent using the same exact partition hashing key, the Event Hubs service will route them all to the same partition. This should be specified only when there is a need to group events by partition, but there is flexibility into which partition they are routed. If ensuring that a batch of events is sent only to a specific partition, it is recommended that the {link #setPartitionId(String) identifier of the position be specified directly} when sending the batch.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PRODUCER_ASYNC_CLIENT_CONF = "camel.sink.endpoint.producerAsyncClient";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PRODUCER_ASYNC_CLIENT_DOC = "Sets the EventHubProducerAsyncClient.An asynchronous producer responsible for transmitting EventData to a specific Event Hub, grouped together in batches. Depending on the options specified when creating an {linkEventDataBatch}, the events may be automatically routed to an available partition or specific to a partition. Use by this component to produce the data in camel producer.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PRODUCER_ASYNC_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_CONNECTION_STRING_CONF = "camel.sink.endpoint.connectionString";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_CONNECTION_STRING_DOC = "Instead of supplying namespace, sharedAccessKey, sharedAccessName ... etc, you can just supply the connection string for your eventHub. The connection string for EventHubs already include all the necessary information to connection to your EventHub. To learn on how to generate the connection string, take a look at this documentation: https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_CONNECTION_STRING_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_KEY_CONF = "camel.sink.endpoint.sharedAccessKey";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_KEY_DOC = "The generated value for the SharedAccessName";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_NAME_CONF = "camel.sink.endpoint.sharedAccessName";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_NAME_DOC = "The name you chose for your EventHubs SAS keys";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_RETRY_OPTIONS_CONF = "camel.component.azure-eventhubs.amqpRetryOptions";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_RETRY_OPTIONS_DOC = "Sets the retry policy for EventHubAsyncClient. If not specified, the default retry options are used.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_RETRY_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_TRANSPORT_TYPE_CONF = "camel.component.azure-eventhubs.amqpTransportType";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_TRANSPORT_TYPE_DOC = "Sets the transport type by which all the communication with Azure Event Hubs occurs. Default value is AmqpTransportType#AMQP. One of: [Amqp] [AmqpWebSockets]";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_TRANSPORT_TYPE_DEFAULT = "AMQP";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTO_DISCOVER_CLIENT_CONF = "camel.component.azure-eventhubs.autoDiscoverClient";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTO_DISCOVER_CLIENT_DOC = "Setting the autoDiscoverClient mechanism, if true, the component will look for a client instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTO_DISCOVER_CLIENT_DEFAULT = true;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONFIGURATION_CONF = "camel.component.azure-eventhubs.configuration";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONFIGURATION_DOC = "The component configurations";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.azure-eventhubs.lazyStartProducer";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_ID_CONF = "camel.component.azure-eventhubs.partitionId";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_ID_DOC = "Sets the identifier of the Event Hub partition that the events will be sent to. If the identifier is not specified, the Event Hubs service will be responsible for routing events that are sent to an available partition.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_KEY_CONF = "camel.component.azure-eventhubs.partitionKey";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_KEY_DOC = "Sets a hashing key to be provided for the batch of events, which instructs the Event Hubs service to map this key to a specific partition. The selection of a partition is stable for a given partition hashing key. Should any other batches of events be sent using the same exact partition hashing key, the Event Hubs service will route them all to the same partition. This should be specified only when there is a need to group events by partition, but there is flexibility into which partition they are routed. If ensuring that a batch of events is sent only to a specific partition, it is recommended that the {link #setPartitionId(String) identifier of the position be specified directly} when sending the batch.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PRODUCER_ASYNC_CLIENT_CONF = "camel.component.azure-eventhubs.producerAsyncClient";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PRODUCER_ASYNC_CLIENT_DOC = "Sets the EventHubProducerAsyncClient.An asynchronous producer responsible for transmitting EventData to a specific Event Hub, grouped together in batches. Depending on the options specified when creating an {linkEventDataBatch}, the events may be automatically routed to an available partition or specific to a partition. Use by this component to produce the data in camel producer.";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PRODUCER_ASYNC_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.azure-eventhubs.autowiredEnabled";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONNECTION_STRING_CONF = "camel.component.azure-eventhubs.connectionString";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONNECTION_STRING_DOC = "Instead of supplying namespace, sharedAccessKey, sharedAccessName ... etc, you can just supply the connection string for your eventHub. The connection string for EventHubs already include all the necessary information to connection to your EventHub. To learn on how to generate the connection string, take a look at this documentation: https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONNECTION_STRING_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_KEY_CONF = "camel.component.azure-eventhubs.sharedAccessKey";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_KEY_DOC = "The generated value for the SharedAccessName";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_NAME_CONF = "camel.component.azure-eventhubs.sharedAccessName";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_NAME_DOC = "The name you chose for your EventHubs SAS keys";
    public static final String CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_NAME_DEFAULT = null;

    public CamelAzureeventhubsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzureeventhubsSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_PATH_NAMESPACE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_PATH_NAMESPACE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_PATH_NAMESPACE_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_PATH_EVENT_HUB_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_PATH_EVENT_HUB_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_PATH_EVENT_HUB_NAME_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_RETRY_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_RETRY_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_RETRY_OPTIONS_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_TRANSPORT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_TRANSPORT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AMQP_TRANSPORT_TYPE_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AUTO_DISCOVER_CLIENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AUTO_DISCOVER_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_AUTO_DISCOVER_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_ID_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PARTITION_KEY_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PRODUCER_ASYNC_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PRODUCER_ASYNC_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_PRODUCER_ASYNC_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_CONNECTION_STRING_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_CONNECTION_STRING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_CONNECTION_STRING_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_ENDPOINT_SHARED_ACCESS_NAME_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_RETRY_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_RETRY_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_RETRY_OPTIONS_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_TRANSPORT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_TRANSPORT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AMQP_TRANSPORT_TYPE_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTO_DISCOVER_CLIENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTO_DISCOVER_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTO_DISCOVER_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_ID_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PARTITION_KEY_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PRODUCER_ASYNC_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PRODUCER_ASYNC_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_PRODUCER_ASYNC_CLIENT_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONNECTION_STRING_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONNECTION_STRING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_CONNECTION_STRING_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AZUREEVENTHUBS_COMPONENT_SHARED_ACCESS_NAME_DOC);
        return conf;
    }
}