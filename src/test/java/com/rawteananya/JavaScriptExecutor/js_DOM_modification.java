package com.rawteananya.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js_DOM_modification {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/text-box?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        WebElement fullnameBox = driver.findElement(By.id("userName"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // set it's value to Ananya Selenium
       js.executeScript("arguments[0].value='Ananya Selenium';",fullnameBox);
        String placeHolderValue = fullnameBox.getAttribute("value");
        System.out.println("Fullname box Attribute>placeholder's value :" + placeHolderValue );



        //change border
        js.executeScript("arguments[0].style.border='3px solid red';", fullnameBox);

      driver.quit();
    }
}
// O/P Fullname box Attribute>placeholder's value :Ananya Selenium
// Element : <input autocomplete="off" placeholder="Full Name" id="userName" class=" mr-sm-2 form-control" type="text" fdprocessedid="ezvd3">