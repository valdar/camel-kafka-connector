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
package org.apache.camel.kafkaconnector.cxfrs;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCxfrsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_CXFRS_PATH_BEAN_ID_CONF = "camel.sink.path.beanId";
    public static final String CAMEL_SINK_CXFRS_PATH_BEAN_ID_DOC = "To lookup an existing configured CxfRsEndpoint. Must used bean: as prefix.";
    public static final String CAMEL_SINK_CXFRS_PATH_BEAN_ID_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_PATH_ADDRESS_CONF = "camel.sink.path.address";
    public static final String CAMEL_SINK_CXFRS_PATH_ADDRESS_DOC = "The service publish address.";
    public static final String CAMEL_SINK_CXFRS_PATH_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_FEATURES_CONF = "camel.sink.endpoint.features";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_FEATURES_DOC = "Set the feature list to the CxfRs endpoint.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_FEATURES_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_MODEL_REF_CONF = "camel.sink.endpoint.modelRef";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_MODEL_REF_DOC = "This option is used to specify the model file which is useful for the resource class without annotation. When using this option, then the service class can be omitted, to emulate document-only endpoints";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_MODEL_REF_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PROVIDERS_CONF = "camel.sink.endpoint.providers";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PROVIDERS_DOC = "Set custom JAX-RS provider(s) list to the CxfRs endpoint. You can specify a string with a list of providers to lookup in the registy separated by comma.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PROVIDERS_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_RESOURCE_CLASSES_CONF = "camel.sink.endpoint.resourceClasses";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_RESOURCE_CLASSES_DOC = "The resource classes which you want to export as REST service. Multiple classes can be separated by comma.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_RESOURCE_CLASSES_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_CONF = "camel.sink.endpoint.schemaLocations";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DOC = "Sets the locations of the schema(s) which can be used to validate the incoming XML or JAXB-driven JSON.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_CONF = "camel.sink.endpoint.skipFaultLogging";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DOC = "This option controls whether the PhaseInterceptorChain skips logging the Fault that it catches.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_COOKIE_HANDLER_CONF = "camel.sink.endpoint.cookieHandler";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_COOKIE_HANDLER_DOC = "Configure a cookie handler to maintain a HTTP session";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_COOKIE_HANDLER_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HOSTNAME_VERIFIER_CONF = "camel.sink.endpoint.hostnameVerifier";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HOSTNAME_VERIFIER_DOC = "The hostname verifier to be used. Use the # notation to reference a HostnameVerifier from the registry.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HOSTNAME_VERIFIER_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "The Camel SSL setting reference. Use the # notation to reference the SSL Context.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF = "camel.sink.endpoint.throwExceptionOnFailure";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC = "This option tells the CxfRsProducer to inspect return codes and will generate an Exception if the return code is larger than 207.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT = true;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HTTP_CLIENT_APICONF = "camel.sink.endpoint.httpClientAPI";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HTTP_CLIENT_APIDOC = "If it is true, the CxfRsProducer will use the HttpClientAPI to invoke the service. If it is false, the CxfRsProducer will use the ProxyClientAPI to invoke the service";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_HTTP_CLIENT_APIDEFAULT = true;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_IGNORE_DELETE_METHOD_MESSAGE_BODY_CONF = "camel.sink.endpoint.ignoreDeleteMethodMessageBody";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_IGNORE_DELETE_METHOD_MESSAGE_BODY_DOC = "This option is used to tell CxfRsProducer to ignore the message body of the DELETE method when using HTTP API.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_IGNORE_DELETE_METHOD_MESSAGE_BODY_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_MAX_CLIENT_CACHE_SIZE_CONF = "camel.sink.endpoint.maxClientCacheSize";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_MAX_CLIENT_CACHE_SIZE_DOC = "This option allows you to configure the maximum size of the cache. The implementation caches CXF clients or ClientFactoryBean in CxfProvider and CxfRsProvider.";
    public static final Integer CAMEL_SINK_CXFRS_ENDPOINT_MAX_CLIENT_CACHE_SIZE_DEFAULT = 10;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_BINDING_CONF = "camel.sink.endpoint.binding";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_BINDING_DOC = "To use a custom CxfBinding to control the binding between Camel Message and CXF Message.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_BUS_CONF = "camel.sink.endpoint.bus";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_BUS_DOC = "To use a custom configured CXF Bus.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_BUS_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_CONF = "camel.sink.endpoint.continuationTimeout";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DOC = "This option is used to set the CXF continuation timeout which could be used in CxfConsumer by default when the CXF server is using Jetty or Servlet transport.";
    public static final Long CAMEL_SINK_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DEFAULT = 30000L;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_CONF = "camel.sink.endpoint.cxfRsConfigurer";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DOC = "This option could apply the implementation of org.apache.camel.component.cxf.jaxrs.CxfRsEndpointConfigurer which supports to configure the CXF endpoint in programmatic way. User can configure the CXF server and client by implementing configure{Server/Client} method of CxfEndpointConfigurer.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_DEFAULT_BUS_CONF = "camel.sink.endpoint.defaultBus";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_DEFAULT_BUS_DOC = "Will set the default bus when CXF endpoint create a bus by itself";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_DEFAULT_BUS_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PERFORM_INVOCATION_CONF = "camel.sink.endpoint.performInvocation";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PERFORM_INVOCATION_DOC = "When the option is true, Camel will perform the invocation of the resource class instance and put the response object into the exchange for further processing.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_PERFORM_INVOCATION_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_CONF = "camel.sink.endpoint.propagateContexts";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DOC = "When the option is true, JAXRS UriInfo, HttpHeaders, Request and SecurityContext contexts will be available to custom CXFRS processors as typed Camel exchange properties. These contexts can be used to analyze the current requests using JAX-RS API.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_CONF = "camel.sink.endpoint.loggingFeatureEnabled";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DOC = "This option enables CXF Logging Feature which writes inbound and outbound REST messages to log.";
    public static final Boolean CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_CONF = "camel.sink.endpoint.loggingSizeLimit";
    public static final String CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DOC = "To limit the total size of number of bytes the logger will output when logging feature has been enabled and -1 for no limit.";
    public static final Integer CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DEFAULT = 49152;
    public static final String CAMEL_SINK_CXFRS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.cxfrs.lazyStartProducer";
    public static final String CAMEL_SINK_CXFRS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CXFRS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_COMPONENT_SYNCHRONOUS_CONF = "camel.component.cxfrs.synchronous";
    public static final String CAMEL_SINK_CXFRS_COMPONENT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used";
    public static final Boolean CAMEL_SINK_CXFRS_COMPONENT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CXFRS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.cxfrs.autowiredEnabled";
    public static final String CAMEL_SINK_CXFRS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_CXFRS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.cxfrs.headerFilterStrategy";
    public static final String CAMEL_SINK_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.cxfrs.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelCxfrsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCxfrsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_CXFRS_PATH_BEAN_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_PATH_BEAN_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_PATH_BEAN_ID_DOC);
        conf.define(CAMEL_SINK_CXFRS_PATH_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_PATH_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_PATH_ADDRESS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_FEATURES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_FEATURES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_FEATURES_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_MODEL_REF_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_MODEL_REF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_MODEL_REF_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_PROVIDERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_PROVIDERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_PROVIDERS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_RESOURCE_CLASSES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_RESOURCE_CLASSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_RESOURCE_CLASSES_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_SCHEMA_LOCATIONS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_SKIP_FAULT_LOGGING_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_COOKIE_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_COOKIE_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_COOKIE_HANDLER_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_HOSTNAME_VERIFIER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_HOSTNAME_VERIFIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_HOSTNAME_VERIFIER_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_HTTP_CLIENT_APICONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_HTTP_CLIENT_APIDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_HTTP_CLIENT_APIDOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_IGNORE_DELETE_METHOD_MESSAGE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_IGNORE_DELETE_METHOD_MESSAGE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_IGNORE_DELETE_METHOD_MESSAGE_BODY_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_MAX_CLIENT_CACHE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_CXFRS_ENDPOINT_MAX_CLIENT_CACHE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_MAX_CLIENT_CACHE_SIZE_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_BINDING_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_BUS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_BUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_BUS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_CONTINUATION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_CXF_RS_CONFIGURER_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_DEFAULT_BUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_DEFAULT_BUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_DEFAULT_BUS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_PERFORM_INVOCATION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_PERFORM_INVOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_PERFORM_INVOCATION_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_PROPAGATE_CONTEXTS_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_FEATURE_ENABLED_DOC);
        conf.define(CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_CONF, ConfigDef.Type.INT, CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_ENDPOINT_LOGGING_SIZE_LIMIT_DOC);
        conf.define(CAMEL_SINK_CXFRS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CXFRS_COMPONENT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_COMPONENT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_COMPONENT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CXFRS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CXFRS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}