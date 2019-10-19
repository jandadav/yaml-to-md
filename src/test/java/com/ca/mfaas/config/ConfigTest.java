package com.ca.mfaas.config;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConfigTest {

    private Config config;

    @Before
    public void setUp() throws Exception {
        this.config = Config.fromFile("config/testConfig.yml");
    }

    @Ignore
    @Test(expected = FileNotFoundException.class)
    public void nonExistentFileForConfig() throws Exception {
        @SuppressWarnings("unused")
        Config config = Config.fromFile("BREKEKE");
    }

    @Test
    public void retrieveMessageFiles() {
        assertNotNull(config.getMessageFiles());
        assertEquals(2, config.getMessageFiles().size());
    }

    @Test
    public void outputFile() {
        assertEquals("output.md", config.getOutputFile());
    }


}