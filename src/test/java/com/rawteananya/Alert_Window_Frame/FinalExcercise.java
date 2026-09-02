package com.rawteananya.Alert_Window_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalExcercise {
    public static void main(String [] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();


        /*
        Part 1 — Simple Alert
Click Click for JS Alert
Switch to alert
Print alert text
Accept it
Print the page result

*/
        WebElement jsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("AlertText : "+ alertText);
        alert.accept();
        WebElement pageResultJSALert = driver.findElement(By.id("result"));
        System.out.println("PageResult JS Alert :" + pageResultJSALert.getText());


        /*Part 2 — Confirmation Alert
Click Click for JS Confirm
Switch to alert
Print alert text
Dismiss it
Print the page result
*/
        WebElement jsConfirm = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        jsConfirm.click();
        alert = driver.switchTo().alert();
        String alertJsConfirmText = alert.getText();
        System.out.println("AlertText : "+ alertJsConfirmText);
        alert.dismiss();
        WebElement pageResultJSConfirm = driver.findElement(By.id("result"));
        System.out.println("PageResult JS confirm :" + pageResultJSConfirm.getText());

        /*Part 3 — Prompt Alert
Click Click for JS Prompt
Switch to alert
Print alert text
Enter "Ananya"
Accept it
Print the page result
*/
        WebElement jsPrompt= driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        jsPrompt.click();
        alert=  driver.switchTo().alert();
        String jsPromptText = alert.getText();
        System.out.println("JS Prompt Alert Text : "+jsPromptText );
        alert.sendKeys("Ananya");
        alert.accept();
        WebElement pageResultJSPrompt = driver.findElement(By.id("result"));
        System.out.println("PageResult JS Prompt :" + pageResultJSPrompt.getText());

        driver.quit();
    }
}
/*O/p
AlertText : I am a JS Alert
PageResult JS Alert :You successfully clicked an alert
AlertText : I am a JS Confirm
PageResult JS confirm :You clicked: Cancel
JS Prompt Alert Text : I am a JS prompt
PageResult JS Prompt :You entered: Ananya
*/