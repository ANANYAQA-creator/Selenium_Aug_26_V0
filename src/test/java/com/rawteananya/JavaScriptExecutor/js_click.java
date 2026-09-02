package com.rawteananya.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js_click {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-2");
        driver.manage().window().maximize();

        WebElement singleClickBox = driver.findElement(By.id("single-click-btn"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", singleClickBox);

        WebElement result = driver.findElement(By.xpath("//p[@data-testid='single-click-result']"));
        System.out.println("Result : "+ result.getText());

        driver.quit();
    }
}
