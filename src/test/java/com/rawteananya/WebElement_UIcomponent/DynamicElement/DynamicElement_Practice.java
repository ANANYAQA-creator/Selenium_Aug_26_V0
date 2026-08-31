package com.rawteananya.WebElement_UIcomponent.DynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElement_Practice {
    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        //enable After

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enableAfter5Sec = driver.findElement(By.id("enableAfter"));
        System.out.println("Before Enable :" + enableAfter5Sec.isEnabled());
        System.out.println("Before Enabledisplay : "+ enableAfter5Sec.isDisplayed());

        // visible After
        By visibleAfter5Sec = By.id("visibleAfter");
        WebElement visibleAfter = wait.until(ExpectedConditions.elementToBeClickable(visibleAfter5Sec));
        System.out.println("Visible after 5 second :" + visibleAfter.isDisplayed());

        try{
            enableAfter5Sec.click();
        } catch (StaleElementReferenceException e) {
            WebElement refreshedElement = driver.findElement(By.id("enableAfter"));
            refreshedElement.click();
        }

        driver.quit();
    }
}
