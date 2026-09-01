package com.rawteananya.WebElement_UIcomponent.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTable_ActionInside_SpecificRow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        // Alden's Row
        WebElement aldenRow = driver.findElement(By.xpath("//tbody//tr[td[normalize-space()='Alden']]"));

        // Edit Button
        WebElement editButton = aldenRow.findElement(By.xpath(".//span[@title='Edit']"));
        editButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement registrationEditForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registration-form-modal")));

        driver.quit();

    }
}