package com.rawteananya.SeleniumGrid.Grid_Framework_Integration;

import com.rawteananya.SeleniumGrid.ThreadLocal.DriverManager;
import org.testng.annotations.Test;

public class GridLoginTest extends BaseTest{

    @Test
    public void loginTest(){

        DriverManager.getDriver().get("https://www.google.com");

        System.out.println("Browser Test | Thread :" +
                Thread.currentThread().getId() +
                "Title : " +
                DriverManager.getDriver().getTitle());
    }
}

/*Notice what disappeared from the test:
ChromeOptions
FirefoxOptions
EdgeOptions
RemoteWebDriver
ThreadLocal
Grid URL
driver.quit()*/