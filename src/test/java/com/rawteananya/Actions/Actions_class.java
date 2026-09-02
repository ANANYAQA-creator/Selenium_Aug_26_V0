package com.rawteananya.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction");
        driver.manage().window().maximize();
        // Actions class
        Actions actions = new Actions(driver);
        WebElement moveMouse = driver.findElement(By.id("mouse-tracker"));
        actions.moveToElement(moveMouse).perform();

        driver.quit();
    }
}
