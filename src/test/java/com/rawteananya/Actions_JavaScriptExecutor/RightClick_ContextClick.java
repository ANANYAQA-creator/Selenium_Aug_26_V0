package com.rawteananya.Actions_JavaScriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {

    public static void main(String [] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        driver.manage().window().maximize();

        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions= new Actions(driver);
        actions.contextClick(box).perform();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("AlertText :" + alertText);
        alert.accept();

        driver.quit();
    }
}
