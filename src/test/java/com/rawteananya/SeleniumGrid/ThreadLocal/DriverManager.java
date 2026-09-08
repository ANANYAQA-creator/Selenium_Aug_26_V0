package com.rawteananya.SeleniumGrid.ThreadLocal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class DriverManager {

 //   Basic syntax : ThreadLocal
    private static final ThreadLocal<WebDriver> driver =new ThreadLocal<>();

//    Set driver:
    public static void setDriver(String browser) throws Exception {
        WebDriver webdriver;

        // chromeOptions
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            webdriver = new RemoteWebDriver(
                    URI.create("http://localhost:4444").toURL(),
                    chromeOptions);

            // firefoxOptions
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            webdriver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),
                    firefoxOptions);

            // EdgeOptions
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            webdriver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),
                    edgeOptions);
        } else {
            throw new IllegalArgumentException(
                    "Unsupported Browser :" + browser
            );
        }

        driver.set(webdriver);
    }

    // Get driver:
    public static WebDriver getDriver() {

        return driver.get();
    }

    //Remove driver:
    public  static void quitDriver(){
        if (driver.get() != null){
            driver.get().quit();
            driver.remove();
        }
    }
}

/*Mental model:
set()    → Store driver for current thread
get()    → Retrieve driver's current thread
remove() → Remove driver's current-thread value
*/