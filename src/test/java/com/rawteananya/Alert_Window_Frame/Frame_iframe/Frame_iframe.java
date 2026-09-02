package com.rawteananya.Alert_Window_Frame.Frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe {
    public static void main (String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-11");


        WebElement frame = driver.findElement(By.xpath("//iframe[@data-testid='practice-iframe']"));
        driver.switchTo().frame(frame); // means: Main page → iframe

        // sendKeys
        WebElement textBox = driver.findElement(By.id("iframe-input"));
        textBox.sendKeys("Ananya");

        // click submit button
        WebElement submitBtn = driver.findElement(By.id("iframe-btn"));
        submitBtn.click();

        //Verify Result
        WebElement result = driver.findElement(By.id("iframe-result"));
        System.out.println("Result :" + result.getText());

        // switch back to mainPage
        driver.switchTo().defaultContent(); // means: iframe → Main page

  //      driver.switchTo().parentFrame(); //  means:Current iframe → Immediate parent frame

        driver.quit();
    }
}
