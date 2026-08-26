package com.rawteananya.WebElement_UIcomponent.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class getAllSelectedOptions {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-4");
        driver.manage().window().maximize();

        // Multiple-select
        WebElement multipleSelectDropdown = driver.findElement(By.id("multi-select"));

        // select object
        Select dropdown = new Select(multipleSelectDropdown);

        // select Javascript and python
        dropdown.selectByVisibleText("Python");
        dropdown.selectByVisibleText("JavaScript");

        // Get all selected options
        List<WebElement> selectedoption = dropdown.getAllSelectedOptions();

        // for-each loop

        for (WebElement options : selectedoption){
            System.out.println(options.getText());
        }

        // selectedoption size
        System.out.println(selectedoption.size());

        driver.quit();

    }
}
