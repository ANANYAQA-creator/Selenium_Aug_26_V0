package com.rawteananya.WebElement_UIcomponent.DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePicker2 {
        public static void main (String [] args){

            //Open date picker
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        //selectDateField click to open calendar
        WebElement selectDateField = driver.findElement(By.id("datePickerMonthYearInput"));
            selectDateField.click();

            // Click next Month
             By nextMonthbtn = By.xpath("//button[@aria-label='Next Month']");
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             wait.until(ExpectedConditions.elementToBeClickable(nextMonthbtn)).click();

             // Select date 25/09/26
        By dateSelect = By.xpath("//div[@aria-label='Choose Friday, September 25th, 2026']");
        wait.until(ExpectedConditions.elementToBeClickable(dateSelect)).click();

        String selectedDate = selectDateField.getAttribute("value");
        System.out.println("Selected Date : "+ selectedDate);

        driver.quit();
    }
}
