package com.rawteananya.WebElement_UIcomponent.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable_Cell {
    public static void main(String[] args) {

           WebDriver driver = new ChromeDriver();
                driver.get("https://demoqa.com/webtables");
                driver.manage().window().maximize();

                // For header //thead//th
              //  List<WebElement> columnHeaderLocator = driver.findElements(By.xpath("//thead//th"));
              //  for (WebElement column: columnHeaderLocator){
              //      System.out.println(column.getText());
              //  }

                //For row : //tbody//tr
                //For cell =  //tbody//tr//td
                List<WebElement> rowLocator = driver.findElements(By.xpath("//tbody//tr"));

                for (WebElement row: rowLocator){
                    List<WebElement> cellLocator = row.findElements(By.xpath(".//td"));
                    for (WebElement cell : cellLocator){
                        System.out.println(cell.getText());
                    }
                }


                System.out.println(rowLocator.size());
            //    System.out.println(columnHeaderLocator.size());

                driver.quit();
            }
        }

/* O/P
Cierra
Vega
39
cierra@example.com
10000
Insurance

Alden
Cantrell
45
alden@example.com
12000
Compliance

Kierra
Gentry
29
kierra@example.com
2000
Legal

3
*/
