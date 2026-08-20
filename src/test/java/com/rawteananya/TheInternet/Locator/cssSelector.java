package com.rawteananya.TheInternet.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class cssSelector {
    public static void main(String[] args) throws InterruptedException {

        /* cssSelector
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // CSS Selector : A CSS selector is another way to identify an HTML element.

    //    driver.get("https://the-internet.herokuapp.com/login");
        //Maximize a window
     //   driver.manage().window().maximize();

        // Username Element:- <input type="text" name="username" id="username" fdprocessedid="nfrc0f">

       // 1. ID selector using "#"
      //  WebElement username = driver.findElement(By.cssSelector("#username"));
       // username.sendKeys("tomsmith");

        //2. tag Selector : By.cssSelector("input")

      //  WebElement username = driver.findElement(By.cssSelector("input"));
       // username.sendKeys("tomsmith");

        // 3. Attribute Selector : tag[attribute='value'] eg :input[name='username']

        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        username.sendKeys("tomsmith");

        // 4. Multiple Attribute Selector: eg input[name='password'][id='password']

        WebElement password = driver.findElement(By.cssSelector("input[name='password'][id='password']"));
        password.sendKeys("ABCtest123");

        // Wait for 3 second
        Thread.sleep(3000);

        // browser quit/close
        driver.quit();

*/

        // For class selector using "https://demoqa.com/text-box" this url
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/text-box");

        //Maximize a window
        driver.manage().window().maximize();

      //  full name element:
        //  <input autocomplete="off" placeholder="Full Name" id="userName" class=" mr-sm-2 form-control" type="text" fdprocessedid="oama36g">

        WebElement fullname = driver.findElement(By.cssSelector(".mr-sm-2.form-control"));
        fullname.sendKeys("XYYZZ JHSVD");


        // Wait for 3 second
        Thread.sleep(3000);

        // browser quit/close
        driver.quit();

    }
}
