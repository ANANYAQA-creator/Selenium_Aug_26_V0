package com.rawteananya.SeleniumException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class FinalExceptionExercise_HTML {
    public static void main (String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/Exception_Exercise_HTML/selenium-exception-final-demo.html");
        driver.manage().window().maximize();

        //Task 1 — Hidden Element
        WebElement showUserName = driver.findElement(By.id("showUsername"));
        WebElement username = driver.findElement(By.id("username"));

        try{
            username.sendKeys("Example QA");
        } catch (ElementNotInteractableException e){
            System.out.println("ElementNotInteractableException occurred");
        }

        showUserName.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userNameTextbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        userNameTextbox.sendKeys("Ananya Selenium");
        System.out.println("UserName TextBox :" + userNameTextbox.getAttribute("value"));

        System.out.println("============================================TASK1==============================================================");
        // 🔹 Task 2 — Delayed Element

        WebElement showMsg = driver.findElement(By.id("showMessage"));
            showMsg.click();
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(2));
            try{
                shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        } catch (TimeoutException e){
            System.out.println("TimeoutException Occurred");
        }

        WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement delayedMsg = longWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        System.out.println("Delayed Msg :" + delayedMsg.getText());
        System.out.println("============================================TASK2==============================================================");
        //🔹 Task 3 — Iframe

       try {
           driver.switchTo().frame("wrongFrame");
       }catch (NoSuchFrameException e){
           System.out.println("NoSuchFrameException occurred");
       }

       WebElement mainFrame = driver.findElement(By.id("userFrame"));
       driver.switchTo().frame(mainFrame);

       WebElement frameUsername = driver.findElement(By.id("frameUsername"));
       frameUsername.sendKeys("Ananya Frame");

        System.out.println("UserFrame : " + frameUsername.getAttribute("value"));

        driver.switchTo().defaultContent();
        System.out.println("============================================TASK3==============================================================");

        //🔹 Task 4 — New Window

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("MainWindowHandle :"+ mainWindowHandle);

        WebElement openWindow = driver.findElement(By.id("openWindow"));
        openWindow.click();

        Set<String> allWindowHandle = driver.getWindowHandles();
        for (String newWindow : allWindowHandle){
            if (!newWindow.equals(mainWindowHandle)){
                driver.switchTo().window(newWindow);
                String newWindowHandle = driver.getWindowHandle();
                System.out.println("NewWindow Handle :" + newWindowHandle);
            }
        }

        String newWindowTitle = driver.getTitle();
        System.out.println(" New Window Title :" + newWindowTitle);

        WebElement childMsg = driver.findElement(By.id("childMessage"));
        System.out.println("ChildMessage :" + childMsg.getText());

        WebElement childTextBox = driver.findElement(By.id("childInput"));
        childTextBox.sendKeys("Ananya new child Window Text");

        System.out.println("ChildTextBox :" + childTextBox.getAttribute("value"));

        System.out.println("============================================TASK4==============================================================");

        //🔹 Task 5 — NoSuchWindowException

        String  childWindow = driver.getWindowHandle();
        System.out.println("ChildWindowHandle :" + childWindow);

        driver.close();
        try {
            driver.switchTo().window(childWindow);
        } catch ( NoSuchWindowException e){
            System.out.println("NoSuchWindowException occurred");
        }

        driver.switchTo().window(mainWindowHandle);

        WebElement mainPage = driver.findElement(By.xpath("//h1[normalize-space()='Selenium Exception Final Challenge']"));
        System.out.println("MainPage heading :" + mainPage.getText());
        String mainTitle = driver.getTitle();
        System.out.println("Main Page title :" + mainTitle);

        System.out.println("============================================TASK5==============================================================");

       // 🔹 Task 6 — InvalidSelectorException

        try{
            WebElement wrongUserName = driver.findElement(By.xpath("//input[@id='username'"));
            wrongUserName.sendKeys("Ananya QA");
        } catch (InvalidSelectorException e){
            System.out.println("InvalidSelectorException occurred");
        }

        userNameTextbox.clear();
        By username1 = By.xpath("//input[@id='username']");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement userNameTextbox1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(username1));
        userNameTextbox1.sendKeys("Ananya Selenium Final ");
        System.out.println("UserName TextBox :" + userNameTextbox1.getAttribute("value"));

        System.out.println("============================================TASK6==============================================================");

        driver.quit();

    }
}
