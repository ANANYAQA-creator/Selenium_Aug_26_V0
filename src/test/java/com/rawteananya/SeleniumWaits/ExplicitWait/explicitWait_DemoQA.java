package com.rawteananya.SeleniumWaits.ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait_DemoQA {
    public static void main(String[] args){

      /*  Write code that:
Launches Chrome.
Opens Dynamic Properties.
Creates a WebDriverWait of 10 seconds.
Waits until enableAfter becomes clickable.
Stores the returned WebElement.
Prints:
Is Enabled: true
Clicks the button.
Quits the browser.
Required condition:
ExpectedConditions.elementToBeClickable()

*/

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement enableAfter = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        System.out.println("enableAfter is : " + enableAfter.isEnabled());
        enableAfter.click();

        driver.quit();

        //Note:  If the expected condition is not satisfied within the specified timeout, Explicit Wait throws a TimeoutException.
    }
}
