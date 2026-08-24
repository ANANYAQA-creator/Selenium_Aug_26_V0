package com.rawteananya.BrowserNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandle_windowHandles {
    public static void main(String[] args) throws InterruptedException {

        /*Flow
Parent Window
      ↓
Click "Click Here"
      ↓
Child Window opens
      ↓
Get all window handles
      ↓
Switch to Child
      ↓
Perform action
      ↓
Switch back to Parent

*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        // parentWindow
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        // click Here
        WebElement clickHere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
        clickHere.click();

        //Child Window opens
        Thread.sleep(2000);
        //Get all window handles

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        //Switch to Child : here using for loop and if condition

        for (String windowHandle : windowHandles){
            if(!windowHandle.equals(parentWindow)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        /*The logic is:

parentWindow = ABC
windowHandles = [ABC, XYZ]

ABC.equals(ABC) → true
!true → false

XYZ.equals(ABC) → false
!false → true
        ↓
switchTo().window(XYZ)
So Selenium switches to the child.
*/

        // Perform action
        String title = driver.getTitle();
        System.out.println(title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //Switch back to Parent
        driver.switchTo().window(parentWindow);

        // quit
        driver.quit();


    }
}
