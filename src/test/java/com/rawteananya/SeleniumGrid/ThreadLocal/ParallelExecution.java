package com.rawteananya.SeleniumGrid.ThreadLocal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URI;

public class ParallelExecution {


    @Test
// Chrome
    public void chromeTest() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(), chromeOptions);
        driver.get("https://www.google.com");
        System.out.println("Google | Thread "
                + Thread.currentThread().getId()
                + " Title :" + driver.getTitle());
        driver.quit();
    }

    @Test
// FireFox
    public void firefoxTest() throws  Exception {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),firefoxOptions);
        driver.get("https://www.youtube.com");
        System.out.println(" FireFox | Thread :" +
                Thread.currentThread().getId() +
                "Title : " +
                driver.getTitle());
        driver.quit();
    }

    @Test
// Edge
    public void edgeTest() throws  Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),edgeOptions);
        driver.get("https://www.facebook.com");
        System.out.println(" Edge | Thread :" +
                Thread.currentThread().getId() +
                "Title : " +
                driver.getTitle());
        driver.quit();
    }
}
