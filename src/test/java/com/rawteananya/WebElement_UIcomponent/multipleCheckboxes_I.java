package com.rawteananya.WebElement_UIcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleCheckboxes_I {

        public static void main (String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/checkbox");
            driver.manage().window().maximize();

            WebElement homeCheckbox = driver.findElement(By.cssSelector(".rc-tree-switcher.rc-tree-switcher_close"));
            homeCheckbox.click();

            // Desktop
            WebElement desktopCheckbox = driver.findElement(By.xpath("//span[@aria-label='Select Desktop']"));
            System.out.println("Desktop Before Selected : " + desktopCheckbox.isSelected());

            if (!desktopCheckbox.isSelected()) {
                desktopCheckbox.click();
            }
            System.out.println("Desktop After Selected : " + desktopCheckbox.isSelected());

            //Download
            WebElement downloadCheckbox = driver.findElement(By.xpath("//span[@aria-label='Select Downloads']"));
            System.out.println("Download Before Selected : " + downloadCheckbox.isSelected());

            if (!desktopCheckbox.isSelected()) {
                downloadCheckbox.click();
            }
            System.out.println("Download After Selected : " + downloadCheckbox.isSelected());

            driver.quit();
    }
}
