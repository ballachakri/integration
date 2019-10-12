package com.integration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest2 {

    @Before
    public void demoTest2Before() {
        System.out.println("This a before method in demoTest3Before method...................");
    }

    @Test
    public void demoTest2Test() {
        System.out.println("Integration Test Demo Test 2 test method executed.......................... ");
        System.out.println("INTEGRATION TEST Successfully Passed");
    }

    @After
    public void demoTest2After() {
        System.out.println("This a before method in demoTest2Before method...................");
    }

}
