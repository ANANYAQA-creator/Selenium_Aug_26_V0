package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidSelection_demo {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/invalid-selector-demo.html");
        driver.manage().window().maximize();

        try{
            WebElement wrongUserName = driver.findElement(By.xpath("//input[@id='username'"));
            wrongUserName.sendKeys("Ash tray");
        }catch (InvalidSelectorException e){
            System.out.println("InvalidSelectorException Occurred");
        }

        WebElement correctUserName = driver.findElement(By.xpath("//input[@id='username']"));
        correctUserName.sendKeys("Ananya QA");

        System.out.println(" textBoxInput :"+ correctUserName.getAttribute("value"));

        driver.quit();
    }
}
