package com.rawteananya.WebElement_UIcomponent.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        //A. Locate dropdown — ✅
        WebElement selectOldMenu = driver.findElement(By.id("oldSelectMenu"));
        //B. Create Select object — ✅
        Select dropdown = new Select(selectOldMenu);
        //C. Select Green — ✅
        dropdown.selectByVisibleText("Green");
        //D. Get selected option — ✅
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        //E. Print — ✅
        System.out.println(selectedOption.getText());

        //Bonus

        String option = selectedOption.getAttribute("value");
        System.out.println("Selected Value : " + option);

        driver.quit();
    }
    }
