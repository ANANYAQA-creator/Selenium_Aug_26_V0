package com.rawteananya.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod_click_sendKeys {
    public static void main(String[]args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        //maximize a window
        driver.manage().window().maximize();

        //  sendkeys  : Username and Password field

        //Username Field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sdigdsdf");

        //Password Field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("nsdjfb");

        //Click - Login Button

        WebElement loginbtn = driver.findElement(By.xpath("//i[normalize-space()=\"Login\"]"));
        loginbtn.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
