package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementClickIntercepted_Demo {
    public static void main(String [] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        WebElement smallModal = driver.findElement(By.id("showSmallModal"));
        smallModal.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("modal-content")
                )
        );
        System.out.println("Modal Text : " + modal.getText());

        WebElement closeButton = driver.findElement(By.id("closeSmallModal"));
        closeButton.click();

        wait.until(
                ExpectedConditions.invisibilityOf(modal)
        );
        driver.quit();
    }
}
