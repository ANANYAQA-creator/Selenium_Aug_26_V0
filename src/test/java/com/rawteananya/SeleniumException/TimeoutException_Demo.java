package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeoutException_Demo {
    public static void main (String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-7");
        driver.manage().window().maximize();

      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
       // By buttonIncrement = By.id("wrong-btn");  //TimeoutException due to wrong locator

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By buttonIncrement = By.id("increment-btn");  // fixed version
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonIncrement));

        driver.quit();
    }
}
