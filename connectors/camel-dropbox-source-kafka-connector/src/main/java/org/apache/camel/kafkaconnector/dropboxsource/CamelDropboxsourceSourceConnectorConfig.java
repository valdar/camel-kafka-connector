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
package org.apache.camel.kafkaconnector.dropboxsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDropboxsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_PERIOD_CONF = "camel.kamelet.dropbox-source.period";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_PERIOD_DOC = "The interval between fetches to the Dropbox remote path in milliseconds";
    public static final Integer CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_PERIOD_DEFAULT = 10000;
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_ACCESS_TOKEN_CONF = "camel.kamelet.dropbox-source.accessToken";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_ACCESS_TOKEN_DOC = "The access Token to use to access Dropbox";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_CLIENT_IDENTIFIER_CONF = "camel.kamelet.dropbox-source.clientIdentifier";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_CLIENT_IDENTIFIER_DOC = "Dropbox App client Identifier";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_CLIENT_IDENTIFIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_REMOTE_PATH_CONF = "camel.kamelet.dropbox-source.remotePath";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_REMOTE_PATH_DOC = "Original file or folder to work with";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_REMOTE_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_QUERY_CONF = "camel.kamelet.dropbox-source.query";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_QUERY_DOC = "A space-separated list of sub-strings to search for. A file matches only if it contains all the sub-strings. If this option is not set, all files will be matched.";
    public static final String CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_QUERY_DEFAULT = null;

    public CamelDropboxsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDropboxsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_PERIOD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_PERIOD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_PERIOD_DOC);
        conf.define(CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_CLIENT_IDENTIFIER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_CLIENT_IDENTIFIER_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_CLIENT_IDENTIFIER_DOC);
        conf.define(CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_REMOTE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_REMOTE_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_REMOTE_PATH_DOC);
        conf.define(CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_QUERY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DROPBOXSOURCE_KAMELET_QUERY_DOC);
        return conf;
    }
}