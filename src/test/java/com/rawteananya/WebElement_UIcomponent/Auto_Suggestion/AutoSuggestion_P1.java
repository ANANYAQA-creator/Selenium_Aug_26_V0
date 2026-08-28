package com.rawteananya.WebElement_UIcomponent.Auto_Suggestion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class AutoSuggestion_P1 {
    public static void main(String[] args) {

        /*🎯 Exercise 4.6.1 — Find Auto-Suggestions
Flow
Open page
   ↓
Locate input
   ↓
Type "r"
   ↓
Suggestions appear
   ↓
findElements()
   ↓
Loop through suggestions
   ↓
Print suggestions

Your task
Write Selenium code to:
A. Locate the Type single color name input.
Inspect the HTML and choose a suitable locator.
B. Enter:r
using:sendKeys("r");
C. Locate all suggestions using:
findElements()
Store them in:
List<WebElement>
D. Print every suggestion using a for-each loop.
E. Print the total number of suggestions.


We're only practicing:
sendKeys()
     ↓
findElements()
     ↓
List<WebElement>
     ↓
for-each
*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.agoda.com/en-in/country/india.html?site_id=1922866&tag=6baf0092-ba12-4227-a109-d643e16d2b9b&gad_source=1&gad_campaignid=21255828605&gbraid=0AAAAA9_WXQoAAq0k-js5teskcAsCfTTJB&gclid=CjwKCAjw48TUBhBREiwAK0GnQfFWx5wzinwLgsr60LwDNumR5GmBEzq6HbE5q0WJkR1CVoOsJWeVmxoCO0YQAvD_BwE&ds=MwAGFgCApzgJe5fh");
        driver.manage().window().maximize();

        //searchBox
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Enter a destination or property']"));
        searchBox.sendKeys("r");

        // Wait to appear element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='Suggestion__categoryName_container']")));

        //Suggestion
        List<WebElement> allSuggestion = driver.findElements(By.xpath("//li[@class='Suggestion__categoryName_container']"));

        // print all suggestion
        for (WebElement suggestion : allSuggestion){
            System.out.println(suggestion.getText());
        }
        // total suggestion
        System.out.println("Total no. of Suggestion :" + allSuggestion.size());
        //quit
        driver.quit();
    }
}

