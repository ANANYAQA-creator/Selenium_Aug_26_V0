package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementNotInteractable_html_Demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/element-not-interactable.html");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("username"));
      //  userName.sendKeys("Ananya"); //ElementNotInteractableException
        try {
            userName.sendKeys("Ananya");
        } catch (ElementNotInteractableException e) {
            System.out.println("ElementNotInteractableException occurred");
        }

        WebElement showbutton = driver.findElement(By.id("showButton"));
        showbutton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        userName.sendKeys("Ananya Selenium");
        System.out.println("username : " + userName.getAttribute("value"));

        driver.quit();
    }
}
