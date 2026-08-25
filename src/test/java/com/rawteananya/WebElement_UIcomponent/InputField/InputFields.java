package com.rawteananya.WebElement_UIcomponent.InputField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputFields {

    /*Open Text Box
      ↓
Enter Full Name
      ↓
Enter Email
      ↓
Enter Current Address
      ↓
Enter Permanent Address
      ↓
Click Submit
      ↓
Validate submitted data

*/

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Ananya Rawte");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("ananya@test.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Pune, Maharashtra");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Nagpur, Maharashtra");


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Get entered Full Name using getAttribute("value")
        String username_text = userName.getAttribute("value");
        System.out.println("Full Name : " + username_text);

        //Validate/display submitted Full Name using getText()
        WebElement outputName = driver.findElement(By.id("name"));
        System.out.println("Submitted Name : " + outputName.getText());

        driver.quit();

        // Q. Why do we use getAttribute("value") before submitting, but getText() for the submitted output?
        // Ans. Better explanation:
        //We use getAttribute("value") to retrieve the value entered inside an input field because the entered data is stored in the value attribute.
        //We use getText() on the submitted output because the submitted result is displayed as text inside the element.

        //⭐ Interview-ready version
        // For input fields, I use getAttribute("value") to retrieve the entered value.
        // For normal visible text elements, I use getText() to retrieve the displayed text.
    }
}
