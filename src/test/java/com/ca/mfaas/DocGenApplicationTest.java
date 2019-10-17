package com.ca.mfaas;

import org.junit.Before;
import org.junit.Test;

public class DocGenApplicationTest {

    @Before
    public void setUp() throws Exception {
        System.setProperty("config", "config/test.yml");
    }

    @Test
    public void appTest() throws Exception {
        DocGenApplication app = new DocGenApplication();

    }


}
