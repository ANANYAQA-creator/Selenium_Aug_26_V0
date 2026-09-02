package com.rawteananya.Alert_Window_Frame.Frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_NestedFrame {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        // ParentFrame
        WebElement parentFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(parentFrame);

        // Middle Frame/ChildFrame
        WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(middleFrame);

        WebElement text = driver.findElement(By.id("content"));
        System.out.println("Text : " + text.getText());

        // return to parent frame
        driver.switchTo().parentFrame();

        // mainPage
        driver.switchTo().defaultContent();

         driver.quit();
    }
}
