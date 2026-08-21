package com.rawteananya.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
        public static void main(String[]args) throws InterruptedException{

            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/login");

            //maximize a window
            driver.manage().window().maximize();

            //  sendkeys  : Username and Password field

            //Username Field
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("abctest");
            Thread.sleep(2000);
            username.clear();
            Thread.sleep(2000);
            username.sendKeys("abctest_new");

            //Password Field
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("pwdtest");
            Thread.sleep(2000);
            password.clear();
            Thread.sleep(2000);
            password.sendKeys("pwdtest_new");

            Thread.sleep(2000);
            driver.quit();
        }
    }

