package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElement_Demo {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        // Element :<input autocomplete="off" placeholder="Full Name" id="userName" class=" mr-sm-2 form-control" type="text" fdprocessedid="h0bs7h9">
        // Wrong id = "username"for occur NoSuchElementException
       // WebElement fullNameBox = driver.findElement(By.id("username"));  // NoSuchElementException
      //  fullNameBox.sendKeys("Ananya");

        // Correct id = "userName"for occur NoSuchElement Exception
        WebElement fullNameBox = driver.findElement(By.id("userName"));
        fullNameBox.sendKeys("Ananya Selenium");

        // print the entered Value
        String fullNameText = fullNameBox.getAttribute("value");
        System.out.println("Fullname Text :" +fullNameText );// Fullname Text :Ananya Selenium

        driver.quit();

    }
}
