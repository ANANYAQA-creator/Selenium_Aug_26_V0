package com.rawteananya.BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigation  {
    public static void main (String[] args) throws InterruptedException{

       /* driver.get()
        driver.navigate().to()
        driver.navigate().back()
        driver.navigate().forward()
        driver.navigate().refresh()

    🎯 Let's practice

Write a Selenium program that performs this flow:

Launch Chrome
     ↓
Open Google
     ↓
Navigate to The Internet
     ↓
Back
     ↓
Forward
     ↓
Refresh
     ↓
Quit

Use:

https://www.google.com
https://the-internet.herokuapp.com
        */

   WebDriver driver = new ChromeDriver();
   driver.get("https://www.google.com");
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.navigate().to("https://the-internet.herokuapp.com");
   Thread.sleep(2000);
   driver.navigate().back();
   Thread.sleep(2000);
   driver.navigate().forward();
        Thread.sleep(2000);
   driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
        //closes the current browser/window/tab.
   driver.quit();
   // closes the all open browser/windows by the webdriver session and terminate the webdriver session.


    }
}
