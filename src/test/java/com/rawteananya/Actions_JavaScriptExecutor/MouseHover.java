package com.rawteananya.Actions_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MouseHover {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
        // Actions class

        WebElement firstImage = driver.findElement(By.xpath("//div[@class='figure']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).perform();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement userProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='figcaption']")));
        System.out.println("Displayed username :" + userProfile.getText());

        WebElement viewProfile = firstImage.findElement(By.xpath("//a[@href=\"/users/1\"]"));
        System.out.println("Profile linkText :" + viewProfile.getText());

        driver.quit();
    }
}
