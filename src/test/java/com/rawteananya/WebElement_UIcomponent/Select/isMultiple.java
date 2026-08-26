package com.rawteananya.WebElement_UIcomponent.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-4");
        driver.manage().window().maximize();

        //A. Locate dropdown — ✅
        WebElement selectOldMenu = driver.findElement(By.id("multi-select"));

        //B. select object
        Select dropdown = new Select(selectOldMenu);

        //use isMultiple
        boolean option = dropdown.isMultiple();
        System.out.println("isMultiple : "+ option );

         driver.quit();
    }
}