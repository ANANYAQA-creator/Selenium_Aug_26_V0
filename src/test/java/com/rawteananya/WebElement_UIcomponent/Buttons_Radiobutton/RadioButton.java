package com.rawteananya.WebElement_UIcomponent.Buttons_Radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        // yes_radioButton

        WebElement yes_radioButton = driver.findElement(By.id("yesRadio"));
        System.out.println("Before select yes : " + yes_radioButton.isSelected());

        if (!yes_radioButton.isSelected()){
            yes_radioButton.click();
        }

        System.out.println("After select yes : " + yes_radioButton.isSelected());

        driver.quit();
    }
}
