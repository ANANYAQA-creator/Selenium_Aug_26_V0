package com.rawteananya.WebElement_UIcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        WebElement homeCheckbox = driver.findElement(By.cssSelector(".rc-tree-checkbox"));
        System.out.println(homeCheckbox.isSelected()); // false

        if (!homeCheckbox.isSelected()){
            homeCheckbox.click();
        }

        System.out.println("Selected: " + homeCheckbox.isSelected());

        driver.quit();

       // E. Explain the difference between:
        // isDisplayed() checks whether the element is visible on the webpage.
        // isEnabled() checks whether the element is enabled and capable of receiving interaction.
        // isSelected() checks whether a checkbox, radio button, or selectable element is currently selected.
    }
}
