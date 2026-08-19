package com.rawteananya.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFB {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        // Login to FB page
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Login Id
        WebElement LoginBox = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
        LoginBox.sendKeys("dsfhsdvfh");

        // Login Password
        WebElement LoginPassword = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
        LoginPassword.sendKeys("ABCDSJBjbs");

        // Login Button

        WebElement loginbtn = driver.findElement(By.xpath("//span[text()=\"Log in\"]"));
        loginbtn.click();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
