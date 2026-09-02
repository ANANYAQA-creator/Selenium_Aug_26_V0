package com.rawteananya.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FinalExercise2_Actions_JavascriptExecutor {
    public static void main(String[] args) {

        // Part A — Actions

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers?utm_source=chatgpt.com");
        //maximize the page
        driver.manage().window().maximize();

        //Locate the first image.
        WebElement firstImage = driver.findElement(By.xpath("//div[@class='figure']"));
        Actions actions = new Actions(driver);
        // Hover over it.
        actions.moveToElement(firstImage).perform();

        //Wait for the caption.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By imageProfileResult = By.xpath("//div[@class='figcaption']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(imageProfileResult));

        //Print the username.
       // WebElement userName = driver.findElement(By.xpath("//h5[normalize-space()='name: user1']"));
        WebElement userName = firstImage.findElement(
                By.xpath(".//following-sibling::div[@class='figcaption']//h5")
        );
        System.out.println("Username : "+ userName.getText());

        //Locate and click View profile.
        WebElement viewProfile = driver.findElement(By.xpath("//a[@href='/users/1']"));
        viewProfile.click();

        // Back to hoverpage after viewProfile.click
        driver.navigate().back();

        // Part B — JavaScriptExecutor navigate to DemoQA
        driver.navigate().to("https://demoqa.com/text-box?utm_source=chatgpt.com");

        //Locate the Full Name field.
        WebElement fullName = driver.findElement(By.id("userName"));
        //Use JavaScriptExecutor to set: Ananya Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Ananya Selenium';",fullName);

        //Verify using getAttribute("value").
        String setValue = fullName.getAttribute("value");
        System.out.println("SetFullName_Value : "+ setValue);

        // scroll to submit button
        WebElement submitBtn = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView(true);",submitBtn);

        //get Page Title
        String title = (String) js.executeScript("return document.title");
        System.out.println("Page Title :" + title);

        // scroll back to Top
        js.executeScript("window.scrollTo(0,0);");

        driver.quit();

    }
}
// O/P :Username : name: user1
// SetFullName_Value : Ananya Selenium
// Page Title :demosite