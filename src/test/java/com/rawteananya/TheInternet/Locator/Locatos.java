package com.rawteananya.TheInternet.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locatos {

    public static void main(String[] args) throws InterruptedException {

        /* Locators : A locator is a way to identify a particula web element on a webpage so Selenium can perform an action on it.
        For example:  WebElement username = driver.findElement(By.id("username"));

        Here:-
        findElement() → finds the element
        By.id() → tells Selenium how to find it
        "username" → tells Selenium which value to look for

        2. Selenium's 8 Locators
        Locator	Syntax
        ID	: By.id("username")
        Name :	By.name("username")
        Class Name :	By.className("form-control")
        Tag Name :	By.tagName("input")
        Link Text : 	By.linkText("Login")
        Partial Link Text :	By.partialLinkText("Log")
        CSS Selector :	By.cssSelector("#username")
        XPath	: By.xpath("//input[@id='username']")

        // Launch the The internet website
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        // Username Field : <input type="text" name="username" id="username" fdprocessedid="ib3csr">
        // xpath of username field = //input[@id="username"]
        // CSS selector : #username


       Ist Exercise
        Open Login page
       ↓
        Find Username using ID
       ↓
        Enter "tomsmith"
       ↓
        Find Password using ID
       ↓
        Enter "SuperSecretPassword!"
       ↓
        Find Login button
       ↓
        Click
       ↓
        Wait 3 seconds
       ↓
        Quit browser

        // Open Login Page

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/login");

        // window maximize
        driver.manage().window().maximize();

        // Username Field
        WebElement username = driver.findElement(By.id("username"));
        //username sendkeys
        username.sendKeys("tomsmith");

        //Password Field
        WebElement password = driver.findElement(By.id("password"));
        // password send keys
        password.sendKeys("SuperSecretPassword!");

        //Login Button
        WebElement loginbtn = driver.findElement(By.xpath("//i[normalize-space()=\"Login\"]"));
        //loginbutton click
        loginbtn.click();

        //wait for 3 second : using implicit wait here

       Thread.sleep(3000);

        // Quit Browser
        driver.quit();



        🔥Next: Link Text & Partial Link Text
        On the same login page, inspect the "Elemental Selenium" link at the bottom.

        By.linkText("")
        By.partialLinkText("") */

        // Open Login Page

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/login");

        // partialLinkText
        WebElement partialLinkText = driver.findElement(By.partialLinkText("Elemental"));
        partialLinkText.click();


        // linktext
       // WebElement linkText = driver.findElement(By.linkText("Elemental Selenium"));
       // linkText.click();

        Thread.sleep(3000);

        driver.quit();


/*Username field : On the same login page, find the Username element using:

By.id()
By.name()
By.cssSelector()
By.xpath()

Ans:
By.id("username")
By.name("username")
By.cssSelector("#username")
By.xpath("//input[@id='username'])

Password Field :Inspect the Password field on the same page and create these 4 locators:

By.id()
By.name()
By.cssSelector() using the type attribute
By.xpath() using the type attribute

Ans
By.id("password")
By.name("password")
By.cssSelector("input[type='password']")
By.xpath("//input[@type='password']")

🔥 Next: Class Name & Tag Name for username
USername : <input type="text" name="username" id="username" fdprocessedid="ib3csr">

1. What would be the By.tagName() locator?
Ans By.tagName("input")
2. What would be the By.className() locator?
Ans there is no class

🔥Next: Link Text & Partial Link Text
On the same login page, inspect the "Elemental Selenium" link at the bottom.

By.linkText("Elemental Selenium")
By.partialLinkText("Elemental")

You now know all 8 Selenium locator strategies
1. By.id()
2. By.name()
3. By.className()
4. By.tagName()
5. By.linkText()
6. By.partialLinkText()
7. By.cssSelector()
8. By.xpath()*/


    }
}
