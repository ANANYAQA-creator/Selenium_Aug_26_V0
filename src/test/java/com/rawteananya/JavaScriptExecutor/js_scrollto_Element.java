package com.rawteananya.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js_scrollto_Element {
    public static void main(String[] args)  {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollTarget = driver.findElement(By.id("scroll-target"));
        js.executeScript("arguments[0].scrollIntoView(true);",scrollTarget);

     //   WebElement scrollPage = driver.findElement(By.xpath("//div[@data-testid='scroll-spacer']"));
       // js.executeScript("arguments[0].scrollIntoView(true);",scrollPage);

        System.out.println("Reached stop :" + scrollTarget.getText());

        // scroll back to top
        js.executeScript("window.scrollTo(0,0);");

        driver.quit();
    }
}
// Note you can use   Thread.sleep(2000); after each action to see visual presentation in webpage during automation