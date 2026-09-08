package com.rawteananya.SeleniumGrid.ThreadLocal;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThreadLocalParallelTest_testng_class {
    @Test
    @Parameters("browser")

    public void browserTest(String browser) throws  Exception {
        DriverManager.setDriver(browser);
        DriverManager.getDriver().get("https://www.google.com");
        System.out.println("Browser : " + browser +
                " | Thread : " +
                Thread.currentThread().getId() +
                " | Title : " +
                DriverManager.getDriver().getTitle());
    }
    @AfterMethod
    public void teardown (){

        DriverManager.quitDriver();
    }

}
