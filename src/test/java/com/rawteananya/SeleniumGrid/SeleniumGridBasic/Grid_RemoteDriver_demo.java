package com.rawteananya.SeleniumGrid.SeleniumGridBasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URI;

public class Grid_RemoteDriver_demo {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444").toURL(),options);
        driver.get("https://www.google.com");
        System.out.println("Google Title :" + driver.getTitle());
         driver.quit();
    }
}