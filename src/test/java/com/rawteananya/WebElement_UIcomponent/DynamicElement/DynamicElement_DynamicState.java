package com.rawteananya.WebElement_UIcomponent.DynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElement_DynamicState {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        //Locate button
        WebElement BeforeEnable = driver.findElement(By.id("enableAfter"));
        System.out.println("BeforeEnable :" + BeforeEnable.isEnabled());


        //wait for enable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By visibleAfterbutton = By.id("enableAfter");
        WebElement visibleAfter = wait.until(ExpectedConditions.elementToBeClickable(visibleAfterbutton));

        System.out.println("AfterEnable :" + visibleAfter.isEnabled());
        visibleAfter.click();
        driver.quit();

        //BeforeEnable :false
        //AfterEnable :true
    }
}
