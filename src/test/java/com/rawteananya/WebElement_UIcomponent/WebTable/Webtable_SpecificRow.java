package com.rawteananya.WebElement_UIcomponent.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtable_SpecificRow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        // Alden's Row
       WebElement aldenRow = driver.findElement(By.xpath("//tbody//tr[td[normalize-space()='Alden']]"));

        // Alden's each cell
        List<WebElement> aldenCell = aldenRow.findElements(By.xpath(".//td"));
        // print all values using for each loop
        for (WebElement cell: aldenCell){
            System.out.println(cell.getText());
        }

        driver.quit();
    }
}
