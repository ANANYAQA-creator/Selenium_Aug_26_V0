package com.rawteananya.WebElement_UIcomponent.DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePicker {
    public static void main (String [] args){

        //Exercise: 3
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));
        selectDate.click();

        By dateSelect = By.xpath("//div[@aria-label='Choose Tuesday, August 25th, 2026']");
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.elementToBeClickable(dateSelect)).click();

          String selectedDate = selectDate.getAttribute("value");
        System.out.println("Selected Date : "+ selectedDate);

        // Excercise:- 2
       // By nextMonthbtn = By.xpath("//button[@aria-label='Next Month']");
      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //  wait.until(ExpectedConditions.elementToBeClickable(nextMonthbtn)).click();
         driver.quit();
    }
}
