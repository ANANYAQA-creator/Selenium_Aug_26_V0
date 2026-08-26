package com.rawteananya.WebElement_UIcomponent.Deselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class deselectByVisibleText {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-4");
        driver.manage().window().maximize();

        // Multiple-select
        WebElement multipleSelectDropdown = driver.findElement(By.id("multi-select"));

        // Select Object
        Select select = new Select(multipleSelectDropdown);

        // select Javascript and python
        select.selectByVisibleText("Python");
        select.selectByVisibleText("JavaScript");
        select.selectByVisibleText("Java");

        // Before Deselect
        System.out.println("Before Deselect:");

        List<WebElement> selectedOptions =
                select.getAllSelectedOptions();

        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
// Deselect JavaScript
        select.deselectByVisibleText("JavaScript");
// After Deselect
        System.out.println("After Deselect:");
        List<WebElement> selectedOptionsAfter =
                select.getAllSelectedOptions();

        for (WebElement option : selectedOptionsAfter) {
            System.out.println(option.getText());
        }
        driver.quit();
    }
}
