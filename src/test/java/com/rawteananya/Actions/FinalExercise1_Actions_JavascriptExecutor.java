package com.rawteananya.Actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinalExercise1_Actions_JavascriptExecutor {
    public static void main(String[] args) {

      /*
        Open the website.
        Locate a product.
        Hover over the product.
        Perform a right-click on the product.
        Handle the resulting alert.
        Scroll to a button lower on the page using JavaScript.
        Click the button.
        Retrieve the page title using JavaScript.
        Print the title.
        Return to the top of the page.
        Close the browser. */

        //Open the website.
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.e-commerceExample.com/");
        driver.manage().window().maximize();

        //Locate a product.
        WebElement product = driver.findElement(By.id("product"));
        Actions actions = new Actions(driver);
        // Hover over the product.
        actions.moveToElement(product).perform();
        //Perform a right-click on the product.
        actions.contextClick(product).perform();

        // Handle the resulting alert.
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("AlertText :" + alertText);
        alert.accept();

        //   Scroll to a button lower by webelement on the page using JavaScript.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button_Bottom = driver.findElement(By.id("button"));
        js.executeScript("arguments[0].scrollIntoView(true);",button_Bottom);

        //    Click the button.
        button_Bottom.click();

        // Retrieve the page title using JavaScript.
        String title = (String) js.executeScript("return document.title");
        //print title
        System.out.println("PageTitle :" +title);

        //Return to the top of the page.
        js.executeScript("window.scrollTo(0,0);");

        driver.quit();
    }
}
