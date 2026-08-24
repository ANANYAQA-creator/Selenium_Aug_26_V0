package com.rawteananya.BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_getCurrentURL {
    public static void main(String[] args){

        /*🎯 Your exercise
Write a program that:
Opens:
https://the-internet.herokuapp.com/login
Gets the page title using:
driver.getTitle()
Gets the current URL using:
driver.getCurrentUrl()
Prints both:
Title: ...
URL: ...
Quit the browser.
*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        //getTitle()
        String title = driver.getTitle();
        System.out.println("Title :" + title);

        //getCurrentUrl
        String Currenturl = driver.getCurrentUrl();
        System.out.println("CurrentUrl :" + Currenturl);

        driver.quit();

    }
}
