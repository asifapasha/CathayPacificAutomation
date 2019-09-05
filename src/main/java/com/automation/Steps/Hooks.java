package com.automation.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import static com.automation.Utils.ConfigUtils.loadProperties;
import static com.automation.Utils.DriverUtils.*;

public class Hooks {

    @Before
    public void setup() {
        loadProperties();
        getDriver();
    }

    @After
    public void terDown() {
        tearDown();
    }
}
