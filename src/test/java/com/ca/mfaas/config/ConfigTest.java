package com.ca.mfaas.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ConfigTest {

    private Config config;

    @Before
    public void setUp() throws Exception {
        this.config = Config.fromFile("config/testConfig.yml");
    }

    @Ignore
    @Test(expected = FileNotFoundException.class)
    public void NonExistentFileForConfig() throws Exception {
        @SuppressWarnings("unused")
        Config config = Config.fromFile("BREKEKE");
    }

    @Test
    public void RetrieveMessageFiles() {
        assertNotNull(config.getMessageFiles());
        assertEquals(2, config.getMessageFiles().size());
    }

}