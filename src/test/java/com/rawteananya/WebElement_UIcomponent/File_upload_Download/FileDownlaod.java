package com.rawteananya.WebElement_UIcomponent.File_upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class FileDownlaod {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-17");
        driver.manage().window().maximize();

        // Locate download button
        WebElement downloadButton = driver.findElement(By.id("download-btn"));

        // Expected downloaded file path
        Path downloadPath = Paths.get(System.getProperty("user.home"),"Downloads","practice.txt");


        // click Download button
        downloadButton.click();

        // wait until  file exists
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean fileDownloaded = wait.until(driver1 -> Files.exists(downloadPath));

        // File download verification message
        WebElement fileDownlaoded = driver.findElement(By.xpath("//p[@data-testid='download-result']"));
        System.out.println("Downloaded FileName : " + fileDownlaoded.getText());

        // Verify Downloaded file :

        System.out.println("Downloaded Path :" + downloadPath);
        System.out.println("FileExists : " + Files.exists(downloadPath));

        driver.quit();

    }
}