package com.rawteananya.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        WebElement box = driver.findElement(By.id("clickable"));
        Actions actions = new Actions(driver);
        actions.doubleClick(box).perform();

        WebElement clickStatus = driver.findElement(By.id("click-status"));
        System.out.println("Click status : "+ clickStatus.getText());

        driver.quit();
    }
}
// Click status : double-clicked
