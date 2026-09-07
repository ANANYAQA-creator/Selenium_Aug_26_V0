package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TimeoutException_html_Demo {

    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/timeout-demo.html");
        driver.manage().window().maximize();

        WebElement showMsgButton = driver.findElement(By.id("showButton"));
        showMsgButton.click();

        /*
  2-second wait
      ↓
💥 TimeoutException
      ↓
Catch exception */
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
          try{
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
           } catch (TimeoutException e){
               System.out.println("TimeOutException Occured");
          }

        // Fixed Version
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement showMsg = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        System.out.println("Message :" + showMsg.getText());

            driver.quit();

        }
    }
