package com.rawteananya.WebElement_UIcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
        System.out.println(button.isDisplayed());
        System.out.println(button.isEnabled());
        button.click();
        WebElement output_text = driver.findElement(By.id("dynamicClickMessage"));
        String text = output_text.getText();
        System.out.println(text);
        driver.quit();
    }
}