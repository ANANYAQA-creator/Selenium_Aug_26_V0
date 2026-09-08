package com.rawteananya.SeleniumGrid.SeleniumGridBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class CrossBrowserExecution {
    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions chromeOptions = new ChromeOptions();

        FirefoxOptions firefoxOptions = new FirefoxOptions();

        EdgeOptions edgeOptions = new EdgeOptions();

        WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),chromeOptions);

        driver.get("https://www.google.com");
        System.out.println("Google Title : "+ driver.getTitle());

        WebDriver driver1 = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),firefoxOptions);
        driver1.get("https://www.Facebook.com");
        System.out.println("Facebook Title : "+ driver1.getTitle());

        WebDriver driver2 = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),edgeOptions);

        driver2.get("https://www.youtube.com");
        System.out.println("Youtube Title : "+ driver2.getTitle());

        driver.quit();
        driver1.quit();
        driver2.quit();

    }
}
