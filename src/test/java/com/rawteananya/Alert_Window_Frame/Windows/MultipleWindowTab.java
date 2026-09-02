package com.rawteananya.Alert_Window_Frame.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class MultipleWindowTab {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        // Parent Window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window Handle :" + parentWindow);

        // click clicks here
        WebElement clickHere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
        clickHere.click();

        // Get all window handle
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total windowns : " + allWindows.size());

        // switch to child window
        for (String childWindow : allWindows) {
            if (!childWindow.equals(parentWindow)) {
                driver.switchTo().window(childWindow);
                break;
            }
        }

        //  Prints the child window's title.
        String childwindowTitle = driver.getTitle();
        System.out.println("childWindowTitle : " + childwindowTitle);
        // current Child Window URL
        String childwindowUrl = driver.getCurrentUrl();
        System.out.println("childwindowURL : " + childwindowUrl);

        //  perform action on child page Prints the text on the child page.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement childwindowText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='New Window']")));
        System.out.println("Child Window Text : " + childwindowText.getText());

        // close the child window
        driver.close();

        // switch back to parent window
        driver.switchTo().window(parentWindow);

        // parent window Title
        String parentWindwoTitle = driver.getTitle();
        System.out.println("ParentWindowTitle :" + parentWindwoTitle);

        driver.quit();

    }
}