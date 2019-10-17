package com.ca.mfaas;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DocGenApplicationTest {

    @Before
    public void setUp() throws Exception {
        System.setProperty("config", "config/test.yml");
    }

    @Ignore
    @Test
    @SuppressWarnings("unused")
    public void appTest() throws Exception {
        DocGenApplication app = new DocGenApplication();
    }


}
