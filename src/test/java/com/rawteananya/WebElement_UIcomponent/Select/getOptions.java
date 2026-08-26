package com.rawteananya.WebElement_UIcomponent.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class getOptions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        //A. Locate dropdown — ✅
        WebElement selectOldMenu = driver.findElement(By.id("oldSelectMenu"));
        //B. Create Select object — ✅
        Select dropdown = new Select(selectOldMenu);

        // C/ getOptions()
        List<WebElement> options = dropdown.getOptions();

        // using for-each loop
        for (WebElement option : options){
            System.out.println(option.getText());
        }
// find size/total no.
        System.out.println("Total options: " + options.size());

        driver.quit();
    }
}
