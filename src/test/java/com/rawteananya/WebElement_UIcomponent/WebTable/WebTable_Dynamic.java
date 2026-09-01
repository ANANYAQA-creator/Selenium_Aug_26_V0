package com.rawteananya.WebElement_UIcomponent.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable_Dynamic {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        // Locate All header
        List<WebElement> allHeader = driver.findElements(By.xpath("//thead//th"));

        // Email Header
        WebElement emailHeader = driver.findElement(By.xpath("//tr//th[normalize-space()='Email']"));

        // emailHeader Index
        int emailColumnIndex = allHeader.indexOf(emailHeader);
        System.out.println(emailColumnIndex);

        //Alden's row
        WebElement aldenrow = driver.findElement(By.xpath("//tbody//tr[td[normalize-space()='Alden']]"));

        // Alden's cell
        List<WebElement> aldenCell = aldenrow.findElements(By.xpath(".//td"));

        // get aldenCell's email index
        aldenCell.get(emailColumnIndex);

        // Get Alden's email

        String aldenEmail = aldenCell.get(emailColumnIndex).getText();
        System.out.println("Alden's email :"+ aldenEmail );

        driver.quit();
    }
}
