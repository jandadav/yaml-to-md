package com.ca.mfaas.document;

import com.ca.mfaas.config.Config;
import com.ca.mfaas.data.MessageLoader;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.nio.charset.StandardCharsets;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

public class DocumentBuilderTest {


    private String outputTemplate;
    private Config config;

    @Before
    public void CreateDocumentBuilder() {
        this.config = Config.fromFile("config/testConfig.yml");

        ClassLoader classLoader = getClass().getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream("testOutput.md")) {
            outputTemplate = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void DocumentBuilderOutput() {
        DocumentBuilder builder = new DocumentBuilder();
        config.getMessageFiles().forEach(s -> builder.add(new MessageLoader(s)));
        String doc = builder.createDocument();
        assertThat(doc, equalTo(outputTemplate));
    }

}