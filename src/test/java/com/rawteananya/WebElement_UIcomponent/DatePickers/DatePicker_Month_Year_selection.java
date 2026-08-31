package com.rawteananya.WebElement_UIcomponent.DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePicker_Month_Year_selection {
    public static void main(String[] args) {


        //Open date picker
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        //selectDateField click to open calendar
        WebElement selectDateField = driver.findElement(By.id("datePickerMonthYearInput"));
        selectDateField.click();
        // select month
        WebElement selectMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select selectedMonth = new Select(selectMonth);
        selectedMonth.selectByVisibleText("December");
        // select year
        WebElement selectYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select selectedYear = new Select(selectYear);
        selectedYear.selectByVisibleText("2026");

        // Select date 15/12/2026
        By dateSelect = By.xpath("//div[@aria-label='Choose Tuesday, December 15th, 2026']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dateSelect)).click();

        String selectedDate = selectDateField.getAttribute("value");
        System.out.println("Selected Date : " + selectedDate);

        driver.quit();
    }
}
