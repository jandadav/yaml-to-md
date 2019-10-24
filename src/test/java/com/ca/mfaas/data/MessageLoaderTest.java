package com.ca.mfaas.data;

import static org.junit.Assert.assertEquals;

import com.ca.mfaas.config.MessageFile;

import org.junit.Test;

public class MessageLoaderTest{
    
    //private static final String TEST_FILE = "config/testMessages.yml";
    private static final MessageFile TEST_FILE = new MessageFile("Test Messages", "config/testMessages.yml");

    @Test
    public void loadFromFile() {
        MessageLoader loader = new MessageLoader(TEST_FILE);
        assertEquals("Incorrect number of loaded messages", 4, loader.getMessages().size());
    }

    @Test
    public void loaderName() {
        MessageLoader loader = new MessageLoader(TEST_FILE);
        assertEquals(TEST_FILE.getTitle(), loader.getName());
    }
}