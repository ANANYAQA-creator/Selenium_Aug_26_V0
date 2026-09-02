package com.rawteananya.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js_scroll {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice");
        driver.manage().window().maximize();

        // JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scrolls down 500 pixels
        js.executeScript("window.scrollBy(0,500);");

        Thread.sleep(2000);
        //Scrolls another 500 pixels.
        js.executeScript("window.scrollBy(0,500);");

        // scroll up 300 pixels
       js.executeScript("window.scrollBy(0,-300);");

        //Scrolls directly to the bottom of the page.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Scrolls back to the top.
        js.executeScript("window.scrollTo(0,0);");

        driver.quit();
    }
}
// Note you can use   Thread.sleep(2000); after each action to see visual presentation in webpage during automation