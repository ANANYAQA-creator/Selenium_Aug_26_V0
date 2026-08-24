package com.rawteananya.SeleniumWaits.ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args){

        /*🎯 Your Exercise
Write a small Selenium program for:
Open:
https://the-internet.herokuapp.com/login

Set implicit wait = 5 seconds

Find username using ID

Enter:
tomsmith

Find password using ID

Enter:
SuperSecretPassword!

Find Login button

Click*/
        WebDriver driver = new ChromeDriver();
        // Set implicit wait = 5 seconds

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        // Find username using ID
        WebElement username = driver.findElement(By.id("username"));
        // Enter : tomsmith
        username.sendKeys("tomsmith");
        // Find password using ID
        WebElement password = driver.findElement(By.id("password"));
        // Enter: SuperSecretPassword!
        password.sendKeys("SuperSecretPassword!");
        // Find Login button
        WebElement loginbutton = driver.findElement(By.xpath("//i[normalize-space()='Login']"));
        // Click
        loginbutton.click();

        //quit browser
        driver.quit();

    }
}
