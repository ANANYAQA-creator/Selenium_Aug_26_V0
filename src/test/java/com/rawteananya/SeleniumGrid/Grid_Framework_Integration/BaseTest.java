package com.rawteananya.SeleniumGrid.Grid_Framework_Integration;

import com.rawteananya.SeleniumGrid.ThreadLocal.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    @BeforeMethod
    @Parameters("browser")
    public void setUp (String browser) throws Exception {

        DriverManager.setDriver(browser);
        DriverManager.getDriver().manage().window().maximize();
    }
        @AfterMethod
                public void teardown() {
            DriverManager.quitDriver();
        }
    }