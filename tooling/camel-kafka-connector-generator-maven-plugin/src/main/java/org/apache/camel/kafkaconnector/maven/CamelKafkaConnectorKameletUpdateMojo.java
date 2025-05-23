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
package org.apache.camel.kafkaconnector.maven;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.annotation.Generated;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import org.xml.sax.SAXException;

import freemarker.template.Template;
import org.apache.camel.kafkaconnector.maven.model.KameletModel;
import org.apache.camel.kafkaconnector.maven.model.KameletPropertyModel;
import org.apache.camel.kafkaconnector.maven.utils.JsonMapperKafkaConnector;
import org.apache.camel.kafkaconnector.maven.utils.MavenUtils;
import org.apache.camel.kafkaconnector.maven.utils.YamlKameletMapper;
import org.apache.camel.kafkaconnector.model.CamelKafkaConnectorModel;
import org.apache.camel.kafkaconnector.model.CamelKafkaConnectorOptionModel;
import org.apache.camel.tooling.util.Strings;
import org.apache.camel.tooling.util.srcgen.JavaClass;
import org.apache.camel.tooling.util.srcgen.Method;
import org.apache.camel.util.TimeUtils;
import org.apache.camel.util.json.JsonObject;
import org.apache.camel.util.json.Jsoner;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.apache.commons.lang3.StringUtils;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.codehaus.plexus.resource.loader.FileResourceCreationException;
import org.codehaus.plexus.resource.loader.ResourceNotFoundException;
import org.mvel2.templates.TemplateRuntime;

import static org.apache.camel.kafkaconnector.maven.utils.MavenUtils.sanitizeMavenArtifactId;
import static org.apache.camel.kafkaconnector.maven.utils.MavenUtils.writeFileIfChanged;
import static org.apache.camel.kafkaconnector.maven.utils.MavenUtils.writeXmlFormatted;
import static org.apache.camel.tooling.util.PackageHelper.loadText;
import static org.apache.camel.tooling.util.PackageHelper.writeText;

/**
 * Generate Camel Kafka Connector for the kamelet
 */
@Mojo(name = "camel-kafka-connector-kamelet-update", threadSafe = true,
requiresDependencyCollection = ResolutionScope.COMPILE_PLUS_RUNTIME, 
requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME, 
defaultPhase = LifecyclePhase.GENERATE_RESOURCES)
public class CamelKafkaConnectorKameletUpdateMojo extends AbstractCamelKameletKafkaConnectorMojo {

    private static final String GENERATED_SECTION_START = "START OF GENERATED CODE";
    private static final String GENERATED_SECTION_START_COMMENT = "<!--" + GENERATED_SECTION_START + "-->";
    private static final String GENERATED_SECTION_END = "END OF GENERATED CODE";
    private static final String GENERATED_SECTION_END_COMMENT = "<!--" + GENERATED_SECTION_END + "-->";

    private static final String EXCLUDE_DEPENDENCY_PROPERTY_PREFIX = "exclude_";

    private static final String ADDITIONAL_COMMON_PROPERTIES_PROPERTY_PREFIX = "additional_properties_";
    private static final String XML_FEATURES_DISALLOW_DOCTYPE_DECL = "http://apache.org/xml/features/disallow-doctype-decl";

    private static final Map<String, Class<?>> PRIMITIVE_TYPES_TO_CLASS_MAP;
    private static final Map<String, String> PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP;

    private static final Map<String, String> RESERVED_WORDS_SUBSTITUTION_MAP;

    private static final String CONFIG_DEF_TYPE_STRING = "ConfigDef.Type.STRING";
    private static final String CONFIG_DEF_TYPE_PASSWORD = "ConfigDef.Type.PASSWORD";
    private static final String CONFIG_DEF_IMPORTANCE_LOW = "ConfigDef.Importance.LOW";
    private static final String CONFIG_DEF_IMPORTANCE_MEDIUM = "ConfigDef.Importance.MEDIUM";
    private static final String CONFIG_DEF_IMPORTANCE_HIGH = "ConfigDef.Importance.HIGH";
    private static final String CONFIG_DEF_IMPORTANCE_PREFIX = "ConfigDef.Importance.";

    static {
        PRIMITIVE_TYPES_TO_CLASS_MAP = new HashMap<>();
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("boolean", Boolean.class);
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("long", Long.class);
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("int", Integer.class);
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("integer", Integer.class);
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("short", Short.class);
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("double", Double.class);
        PRIMITIVE_TYPES_TO_CLASS_MAP.put("float", Float.class);

        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP = new HashMap<>();
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("boolean", "ConfigDef.Type.BOOLEAN");
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("long", "ConfigDef.Type.LONG");
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("int", "ConfigDef.Type.INT");
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("integer", "ConfigDef.Type.INT");
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("short", "ConfigDef.Type.SHORT");
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("double", "ConfigDef.Type.DOUBLE");
        PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.put("float", "ConfigDef.Type.DOUBLE");

        RESERVED_WORDS_SUBSTITUTION_MAP = new HashMap<>();
        RESERVED_WORDS_SUBSTITUTION_MAP.put("class", "clazz");
    }

    protected DynamicClassLoader projectClassLoader;

    @Parameter(property = "name", required = true)
    protected String name;

    @Parameter(property = "kameletYaml", required = true)
    protected String kameletYaml;

    /**
     * The maven session.
     */
    @Parameter(defaultValue = "${session}", readonly = true)
    private MavenSession session;

    /**
     * A comma separated list of column separated GAV to include as dependencies
     * to the generated camel kafka connector. (i.e.
     * groupId:ArtifactId:version,groupId_2:ArtifactId_2:version_2)
     */
    @Parameter(defaultValue = "", readonly = true)
    private String additionalDependencies;

    @Override
    protected String getMainDepArtifactId() {
        return "camel-" + name;
    }

    @Override
    protected void executeAll() throws MojoFailureException {
        if (name == null || name.isEmpty()) {
            throw new MojoFailureException("Connector name must be specified as the parameter");
        }
        if (name.startsWith("camel-")) {
            name = name.substring("camel-".length());
        }
        if (name.endsWith(KAFKA_CONNECTORS_SUFFIX)) {
            name = name.substring(0, name.length() - KAFKA_CONNECTORS_SUFFIX.length());
        }
        try {
            updateConnector();
        } catch (Exception e) {
            throw new MojoFailureException("Fail to update connector " + name, e);
        }
    }

    protected DynamicClassLoader getProjectClassLoader() {
        if (projectClassLoader == null) {
            final List<String> classpathElements;
            try {
                classpathElements = project.getTestClasspathElements();
            } catch (org.apache.maven.artifact.DependencyResolutionRequiredException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
            projectClassLoader = DynamicClassLoader.createDynamicClassLoader(classpathElements);
        }
        return projectClassLoader;
    }

    private void updateConnector() throws Exception {
        KameletModel kamelet = YamlKameletMapper.parseKameletYaml(kameletYaml);
        String sanitizedName = sanitizeMavenArtifactId(name);
        // create the connector directory
        File connectorDir = new File(projectDir,  "camel-" + sanitizedName + KAFKA_CONNECTORS_SUFFIX);
        if (!connectorDir.exists() || !connectorDir.isDirectory()) {
            getLog().info("Connector " + name + " can not be updated since directory " + connectorDir.getAbsolutePath() + " dose not exist or is not a directory (maybe use camel-kafka-connector-kamelet-create first).");
            throw new MojoFailureException("Directory dose not already exists or is not a directory: " + connectorDir);
        }

        // create the base pom.xml
        Document pom = createBasePom(connectorDir);

        // Apply changes to the connector pomDocument pom
        Set<String> dependencies = new HashSet<>();
        dependencies.addAll(getKameletDependencies(kamelet));
        dependencies.addAll(getAdditionalDependencies(additionalDependencies));
        if (!dependencies.isEmpty()) {
            getLog().debug("The following dependencies will be added to the connector: " + dependencies);
            MavenUtils.addDependencies(pom, dependencies, GENERATED_SECTION_START, GENERATED_SECTION_END);
        }
        fixAdditionalRepositories(pom);

        // Write the connector pom
        File pomFile = new File(connectorDir, "pom.xml");
        writeXmlFormatted(pom, pomFile, getLog());

        // write package
        Document pkg = createPackageFile();
        File pkgFile = new File(connectorDir, "src/main/assembly/package.xml");
        writeXmlFormatted(pkg, pkgFile, getLog());

        // write LICENSE, USAGE
        writeStaticFiles(connectorDir);

        // write kamlete yaml file
        File docFolder = new File(connectorDir, "src/main/resources/kamelets");
        File docFile = new File(docFolder, name + ".kamelet.yaml");
        updateFile(docFile, kameletYaml);

        // generate classes
        String kameletType = kamelet.getType().toLowerCase();
        switch (kameletType) {
            case "source":
                createClassesAndDocumentation(sanitizedName, connectorDir, kamelet, ConnectorType.SOURCE);
                break;
            case "sink":
                createClassesAndDocumentation(sanitizedName, connectorDir, kamelet, ConnectorType.SINK);
                break;
            default:
                getLog().warn("Unsupported kamelet type: " + kameletType);
        }
    }

    private Set<String> getKameletDependencies(KameletModel kamelet) throws XPathExpressionException {
        Set<String> deps = new HashSet<>(kamelet.getDependencies());
        Set<String> gavDeps = deps.stream()
        .filter(stringDep -> stringDep != null && !stringDep.trim().isEmpty() && !"null".equals(stringDep.trim()))
        .map(stringDep -> {
            if (stringDep.startsWith("mvn:")) {
                return stringDep.replaceFirst("mvn:", "");
            } else if (stringDep.startsWith("camel:")) {
                return getMainDepGroupId() + ":" + stringDep.replaceFirst(":", "-");
            } else {
                String length = stringDep == null ?  "the string is null value" : Integer.toString(stringDep.length());
                getLog().warn("Dependency string: " + stringDep + " (length of the string is: " + length + ") is used as is. Might not be the intended behaviour!");
                return stringDep;
            }
        }).collect(Collectors.toSet());

        return gavDeps;
    }

    private Set<String> getAdditionalDependencies(String additionalDependencies) throws Exception {
        Properties properties = new Properties();

        try (InputStream stream = new FileInputStream(rm.getResourceAsFile(fixKameletDependenciesProperties))) {
            properties.load(stream);
        }

        Set<String> deps = new HashSet<>();
        deps.addAll(MavenUtils.csvToSet(properties.getProperty(getMainDepArtifactId())));
        deps.addAll(MavenUtils.csvToSet(additionalDependencies));

        Set<String> globalProps = MavenUtils.csvToSet(properties.getProperty("global"));
        boolean inGlobal = false;
        for (String gp : globalProps) {
            String camelGav = getMainDepGroupId() + ":" + getMainDepArtifactId();
            String camelKafkaConnectorGav = project.getGroupId() + ":" + project.getArtifactId();
            if (gp.equals(camelGav) || gp.equals(camelKafkaConnectorGav)) {
                inGlobal = true;
                break;
            }
        }

        if (!inGlobal) {
            // add global properties for all modules not in global properties
            deps.addAll(globalProps);
        }

        return deps;
    }

    private void fixAdditionalRepositories(Document pom) throws Exception {
        if (project.getFile() != null) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
            dbf.setFeature(XML_FEATURES_DISALLOW_DOCTYPE_DECL, true);
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document originalPom = builder.parse(project.getFile());

            XPath xpath = XPathFactory.newInstance().newXPath();
            Node repositories = (Node)xpath.compile("/project/repositories").evaluate(originalPom, XPathConstants.NODE);
            if (repositories != null) {
                pom.getDocumentElement().appendChild(pom.createComment(GENERATED_SECTION_START));
                pom.getDocumentElement().appendChild(pom.importNode(repositories, true));
                pom.getDocumentElement().appendChild(pom.createComment(GENERATED_SECTION_END));
            }
        } else {
            getLog().warn("Cannot access the project pom file to retrieve repositories");
        }
    }

    private Document createPackageFile() throws ResourceNotFoundException, FileResourceCreationException, IOException {
        getLog().info("Creating a new package.xml for the connector.");
        Template packageTemplate = MavenUtils.getTemplate(rm.getResourceAsFile(packageFileTemplate));
        Map<String, String> props = new HashMap<>();
        try {
            return MavenUtils.createCrateXmlDocumentFromTemplate(packageTemplate, props);
        } catch (Exception e) {
            getLog().error("Cannot create package.xml file from Template: " + packageTemplate + " with properties: " + props, e);
        }
        return null;
    }

    private Document createBasePom(File connectorDir) throws IOException, SAXException, ParserConfigurationException {
        File pomFile = new File(connectorDir, "pom.xml");
        if (pomFile.exists()) {
            try (InputStream in = new FileInputStream(pomFile)) {
                String content = IOUtils.toString(in, StandardCharsets.UTF_8);
                boolean editablePom = content.contains(GENERATED_SECTION_START_COMMENT);
                if (editablePom) {
                    content = MavenUtils.removeGeneratedSections(content, GENERATED_SECTION_START_COMMENT, GENERATED_SECTION_END_COMMENT, 10);
                    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

                    Document pom;
                    try (InputStream contentIn = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8))) {
                        pom = builder.parse(contentIn);
                    }

                    getLog().debug("Reusing the existing pom.xml for the connector");
                    return pom;
                } else {
                    getLog().error("Cannot use the existing pom.xml file since it is not editable. It does not contain " + GENERATED_SECTION_START_COMMENT);
                    throw new UnsupportedOperationException("Cannot use the existing pom.xml file since it is not editable. It does not contain "
                                                            + GENERATED_SECTION_START_COMMENT);
                }
            }
        } else {
            getLog().error("The pom.xml file is not present, please use camel-kafka-connector-kamelet-create first.");
            throw new UnsupportedOperationException("The pom.xml file is not present, please use camel-kafka-connector-kamelet-create first.");
        }
    }

    private void writeStaticFiles(File connectorDir) throws IOException, ResourceNotFoundException, FileResourceCreationException {
        String notice;
        String license;
        try (InputStream isNotice = new FileInputStream(rm.getResourceAsFile(noticeTemplate)); InputStream isLicense = new FileInputStream(rm.getResourceAsFile(licenseTemplate))) {
            notice = IOUtils.toString(isNotice, StandardCharsets.UTF_8);
            license = IOUtils.toString(isLicense, StandardCharsets.UTF_8);
        }

        writeFileIfChanged(notice, new File(connectorDir, "src/main/resources/META-INF/NOTICE.txt"), getLog());
        writeFileIfChanged(license, new File(connectorDir, "src/main/resources/META-INF/LICENSE.txt"), getLog());
    }

    private void createClassesAndDocumentation(String sanitizedName, File connectorDir, KameletModel kamelet, ConnectorType ct)
        throws MojoFailureException, ResourceNotFoundException, FileResourceCreationException, IOException, MojoExecutionException {
        String ctCapitalizedName = StringUtils.capitalize(ct.name().toLowerCase());
        String ctLowercaseName = ct.name().toLowerCase();
        String packageName = "org.apache.camel.kafkaconnector." + RESERVED_WORDS_SUBSTITUTION_MAP.getOrDefault(sanitizedName.replace("-", ""), sanitizedName.replace("-", ""));
        Map<String, String> additionalProperties = new HashMap<>();
        Properties properties = new Properties();

        try (InputStream stream = new FileInputStream(rm.getResourceAsFile(fixKameletDependenciesProperties))) {
            properties.load(stream);
        }

        String commonPropertyValue = properties.getProperty(ADDITIONAL_COMMON_PROPERTIES_PROPERTY_PREFIX + getMainDepArtifactId());
        getLog().debug("Additional common connector properties: " + commonPropertyValue);
        addProperties(additionalProperties, commonPropertyValue);
        String sourceOrSinkPropertyValue = properties.getProperty(ADDITIONAL_COMMON_PROPERTIES_PROPERTY_PREFIX + ctLowercaseName + "_" + getMainDepArtifactId());
        getLog().debug("Additional " + ctLowercaseName + " connector properties: " + sourceOrSinkPropertyValue);
        addProperties(additionalProperties, sourceOrSinkPropertyValue);

        // Camel{sanitizedName}{Sink,Source}ConnectorConfig.java
        String javaClassConnectorConfigName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig";
        final JavaClass javaClassConnectorConfig = new JavaClass(getProjectClassLoader());
        javaClassConnectorConfig.setPackage(packageName);
        javaClassConnectorConfig.setName(javaClassConnectorConfigName);
        javaClassConnectorConfig.addAnnotation(Generated.class)
            .setStringValue("value", "This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.");
        javaClassConnectorConfig.extendSuperType("Camel" + ctCapitalizedName + "ConnectorConfig");
        javaClassConnectorConfig.addImport("java.util.Map");
        javaClassConnectorConfig.addImport("org.apache.camel.kafkaconnector.Camel" + ctCapitalizedName + "ConnectorConfig");
        javaClassConnectorConfig.addImport("org.apache.kafka.common.config.ConfigDef");

        javaClassConnectorConfig.addMethod().setConstructor(true).setName(javaClassConnectorConfigName).addParameter("ConfigDef", "config")
            .addParameter("Map<String, String>", "parsedConfig").setPublic().setBody("super(config, parsedConfig);");
        javaClassConnectorConfig.addMethod().setConstructor(true).setName(javaClassConnectorConfigName).addParameter("Map<String, String>", "parsedConfig").setPublic()
            .setBody("this(conf(), parsedConfig);");

        Method confMethod = javaClassConnectorConfig.addMethod().setConstructor(false).setName("conf").setReturnType("ConfigDef").setPublic().setStatic()
            .setBody("ConfigDef conf = new ConfigDef(Camel" + ctCapitalizedName + "ConnectorConfig.conf());\n");

        // instantiate CamelKafkaConnectorOptionModel for further use during documentation generation
        List<CamelKafkaConnectorOptionModel> listOptions = new ArrayList<>();
        List<KameletPropertyModel> kameletProperties = kamelet.getProperties();
        kameletProperties.forEach(
            kameletProperty -> addConnectorOptions(sanitizedName, ct, javaClassConnectorConfig, confMethod, "KAMELET", kameletProperty, listOptions, kamelet.getRequiredProperties())
        );

        confMethod.setBody(confMethod.getBody() + "return conf;");

        String javaClassConnectorConfigFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorConfigName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnectorConfig, javaClassConnectorConfigFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

        // Camel{sanitizedName}{Sink,Source}Task.java
        String javaClassTaskName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task";
        final JavaClass javaClassTask = new JavaClass(getProjectClassLoader());
        javaClassTask.setPackage(packageName);
        javaClassTask.setName(javaClassTaskName);
        javaClassTask.addAnnotation(Generated.class)
            .setStringValue("value", "This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.");
        javaClassTask.extendSuperType("Camel" + ctCapitalizedName + "Task");
        javaClassTask.addImport("java.util.HashMap");
        javaClassTask.addImport("java.util.Map");
        javaClassTask.addImport("org.apache.camel.kafkaconnector.Camel" + ctCapitalizedName + "ConnectorConfig");
        javaClassTask.addImport("org.apache.camel.kafkaconnector.Camel" + ctCapitalizedName + "Task");

        javaClassTask.addMethod().setConstructor(false).setName("getCamel" + ctCapitalizedName + "ConnectorConfig").setProtected().addParameter("Map<String, String>", "props")
            .setReturnType("Camel" + ctCapitalizedName + "ConnectorConfig")
            .setBody("return new Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig(props);").addAnnotation(Override.class);

        if (!additionalProperties.keySet().isEmpty()) {
            Method getDefaultConfigMethod = javaClassTask.addMethod().setConstructor(false).setName("getDefaultConfig").setProtected().setReturnType("Map<String, String>")
                    .setBody("return new HashMap<String, String>() {{\n");
            for (String key : new TreeSet<String>(additionalProperties.keySet())) {
                getDefaultConfigMethod.setBody(getDefaultConfigMethod.getBody() + "    put(\"" + key + "\", \"" + additionalProperties.get(key) + "\");\n");
            }
            getDefaultConfigMethod.setBody(getDefaultConfigMethod.getBody() + "}};\n");
            getDefaultConfigMethod.addAnnotation(Override.class);
        }

        Method getSinkOrSourceKameletMethod = javaClassTask.addMethod().setConstructor(false).setName("get" + ctCapitalizedName + "Kamelet").setProtected().setReturnType("String")
                .setBody("return \"kamelet:" + name + "\";");
        getSinkOrSourceKameletMethod.addAnnotation(Override.class);

        String javaClassTaskFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassTaskName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassTask, javaClassTaskFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

        // Camel{sanitizedName}{Sink,Source}Connector.java
        String javaClassConnectorName = "Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Connector";
        final JavaClass javaClassConnector = new JavaClass(getProjectClassLoader());
        javaClassConnector.setPackage(packageName);
        javaClassConnector.setName(javaClassConnectorName);
        javaClassConnector.addAnnotation(Generated.class)
            .setStringValue("value", "This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.");
        javaClassConnector.extendSuperType("Camel" + ctCapitalizedName + "Connector");
        javaClassConnector.addImport("org.apache.camel.kafkaconnector.Camel" + ctCapitalizedName + "Connector");
        javaClassConnector.addImport("org.apache.kafka.common.config.ConfigDef");
        javaClassConnector.addImport("org.apache.kafka.connect.connector.Task");

        javaClassConnector.addMethod().setConstructor(false).setName("config").setPublic().setReturnType("ConfigDef")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "ConnectorConfig.conf();").addAnnotation(Override.class);
        javaClassConnector.addMethod().setConstructor(false).setName("taskClass").setPublic().setReturnType("Class<? extends Task>")
            .setBody("return Camel" + StringUtils.capitalize(sanitizedName.replace("-", "")) + ctCapitalizedName + "Task.class;").addAnnotation(Override.class);

        String javaClassConnectorFileName = packageName.replaceAll("\\.", "\\/") + File.separator + javaClassConnectorName + ".java";
        MavenUtils.writeSourceIfChanged(javaClassConnector, javaClassConnectorFileName, false, connectorDir, rm.getResourceAsFile(javaFilesHeader));

        List<String> convertersList = new ArrayList<>();
        List<String> transformsList = new ArrayList<>();
        List<String> aggregationStrategiesList = new ArrayList<>();
        if (connectorDir != null && connectorDir.isDirectory()) {
            File[] files = connectorDir.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    if (file.isDirectory()) {
                        Collection<File> convertersElements = FileUtils.listFiles(file, new RegexFileFilter(".*Converter.java"), DirectoryFileFilter.DIRECTORY);
                        Collection<File> transformElements = FileUtils.listFiles(file, new RegexFileFilter(".*Transforms.java"), DirectoryFileFilter.DIRECTORY);
                        Collection<File> aggStrategiesElements = FileUtils.listFiles(file, new RegexFileFilter(".*AggregationStrategy.java"), DirectoryFileFilter.DIRECTORY);
                        for (File p : convertersElements) {
                            String filePath = p.getCanonicalPath();
                            String f = StringUtils.removeStart(filePath, connectorDir.getAbsolutePath() + "/src/main/java/");
                            String finalElement = StringUtils.replace(f, File.separator, ".");
                            String finalPath = StringUtils.removeEnd(finalElement, ".java");
                            convertersList.add(finalPath);
                        }
                        for (File p : transformElements) {
                            String filePath = p.getCanonicalPath();
                            String f = StringUtils.removeStart(filePath, connectorDir.getAbsolutePath() + "/src/main/java/");
                            String finalElement = StringUtils.replace(f, File.separator, ".");
                            String finalPath = StringUtils.removeEnd(finalElement, ".java");
                            transformsList.add(finalPath);
                        }
                        for (File p : aggStrategiesElements) {
                            String filePath = p.getCanonicalPath();
                            String f = StringUtils.removeStart(filePath, connectorDir.getAbsolutePath() + "/src/main/java/");
                            String finalElement = StringUtils.replace(f, File.separator, ".");
                            String finalPath = StringUtils.removeEnd(finalElement, ".java");
                            aggregationStrategiesList.add(finalPath);
                        }
                    }
                }
            }
        }

        // docs/examples/Camel{sanitizedName}{Sink,Source}.properties
        try {
            String examplesPropertiestemplate = null;
            switch (ct) {
                case SOURCE:
                    examplesPropertiestemplate = loadText(rm.getResourceAsFile(exampleSourcePropertiesFileTemplate));
                    break;
                case SINK:
                    examplesPropertiestemplate = loadText(rm.getResourceAsFile(exampleSinkPropertiesFileTemplate));
                    break;
                default:
                    break;
            }
            HashMap<String, Object> templateParams = new HashMap<>();
            templateParams.put("connectorName", StringUtils.capitalize(sanitizedName));
            templateParams.put("connectorClass", packageName + "." + javaClassConnectorName);
            List<CamelKafkaConnectorOptionModel> mandatoryOptions = listOptions.stream()
                    .filter(o -> "HIGH".equalsIgnoreCase(o.getPriority()))
                    .sorted(Comparator.comparing(CamelKafkaConnectorOptionModel::getName, String.CASE_INSENSITIVE_ORDER))
                    .collect(Collectors.toList());
            templateParams.put("options", mandatoryOptions);
            String examplePropertiesFileContent = (String)TemplateRuntime.eval(examplesPropertiestemplate, templateParams);
            writeFileIfChanged(examplePropertiesFileContent, new File(connectorDir, "src/main/docs/examples/" + javaClassConnectorName + ".properties"), getLog());
        } catch (Exception e) {
            throw new MojoExecutionException("Error processing mvel examples properties template. Reason: " + e, e);
        }

        // generate json descriptor src/generated/resources/<connector-name>.json
        writeJson(listOptions, kamelet.getDescription(), connectorDir, ct, packageName + "." + javaClassConnectorName, convertersList, transformsList, aggregationStrategiesList);
        // generate descriptor src/generated/descriptors/connector-{sink,source}.properties
        writeDescriptors(connectorDir, ct);
    }

    private void addProperties(Map<String, String> additionalProperties, String additionalProp) {
        if (additionalProp != null && additionalProp.trim().length() > 0) {
            for (String prop : additionalProp.split(",")) {
                getLog().debug("Additional property before key value split: " + prop);
                String[] keyValue = prop.split("=");
                getLog().debug("Additional property key value: " + keyValue);
                additionalProperties.put(keyValue[0], keyValue[1]);
            }
        }
    }

    private void addConnectorOptions(String sanitizedName, ConnectorType ct, JavaClass javaClass, Method confMethod, String propertyQualifier, KameletPropertyModel kameletProperty,
                                     List<CamelKafkaConnectorOptionModel> listOptions, Set<String> kameletRequiredProperties) {
        String propertyName = kameletProperty.getName();

        String regex = "([A-Z][a-z]+)";
        String replacement = "$1_";

        String propertyPrefix = "CAMEL_" + ct + "_" + sanitizedName.replace("-", "").toUpperCase() + "_" + propertyQualifier.toUpperCase() + "_"
                                + StringUtils.capitalize(propertyName.replace("-", "")).replaceAll(regex, replacement).toUpperCase();
        String propertyValue = "camel.kamelet." + name + "." + propertyName;

        String confFieldName = propertyPrefix + "CONF";
        javaClass.addField().setFinal(true).setPublic().setStatic(true).setName(confFieldName).setType(String.class).setStringInitializer(propertyValue);

        String docFieldName = propertyPrefix + "DOC";
        String docLiteralInitializer = kameletProperty.getDescription().replace("\n", " ");
        if (kameletProperty.getExample() != null) {
            docLiteralInitializer = docLiteralInitializer + " Example: " + kameletProperty.getExample().replace("\n", " ");
        }
        javaClass.addField().setFinal(true).setPublic().setStatic(true).setName(docFieldName).setType(String.class).setStringInitializer(docLiteralInitializer);

        String defaultFieldName = propertyPrefix + "DEFAULT";
        Class<?> defaultValueClass = PRIMITIVE_TYPES_TO_CLASS_MAP.getOrDefault(kameletProperty.getType(), String.class);
        String type = defaultValueClass.getSimpleName().toLowerCase();

        String defaultValueClassLiteralInitializer;
        if (kameletProperty.getDefaultValue() == null) {
            //Handling null default camel options values (that means there is no default value).
            defaultValueClassLiteralInitializer = "null";
        } else {
            defaultValueClassLiteralInitializer = kameletProperty.getDefaultValue();
            if (defaultValueClass.equals(String.class)) {
                defaultValueClassLiteralInitializer = "\"" + defaultValueClassLiteralInitializer + "\"";
            }

            if (defaultValueClass.equals(Long.class) || defaultValueClass.equals(Integer.class) || defaultValueClass.equals(int.class)) {
                if (type.equalsIgnoreCase("duration")) {
                    if (defaultValueClassLiteralInitializer.endsWith("ms")) {
                        defaultValueClassLiteralInitializer = StringUtils.removeEnd(defaultValueClassLiteralInitializer, "ms");
                    } else {
                        defaultValueClassLiteralInitializer = Long.toString(TimeUtils.toMilliSeconds(defaultValueClassLiteralInitializer));
                    }
                }

                if (defaultValueClass.equals(Long.class) && !defaultValueClassLiteralInitializer.endsWith("L")) {
                    defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "L";
                }
            }

            if (defaultValueClass.equals(Float.class)) {
                defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "F";
            }

            if (defaultValueClass.equals(Double.class)) {
                defaultValueClassLiteralInitializer = defaultValueClassLiteralInitializer + "D";
            }
        }

        javaClass.addField().setFinal(true).setPublic().setStatic(true).setName(defaultFieldName).setType(defaultValueClass)
            .setLiteralInitializer(defaultValueClassLiteralInitializer);

        String confType;
        if ("password".equals(kameletProperty.getFormat())) {
            confType = PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.getOrDefault(type, CONFIG_DEF_TYPE_PASSWORD);
        } else {
            confType = PRIMITIVE_TYPES_TO_KAFKA_CONFIG_DEF_MAP.getOrDefault(type, CONFIG_DEF_TYPE_STRING);
        }
        boolean isRequired = kameletRequiredProperties.contains(kameletProperty.getName());
        String confPriority = isRequired ? CONFIG_DEF_IMPORTANCE_HIGH : CONFIG_DEF_IMPORTANCE_MEDIUM;
        confMethod.setBody(confMethod.getBody() + "conf.define(" + confFieldName + ", " + confType + ", " + defaultFieldName + ", " + confPriority + ", " + docFieldName + ");\n");
        CamelKafkaConnectorOptionModel optionModel = new CamelKafkaConnectorOptionModel();
        optionModel.setName(propertyValue);
        optionModel.setDescription(docLiteralInitializer);
        optionModel.setPriority(StringUtils.removeStart(confPriority, CONFIG_DEF_IMPORTANCE_PREFIX));
        optionModel.setDefaultValue(defaultValueClassLiteralInitializer.equals("null") ? null : defaultValueClassLiteralInitializer);
        optionModel.setRequired(String.valueOf(isRequired));
        //XXX: kamelets dose not support enum like properties type yet.
        listOptions.add(optionModel);
    }

    private void writeJson(List<CamelKafkaConnectorOptionModel> options, String componentDescription, File connectorDir, ConnectorType ct, String connectorClass,
                           List<String> convertersList, List<String> transformsList, List<String> aggregationStrategiesList)
        throws MojoExecutionException {

        CamelKafkaConnectorModel model = new CamelKafkaConnectorModel();
        model.setOptions(options);
        model.setArtifactId(getMainDepArtifactId());
        model.setGroupId(getMainDepGroupId());
        model.setVersion(getMainDepVersion());
        model.setDescription(componentDescription);
        model.setConnectorClass(connectorClass);
        model.setType(ct.name().toLowerCase());
        model.setConverters(convertersList);
        model.setTransforms(transformsList);
        model.setAggregationStrategies(aggregationStrategiesList);
        if (getMainDepArtifactId().equalsIgnoreCase("camel-coap+tcp")) {
            model.setTitle("camel-coap-tcp");
        } else if (getMainDepArtifactId().equalsIgnoreCase("camel-coaps+tcp")) {
            model.setTitle("camel-coaps-tcp");
        } else {
            model.setTitle(getMainDepArtifactId());
        }
        File docFolder = new File(connectorDir, "src/generated/resources/");
        File docFile = new File(docFolder, getMainDepArtifactId() + "-" + ct.name().toLowerCase() + ".json");
        JsonObject j = JsonMapperKafkaConnector.asJsonObject(model);
        updateFile(docFile, Jsoner.prettyPrint(j.toJson()));
    }
    
    private void writeDescriptors(File connectorDir, ConnectorType ct) throws MojoExecutionException {
        String title;
        if (getMainDepArtifactId().equalsIgnoreCase("camel-coap+tcp")) {
            title = "camel-coap-tcp";
        } else if (getMainDepArtifactId().equalsIgnoreCase("camel-coaps+tcp")) {
            title = "camel-coaps-tcp";
        } else {
            title = getMainDepArtifactId();
        }
        File docFolder = new File(connectorDir, "src/generated/descriptors/");
        File docFile = new File(docFolder, "connector-" + ct.name().toLowerCase() + ".properties");
        updateFile(docFile, title + "-" + ct.name().toLowerCase());
    }

    private boolean updateAutoConfigureOptions(File file, String changed) throws MojoExecutionException {
        try {
            if (!file.exists()) {
                // include markers for new files
                changed = "// kafka-connector options: START\n" + changed + "\n// kafka-connector options: END\n";
                writeText(file, changed);
                return true;
            }

            String text = loadText(new FileInputStream(file));

            String existing = Strings.between(text, "// kafka-connector options: START", "// kafka-connector options: END");
            if (existing != null) {
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    return false;
                } else {
                    String before = Strings.before(text, "// kafka-connector options: START");
                    String after = Strings.after(text, "// kafka-connector options: END");
                    text = before + "// kafka-connector options: START\n" + changed + "\n// kafka-connector options: END" + after;
                    writeText(file, text);
                    return true;
                }
            } else {
                getLog().warn("Cannot find markers in file " + file);
                getLog().warn("Add the following markers");
                getLog().warn("\t// kafka-connector options: START");
                getLog().warn("\t// kafka-connector options: END");
                return false;
            }
        } catch (Exception e) {
            throw new MojoExecutionException("Error reading file " + file + " Reason: " + e, e);
        }
    }

    private boolean updateFile(File file, String changed) throws MojoExecutionException {
        try {
            if (!file.exists()) {
                writeText(file, changed);
                getLog().debug("File doesn't exist, created it: " + file.getName());
                return true;
            }

            String text = loadText(new FileInputStream(file));

            String existing = text;
            if (existing != null) {
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    getLog().debug("No change to the file " + file.getName());
                    return false;
                } else {
                    writeText(file, changed);
                    getLog().debug("Changes detected to the file " + file.getName() + ": updated it");
                    return true;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new MojoExecutionException("Error reading file " + file + " Reason: " + e, e);
        }
    }

    private enum ConnectorType {
        SINK, SOURCE
    }
}