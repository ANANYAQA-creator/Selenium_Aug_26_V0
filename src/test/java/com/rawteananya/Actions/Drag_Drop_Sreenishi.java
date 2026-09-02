package com.rawteananya.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Sreenishi {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-13");
        driver.manage().window().maximize();

        WebElement sourceA = driver.findElement(By.id("drag-source"));
        WebElement targetB = driver.findElement(By.id("drop-zone"));

        Actions actions = new Actions(driver);
       // actions.dragAndDrop(sourceA,targetB).perform();

        //I use a sequence of clickAndHold(), moveToElement(), and release().
        actions.clickAndHold(sourceA)
                .moveToElement(targetB)
                .release().perform();

        WebElement successMsg = driver.findElement(By.xpath("//p[@data-testid='drop-result']"));
        System.out.println("Successfull Message : "+ successMsg.getText());

        driver.quit();
    }
}
