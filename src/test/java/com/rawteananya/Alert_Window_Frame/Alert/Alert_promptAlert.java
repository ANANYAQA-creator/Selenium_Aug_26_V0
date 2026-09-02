package com.rawteananya.Alert_Window_Frame.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_promptAlert {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement jsConfirmPrompt = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        jsConfirmPrompt.click();

        Alert alert = driver.switchTo().alert();

        // alert Text
        String alertText = alert.getText();
        System.out.println("AlertText :" + alertText);
        // alert sendKeys: Ananya
        alert.sendKeys("Ananya");
        // alert accept
        alert.accept();

        // verify page result
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Page Result : " + result.getText());
        driver.quit();
    }
}
//AlertText :I am a JS prompt
//Page Result : You entered: Ananya