package com.rawteananya.WebElement_UIcomponent.Tooltips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tooltips_Custom {
    public static void main(String[] args){

        // CUSTOM TOOLTIPS

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-15");
        driver.manage().window().maximize();


        WebElement hoverMeToSeeBox = driver.findElement(By.id("tooltip-trigger"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverMeToSeeBox).perform();

         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement hovertext =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-testid='tooltip-bubble']")));
        System.out.println("Hover text :"+ hovertext.getText());

        driver.quit();

    }
}
