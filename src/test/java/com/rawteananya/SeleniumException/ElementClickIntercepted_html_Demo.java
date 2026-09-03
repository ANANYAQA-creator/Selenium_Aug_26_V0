package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickIntercepted_html_Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/element-click-intercepted.html");
        driver.manage().window().maximize();

        WebElement submitButton = driver.findElement(By.id("submit"));
     //  submitButton.click();  // ElementClickInterceptedException

        try{ submitButton.click();

        }catch (ElementClickInterceptedException e){
            System.out.println("ElementClickInterceptedException occured");
        }

        WebElement removeOverLay = driver.findElement(By.id("removeOverlay"));
        removeOverLay.click();

        submitButton.click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Finalresult :"+ result.getText());

        driver.quit();
    }
}