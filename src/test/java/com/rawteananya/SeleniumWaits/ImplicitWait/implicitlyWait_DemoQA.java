package com.rawteananya.SeleniumWaits.ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitlyWait_DemoQA {

    public static void main(String[] args){

       /* Your task
        Write code to:
        A. Open DemoQA Dynamic Properties.
        B. Set:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        C. Locate the Will enable 5 seconds button.
        D. Print:
        Is Enabled: true/false
        E. Don't use Thread.sleep().*/

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
        // Locate element
        WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        // Verify current state
        System.out.println("Is Enabled: " + enableAfter.isEnabled()); // false

        driver.quit();
    }
}
