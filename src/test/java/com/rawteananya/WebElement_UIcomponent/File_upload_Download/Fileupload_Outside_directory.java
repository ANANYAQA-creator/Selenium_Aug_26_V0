package com.rawteananya.WebElement_UIcomponent.File_upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload_Outside_directory {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-16");
        driver.manage().window().maximize();


        // When file is in desktop
        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        String filePath =  "C:\\Users\\Black Panther\\Desktop\\AI Learn\\SWITCH'2026\\selenium_test.txt";
        fileUpload.sendKeys(filePath);

        // file upload verification
        WebElement fileUploaded = driver.findElement(By.xpath("//p[@data-testid='file-upload-result']"));
        System.out.println("Uplaoded FileName : "+ fileUploaded.getText());
        driver.quit();

    }
}