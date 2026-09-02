package com.rawteananya.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js_getTtile {
    public static void main(String[] args){

            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.sreenidhirajakrishnan.com/practice");
            driver.manage().window().maximize();

            // get title using JavascriptExecutor

        JavascriptExecutor js =(JavascriptExecutor) driver;
        String title = (String) js.executeScript("return document.title");

        System.out.println("PageTitle :" + title);

        String driverTitle = driver.getTitle();
        System.out.println("Driver Title :"+ driverTitle);

        // compare  both

        if(title.equalsIgnoreCase(driverTitle)){
            System.out.println("Title Matched");
        }else {
            System.out.println("Title Not Matched");
        }

        driver.quit();
    }
}
// O/P :PageTitle :Free Automation Practice Playground: Selenium, Playwright, Cypress, Robot Framework | Sreenidhi Rajakrishnan