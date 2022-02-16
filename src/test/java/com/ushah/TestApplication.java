package com.ushah;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestApplication {
    Application application;

    @Before
    public void init() {
        application = new Application();
    }

    @Test
    public void testMessage() {
        Assert.assertEquals("Hi", application.getMessage());
    }
}
