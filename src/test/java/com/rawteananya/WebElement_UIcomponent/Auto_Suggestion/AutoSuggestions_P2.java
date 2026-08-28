package com.rawteananya.WebElement_UIcomponent.Auto_Suggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoSuggestions_P2 {
    public static void main(String[] args) {

/*
🎯 Exercise 4.6.2 — Select a Specific Suggestion
Task
Type:r
Then:
Wait for suggestions.
Get all suggestions using findElements().
Loop through them.
Print each suggestion.
If the suggestion text matches a destination you choose, click it.
Break the loop after clicking.

*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.agoda.com/en-in/country/india.html?site_id=1922866&tag=6baf0092-ba12-4227-a109-d643e16d2b9b&gad_source=1&gad_campaignid=21255828605&gbraid=0AAAAA9_WXQoAAq0k-js5teskcAsCfTTJB&gclid=CjwKCAjw48TUBhBREiwAK0GnQfFWx5wzinwLgsr60LwDNumR5GmBEzq6HbE5q0WJkR1CVoOsJWeVmxoCO0YQAvD_BwE&ds=MwAGFgCApzgJe5fh");
        driver.manage().window().maximize();

        // Search Box
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Enter a destination or property']")
        );

        // Enter search text
        searchBox.sendKeys("r");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Suggestion locator
        By suggestionLocator = By.cssSelector("span[data-selenium='suggestion-text']");

        // Wait until at least one suggestion is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionLocator));

        // Get all suggestions
        List<WebElement> allSuggestion = driver.findElements(suggestionLocator);
        boolean suggestionFound = false;

        // Print and select required suggestion
        for (WebElement suggestion : allSuggestion)
        {String suggestionText = suggestion.getText().trim();
            System.out.println("Suggestion: " + suggestionText
            );

            if (suggestionText.equalsIgnoreCase("Rome")) {
                suggestion.click();
                suggestionFound = true;
                break;
            }
        }

        // Verify selection
        if (suggestionFound) {
            String selectedSuggestion =
                    searchBox.getAttribute("value");
            System.out.println(
                    "Selected Suggestion: " +
                            selectedSuggestion
            );
            if (selectedSuggestion
                    .toLowerCase()
                    .contains("rome")) {
                System.out.println(
                        "Suggestion selected successfully"
                );

            } else {
                System.out.println("Suggestion selection verification failed"
                );
            }
        } else {
            System.out.println(
                    "Required suggestion 'Rome' not found"
            );
        }

        // Total suggestions
        System.out.println("Total No. of Suggestions: " + allSuggestion.size());
        driver.quit();
    }
}