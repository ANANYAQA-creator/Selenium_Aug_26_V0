package com.rawteananya.WebElement_UIcomponent.DynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElement_DynamicID_Contains_startsWith_StaleElementExplicitWait {
    public static void main(String[] args){

        /*
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.manage().window().maximize();

DynamicID:
A. HTML of one button before refresh.
B. HTML of the same button after refresh.
C. Which attribute changed?
D. Which attributes remained stable?
Ans.
A. <a id="06d72990-87b7-013f-c2f3-2ae40bea0c03" href="" class="button">foo</a>
B. <a id="1751d4a0-87b7-013f-c307-2ae40bea0c03" href="" class="button">qux</a>
C. the first digits of id are changed after refresh
D. 2ae40bea0c03
*/

        /* contains

        By dynamicLocator = By.xpath("//a[contains(@id,'2ae40bea0c03')]")
        WebElement dynamicElement = driver.findElement(dynamicLocator);  */

/* starts-with()
I'll give you a small HTML example and you create the XPath:

<input id="user_12345" name="username">
<input id="user_67890" name="password">
Task: Write an XPath using starts-with() that finds the username input.

Ans
WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'user_')]"))*/

        // StaleElementReferenceException + Explicit Wait

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By enableAfterLocator = By.id("enableAfter");
        WebElement enableAfter = wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(enableAfterLocator)));

        System.out.println("Enable Locator :" + enableAfter.isDisplayed());

        driver.quit();


    }
}
