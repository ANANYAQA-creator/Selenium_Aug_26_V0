package com.rawteananya.TheInternet.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElement_findElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

       // WebElement inputtag = driver.findElement(By.tagName("invalid")); //NoSuchElementException
        List<WebElement> input = driver.findElements(By.tagName("invalid")); //


       /* Use: driver.findElements(By.tagName("input"))

        A. What is the return type of findElements()?
        Ans. List<WebElement>

        B. What happens if findElement() cannot find an element?
        Ans. NoSuchElementException occured

        C. What happens if findElements() cannot find any elements?
        Ans. An empty List<WebElement> is returned.

Q. "What is the difference between findElement() and findElements()?"
Ans. findElement() returns the first matching WebElement and throws NoSuchElementException if no element is found.
     findElements() returns a List<WebElement> containing all matching elements and returns an empty list if no elements are found.

        */


        driver.quit();
    }
}
