package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NoSuchFrame_demo_html {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/no-such-frame-demo.html");
        driver.manage().window().maximize();
        // Wrong Frame
        try{
            driver.switchTo().frame("wrongFrame");   //NoSuchFrameException
        } catch (NoSuchFrameException e){
            System.out.println("NoSuchFrameException Occured");
        }

        // Fixed Version
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginFrame = driver.findElement(By.id("loginFrame"));
        // switched to Frame
        driver.switchTo().frame(loginFrame);

        /*Either can use frameToBeAvailableAndSwitchToIt
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
        By.id("loginFrame")
));    */

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Ananya Selenium");

        System.out.println("UserName :" + userName.getAttribute("value"));

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
