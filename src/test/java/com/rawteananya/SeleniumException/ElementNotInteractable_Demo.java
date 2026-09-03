package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementNotInteractable_Demo {
    public static void main(String[] args){

        //I want you to understand the ElementNotInteractableException:
        //Element exists → not interactable → application changes state → becomes interactable → Selenium interacts successfully.
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        System.out.println("EnableButton is enabled : "+ enableAfter.isEnabled());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfter));

        try {
            enableAfter.click();
        } catch (ElementNotInteractableException e) {
            System.out.println("Element is not interactable");
        }
        System.out.println("EnableButton is enabled Now :" + enableAfter.isEnabled());

        // result verification
        WebElement colorChange = driver.findElement(By.id("colorChange"));
        System.out.println("colorChange :"+ colorChange.getText());

        WebElement result = driver.findElement(By.id("visibleAfter"));
        System.out.println("Result :"+ result.getText());

        driver.quit();
    }
}
