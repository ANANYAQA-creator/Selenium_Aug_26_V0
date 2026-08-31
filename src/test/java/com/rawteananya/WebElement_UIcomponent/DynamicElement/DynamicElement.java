package com.rawteananya.WebElement_UIcomponent.DynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElement {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        // will enable after 5 second button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By visibleAfterbutton = By.id("visibleAfter");
        WebElement visibleAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfterbutton));

        System.out.println(visibleAfter.getText());

        driver.quit();

    }
}
