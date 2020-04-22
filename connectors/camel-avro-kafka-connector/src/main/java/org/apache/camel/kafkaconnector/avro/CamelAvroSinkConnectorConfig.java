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
package org.apache.camel.kafkaconnector.avro;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAvroSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AVRO_PATH_TRANSPORT_CONF = "camel.sink.path.transport";
    public static final String CAMEL_SINK_AVRO_PATH_TRANSPORT_DOC = "Transport to use, can be either http or netty One of: [http] [netty]";
    public static final String CAMEL_SINK_AVRO_PATH_TRANSPORT_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_AVRO_PATH_PORT_DOC = "Port number to use";
    public static final Integer CAMEL_SINK_AVRO_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_AVRO_PATH_HOST_DOC = "Hostname to use";
    public static final String CAMEL_SINK_AVRO_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_PATH_MESSAGE_NAME_CONF = "camel.sink.path.messageName";
    public static final String CAMEL_SINK_AVRO_PATH_MESSAGE_NAME_DOC = "The name of the message to send.";
    public static final String CAMEL_SINK_AVRO_PATH_MESSAGE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CONF = "camel.sink.endpoint.protocol";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_DOC = "Avro protocol to use";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_CONF = "camel.sink.endpoint.protocolClassName";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DOC = "Avro protocol to use defined by the FQN class name";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_LOCATION_CONF = "camel.sink.endpoint.protocolLocation";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_LOCATION_DOC = "Avro protocol location";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_LOCATION_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_REFLECTION_PROTOCOL_CONF = "camel.sink.endpoint.reflectionProtocol";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DOC = "If protocol object provided is reflection protocol. Should be used only with protocol parameter because for protocolClassName protocol type will be auto detected";
    public static final Boolean CAMEL_SINK_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_SINGLE_PARAMETER_CONF = "camel.sink.endpoint.singleParameter";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_SINGLE_PARAMETER_DOC = "If true, consumer parameter won't be wrapped into array. Will fail if protocol specifies more then 1 parameter for the message";
    public static final Boolean CAMEL_SINK_AVRO_ENDPOINT_SINGLE_PARAMETER_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_URI_AUTHORITY_CONF = "camel.sink.endpoint.uriAuthority";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_URI_AUTHORITY_DOC = "Authority to use (username and password)";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_URI_AUTHORITY_DEFAULT = null;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AVRO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AVRO_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AVRO_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.avro.lazyStartProducer";
    public static final String CAMEL_SINK_AVRO_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AVRO_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.avro.basicPropertyBinding";
    public static final String CAMEL_SINK_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AVRO_COMPONENT_CONFIGURATION_CONF = "camel.component.avro.configuration";
    public static final String CAMEL_SINK_AVRO_COMPONENT_CONFIGURATION_DOC = "To use a shared AvroConfiguration to configure options once";
    public static final String CAMEL_SINK_AVRO_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelAvroSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAvroSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AVRO_PATH_TRANSPORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_PATH_TRANSPORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AVRO_PATH_TRANSPORT_DOC);
        conf.define(CAMEL_SINK_AVRO_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_AVRO_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AVRO_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_AVRO_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AVRO_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_AVRO_PATH_MESSAGE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_PATH_MESSAGE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_PATH_MESSAGE_NAME_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_PROTOCOL_LOCATION_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_REFLECTION_PROTOCOL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_SINGLE_PARAMETER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_ENDPOINT_SINGLE_PARAMETER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_SINGLE_PARAMETER_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_URI_AUTHORITY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_ENDPOINT_URI_AUTHORITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_URI_AUTHORITY_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AVRO_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AVRO_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AVRO_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AVRO_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AVRO_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}