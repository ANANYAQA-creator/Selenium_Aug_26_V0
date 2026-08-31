package com.rawteananya.WebElement_UIcomponent.DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DatePicker_RealExample_dynamicDate_Picker {
    public static String getDateSuffix(int day) {

        if (day >= 11 && day <= 13) {
            return "th";
        }
        if (day % 10 == 1) {
            return "st";
        } else if (day % 10 == 2) {
            return "nd";
        } else if (day % 10 == 3) {
            return "rd";
        }else{
            return "th";
        }}
    public static void main(String[] args) {

        //Open date picker
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        //selectDateField click to open calendar
        WebElement selectDateField = driver.findElement(By.id("datePickerMonthYearInput"));
        selectDateField.click();

        // first using LocalDate
        LocalDate targetDate = LocalDate.of(2026,12,25);
        int day= targetDate.getDayOfMonth();
        int year = targetDate.getYear();
        String monthName= targetDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String dayName= targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH);
        String suffix = getDateSuffix(day);
        // dynamic aria label " "Choose Tuesday, December 15th, 2026"
        String ariaLabel = "Choose " +dayName +", "+monthName+ " "+ day+suffix+", "+year;

        // select month
        WebElement selectMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select selectedMonth = new Select(selectMonth);
        selectedMonth.selectByVisibleText(monthName);
        // select year
        WebElement selectYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select selectedYear = new Select(selectYear);
        selectedYear.selectByVisibleText(String.valueOf(year));


        // Wait for date page
        // Select date 15/12/2026
        By dateSelect= By.xpath("//div[@aria-label='" + ariaLabel + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dateSelect)).click();

        String selectedDate = selectDateField.getAttribute("value");
        System.out.println("Selected Date : " + selectedDate);

        driver.quit();
    }
}

