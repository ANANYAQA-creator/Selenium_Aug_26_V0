package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleReferenceElement_Demo {
    public static void main(String[] args) {

       /*Remember this pattern: StaleReferenceElementException
Find Element
     ↓
DOM changes
     ↓
Old WebElement ❌
     ↓
StaleElementReferenceException
     ↓
Re-locate element
     ↓
New WebElement ✅
*/


        /*Expected flow
Find target
    ↓
Store WebElement
    ↓
Click "Replace Element"
    ↓
DOM replaces target
    ↓
Use old target
    ↓
StaleElementReferenceException
    ↓
Re-locate target
    ↓
Use new target ✅

That's the correct recovery strategy, but to actually demonstrate the exception, we need:
locate → DOM replacement → use OLD reference → exception → re-locate → action
*/

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-22");
        driver.manage().window().maximize();

        // Locate Stale Target
        By staleTarget = By.id("stale-target");
        // Locate replaceElement button
        By replaceButton = By.id("stale-refresh-btn");

        // Stores (stale Target ) it in a WebElement.
        // Locate and store the target element
        WebElement target = driver.findElement(staleTarget);
        // Verify the original element
        System.out.println("Before replacement : " + target.getText());

        // Locate and click the Replace Element button
        WebElement replacebutton = driver.findElement(replaceButton);
        replacebutton.click();

        try {
            // Try to use the old WebElement reference
            // DOM has changed, so StaleElementReferenceException occurs here
            System.out.println("Old element : " + target.getText());

        } catch (StaleElementReferenceException e) {
            // Handle StaleElementReferenceException
            System.out.println("StaleElementReferenceException occurred");
            // Re-locate the element from the current DOM
            target = driver.findElement(staleTarget);
            // Verify the newly located element
            System.out.println("After replacement : " + target.getText());
            System.out.println("Element displayed : " + target.isDisplayed());
        }
        driver.quit();
    }
}
