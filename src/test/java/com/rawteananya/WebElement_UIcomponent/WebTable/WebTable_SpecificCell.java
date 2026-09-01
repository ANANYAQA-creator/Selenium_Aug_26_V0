package com.rawteananya.WebElement_UIcomponent.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable_SpecificCell {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        //Find Alden's row
        WebElement aldenRow = driver.findElement(By.xpath("//tbody//tr[td[text()='Alden']]"));
        // //tbody//tr[td[text()='Alden']] means Find the <tr> that contains a <td> with text Alden.

        //Find cells inside Alden's row
        List<WebElement> cell = aldenRow.findElements(By.xpath(".//td"));
        // The . makes the search relative to Alden's row.

        //Get the Email
        String email = cell.get(3).getText();
/*
index start from 0
0 → Alden
1 → Cantrell
2 → 45
3 → alden@example.com
4 → 12000
5 → Compliance
6 → Action
*/

        // print email
        System.out.println("Alden's email : " +email);

        driver.quit();

            }
        }

