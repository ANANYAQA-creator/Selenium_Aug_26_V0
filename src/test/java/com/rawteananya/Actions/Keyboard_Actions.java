package com.rawteananya.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;





public class Keyboard_Actions {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-26");
        driver.manage().window().maximize();

        WebElement inputBox = driver.findElement(By.id("keyboard-input"));
    //    inputBox.click();

        Actions actions = new Actions(driver);
        actions.click(inputBox).sendKeys("Selenium Automation").perform();


        // click ctrl+A and select Text Selenium Automation and clear
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

        // enter Java Automation
        actions.sendKeys("Java Automation").perform();
        actions.sendKeys(Keys.ENTER).perform();

        // verify resulting value
        WebElement resultValue = driver.findElement(By.xpath("//p[@data-testid='keyboard-result']"));
        System.out.println("Result Value :"+ resultValue.getText());

        driver.quit();

    }
}
