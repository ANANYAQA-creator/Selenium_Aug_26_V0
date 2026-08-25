package com.rawteananya.WebElement_UIcomponent.Buttons_Radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Button_State_Exercise {
    public static void main(String[] args){

        /*
        Write code to:
Open Dynamic Properties.
Locate enableAfter.
Print its initial state using isEnabled().
Use Explicit Wait to wait until it becomes clickable.
Print its state again.
Click it.
*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");

       // WebElement enableAfter = driver.findElement(By.id("enableAfter"));
      //  System.out.println(enableAfter.isEnabled());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //  wait.until(ExpectedConditions.elementToBeClickable(enableAfter));

       // System.out.println(enableAfter.isEnabled());
       // enableAfter.click();

        WebElement enableAfter = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("enableAfter")
                )
        );

        System.out.println(enableAfter.isEnabled());
        enableAfter.click();

        driver.quit();
    }
}
