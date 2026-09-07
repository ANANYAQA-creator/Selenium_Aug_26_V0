package com.rawteananya.SeleniumException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class NoSuchWindow_demo {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/Black%20Panther/Desktop/AI%20Learn/SWITCH'2026/no-such-window-demo.html");
        driver.manage().window().maximize();

        //Main Window
        String mainWindow = driver.getWindowHandle();
        System.out.println("MainWindow :" + mainWindow);

        // main Window Section
        WebElement mainWindowSection = driver.findElement(By.id("mainSection"));
        System.out.println("MainWindow Section Before :"+ mainWindowSection.getText());


        //Click "Open New Window"
        WebElement openNewWindowButton = driver.findElement(By.id("openWindowButton"));
        openNewWindowButton.click();

        //Get all Window Handles
        Set<String> allWindows = driver.getWindowHandles();
        for (String newWindow : allWindows) {
            if (!newWindow.equals(mainWindow)) {
                driver.switchTo().window(newWindow);
            }
        }
        System.out.println("New Window Title :" + driver.getTitle());

        String  newWindowHandle = driver.getWindowHandle();
        System.out.println("NewWindow Handle :" + newWindowHandle);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement newWindowSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newWindowSection")));

        WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newWindowInput")));
        textBox.sendKeys("Ananya QA");

        WebElement clickbtn = driver.findElement(By.id("newWindowButton"));
        clickbtn.click();

        WebElement clickBtnMsg = driver.findElement(By.id("newWindowResult"));
        System.out.println("Successfull msg of Click :" + clickBtnMsg.getText());

        driver.close();

        // try to switch to new window

        try {
            driver.switchTo().window(newWindowHandle);
        }
        catch(NoSuchWindowException e){
                System.out.println("NoSuchWindowException occured");
            }

        // switched to mainWindow
        driver.switchTo().window(mainWindow);
       // Verify Main Window section
        System.out.println("mainwindow_After :" + mainWindow );
        System.out.println("MainWindow Section After :" + mainWindowSection.getText());

        driver.quit();

    }
}

/* O/p
MainWindow :f0f91362-ddc7-48c0-8c82-bc9b431f8c7d
MainWindow Section Before :This is the Main Window section.
New Window Title :New Window
NewWindow Handle :9def47b2-e4d0-459e-b35a-b64803c1249d
Successfull msg of Click :Button clicked successfully
NoSuchWindowException occured
mainwindow_After :f0f91362-ddc7-48c0-8c82-bc9b431f8c7d
MainWindow Section After :This is the Main Window section.*/