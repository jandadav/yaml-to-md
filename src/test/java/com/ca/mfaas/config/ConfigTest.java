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
        this.config = new Config("config/test.yml");
    }

    @Ignore
    @Test(expected = FileNotFoundException.class)
    public void NonExistentFileForConfig() throws Exception {
        Config config = new Config("BREKEKE");
    }

    @Test
    public void RetrieveMessageFiles() {
        assertNotNull(config.getMessageFiles());
        assertEquals(2, config.getMessageFiles().size());
    }

}