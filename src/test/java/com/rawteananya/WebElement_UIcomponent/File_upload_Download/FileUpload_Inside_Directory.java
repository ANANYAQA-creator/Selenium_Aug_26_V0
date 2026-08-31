package com.rawteananya.WebElement_UIcomponent.File_upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class FileUpload_Inside_Directory {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-16");
        driver.manage().window().maximize();


        // When file is in Project Directory
        WebElement fileUpload = driver.findElement(By.id("file-upload"));

        /* Java provides Paths for platform-independent path handling:
        String filePath = Paths.get(
                System.getProperty("user.dir"),
                "testdata",
                "selenium_test_projectDirectory.txt"
        ).toString();

        ⭐ One interview point
If asked:
Why use Paths.get() instead of hard-coded paths?
Answer:
It helps construct file paths dynamically and makes the automation code platform-independent and easier to maintain.
        */

        String filePath = Paths.get(System.getProperty("user.dir"),"testdata","selenium_test_projectDirectory.txt").toString();
        System.out.println(filePath);
        fileUpload.sendKeys(filePath);

        // file upload verification
        WebElement fileUploaded = driver.findElement(By.xpath("//p[@data-testid='file-upload-result']"));
        System.out.println("Uplaoded FileName : " + fileUploaded.getText());
        driver.quit();
    }
}
