package com.rawteananya.Alert_Window_Frame.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_confirmationAlert {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement jsConfirm = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        jsConfirm.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("AlertText :" + alertText);

        // click ok : alert.accept();
        // click cancel
        alert.dismiss();   // cancel

        // verify page result
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Page Result : " + result.getText());
        driver.quit();
    }
}
//AlertText :I am a JS Confirm
//Page Result : You clicked: Cancel