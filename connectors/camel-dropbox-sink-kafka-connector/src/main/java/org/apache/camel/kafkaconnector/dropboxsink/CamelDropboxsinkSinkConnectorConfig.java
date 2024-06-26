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
package org.apache.camel.kafkaconnector.dropboxsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDropboxsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_ACCESS_TOKEN_CONF = "camel.kamelet.dropbox-sink.accessToken";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_ACCESS_TOKEN_DOC = "The access Token to use to access Dropbox";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_CLIENT_IDENTIFIER_CONF = "camel.kamelet.dropbox-sink.clientIdentifier";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_CLIENT_IDENTIFIER_DOC = "Dropbox App client Identifier";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_CLIENT_IDENTIFIER_DEFAULT = null;
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_REMOTE_PATH_CONF = "camel.kamelet.dropbox-sink.remotePath";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_REMOTE_PATH_DOC = "Original file or folder to work with";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_REMOTE_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_UPLOAD_MODE_CONF = "camel.kamelet.dropbox-sink.uploadMode";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_UPLOAD_MODE_DOC = "Which mode to upload. in case of add the new file will be renamed if a file with the same name already exists on dropbox. in case of force if a file with the same name already exists on dropbox, this will be overwritten. The value can be one of add, force.";
    public static final String CAMEL_SINK_DROPBOXSINK_KAMELET_UPLOAD_MODE_DEFAULT = "add";

    public CamelDropboxsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDropboxsinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_DROPBOXSINK_KAMELET_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_DROPBOXSINK_KAMELET_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DROPBOXSINK_KAMELET_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SINK_DROPBOXSINK_KAMELET_CLIENT_IDENTIFIER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DROPBOXSINK_KAMELET_CLIENT_IDENTIFIER_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DROPBOXSINK_KAMELET_CLIENT_IDENTIFIER_DOC);
        conf.define(CAMEL_SINK_DROPBOXSINK_KAMELET_REMOTE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DROPBOXSINK_KAMELET_REMOTE_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DROPBOXSINK_KAMELET_REMOTE_PATH_DOC);
        conf.define(CAMEL_SINK_DROPBOXSINK_KAMELET_UPLOAD_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DROPBOXSINK_KAMELET_UPLOAD_MODE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DROPBOXSINK_KAMELET_UPLOAD_MODE_DOC);
        return conf;
    }
}