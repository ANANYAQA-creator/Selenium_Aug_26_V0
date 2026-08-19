package com.rawteananya.SR_AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_SR_Url {
    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice?utm_source=sp_auto_dm&utm_referrer=sp_auto_dm");

        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
