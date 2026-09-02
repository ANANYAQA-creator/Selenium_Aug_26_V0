package com.rawteananya.Alert_Window_Frame.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_simpleAlert {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // locate click for JS Alert button
        WebElement clickForJsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        clickForJsAlert.click();

        // Alert
        Alert alert = driver.switchTo().alert();
        // get Alert text
        String alertText = alert.getText();
        System.out.println("Alert Text :" + alertText);

        // Accept alert : click OK
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Page Result : " + result.getText());

        driver.quit();
    }
}

/*O/P
Alert Text :I am a JS Alert
Page Result : You successfully clicked an alert*/
