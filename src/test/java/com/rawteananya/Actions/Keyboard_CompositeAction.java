package com.rawteananya.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_CompositeAction {

        public static void main(String[] args){

            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.sreenidhirajakrishnan.com/practice#section-26");
            driver.manage().window().maximize();

            WebElement inputBox = driver.findElement(By.id("keyboard-input"));

           // Composite action = multiple mouse and/or keyboard actions chained into a single action sequence.

            Actions actions = new Actions(driver);
            actions.click(inputBox).sendKeys("Selenium Automation")
                    // click ctrl+A and select Text Selenium Automation and clear
                    .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .keyUp(Keys.CONTROL)
                    .sendKeys(Keys.BACK_SPACE)
                    .sendKeys("Java Automation")        // enter Java Automation
                    .sendKeys(Keys.ENTER)
                    .perform();

            // verify resulting value
            WebElement resultValue = driver.findElement(By.xpath("//p[@data-testid='keyboard-result']"));
            System.out.println("Result Value :"+ resultValue.getText());

            driver.quit();

        }
    }

