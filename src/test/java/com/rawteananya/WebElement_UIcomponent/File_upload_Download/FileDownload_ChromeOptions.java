package com.rawteananya.WebElement_UIcomponent.File_upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class FileDownload_ChromeOptions {
    public static void main(String[] args){

        // Create Download directory
        Path downloadDirectory = Paths.get(System.getProperty("user.dir"),"downloads");

        // create pathdirectory
        try {
            Files.createDirectories(downloadDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Configure ChromeOptions
        ChromeOptions chromeOptions = new ChromeOptions();

        Map<String,Object> prefs = new HashMap<>();
        prefs.put("download.default_directory",downloadDirectory.toAbsolutePath().toString());
        prefs.put("download.prompt_for_download",false);
        prefs.put("download.directory_upgrade",true);

        chromeOptions.setExperimentalOption("prefs",prefs);

        // Launch Chrome
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.sreenidhirajakrishnan.com/practice#section-17");

        // Locate download button
        WebElement downloadButton = driver.findElement(By.id("download-btn"));
        // click Download button
        downloadButton.click();

        // Expected downloaded file path
        Path downloadedFile = downloadDirectory.resolve("practice.txt");

        // wait until File is downloaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean fileDownloaded = wait.until(driver1 -> Files.exists(downloadedFile));

        System.out.println("Download Directory :" + downloadDirectory);
        System.out.println("Downloaded File :" + downloadedFile);
        System.out.println("File Downloaded :"+ fileDownloaded );

        driver.quit();


/*
Code Explaination :-

 Create download directory path

Path downloadDirectory =Paths.get(  System.getProperty("user.dir"),  "downloads" );

This is VERY important.

Let's break it down.
System.getProperty("user.dir")
Returns the current project's working directory.

For example:
C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium_Aug_26_V0

Then:
"downloads"
adds the downloads folder.

So the final path becomes something like:
C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium_Aug_26_V0\downloads

Paths.get()
Combines the path components into a proper Path.
So:

user.dir
   +
downloads
   ↓
downloadDirectory

----------
Create the directory
try {
    Files.createDirectories(downloadDirectory);
} catch (IOException e) {
    throw new RuntimeException(e);
}
What does this do?

It physically creates:
downloads
if it doesn't already exist.

Files.createDirectories()
Files.createDirectories(downloadDirectory);
Means:
Create this directory and any missing parent directories.
If the directory already exists, that's okay.

Why try-catch?
Because Java's file operations can throw an IOException.
So Java requires us to handle it.

catch (IOException e)
catches that error.

throw new RuntimeException(e)
If directory creation fails, we stop the test/program and report the exception.

Create ChromeOptions
ChromeOptions chromeOptions = new ChromeOptions();

This creates a configuration object for Chrome.

Think of it as:

ChromeOptions
      ↓
Configure Chrome
      ↓
Start Chrome
------------------------------
Create preferences map

Map<String,Object> prefs = new HashMap<>();

We're creating a map containing Chrome preferences.
Think of it as:

Preference                         Value
------------------------------------------------
download.default_directory         downloads
download.prompt_for_download       false
download.directory_upgrade        true

The String represents the preference name.

The Object allows different types of values:
String
Boolean
Integer
etc.
-------------------------------------
Set download directory
prefs.put(
    "download.default_directory",
    downloadDirectory.toAbsolutePath().toString()
);

This tells Chrome:

Whenever you download a file, put it in this directory.
downloadDirectory

Our Path object:
.../Selenium_Aug_26_V0/downloads

.toAbsolutePath()
Makes sure we have the complete absolute path.

.toString()
Converts the Path into a String.

So ultimately Chrome receives something like:
C:\Users\Black Panther\...\Selenium_Aug_26_V0\downloads
--------------------------------------------
 Disable download prompt
prefs.put(
    "download.prompt_for_download",
    false
);

This tells Chrome:

Don't ask me where to save the downloaded file.

Without automation-friendly configuration, the browser may show a download prompt.
We want the download to happen automatically.
------------------------------------------------
Directory upgrade
refs.put("download.directory_upgrade", true);

This tells Chrome to allow the configured download directory to be used/upgraded as needed.
-------------------------------------
Apply preferences
chromeOptions.setExperimentalOption("prefs", prefs);

This is the line that actually attaches our preferences to Chrome.

Think:

prefs
  ↓
ChromeOptions
  ↓
ChromeDriver

Without this line, creating the Map wouldn't configure Chrome.
----------------------------------------------
Launch Chrome
WebDriver driver = new ChromeDriver(chromeOptions);

Normally we write:

WebDriver driver = new ChromeDriver();

But now we're passing our configuration:

new ChromeDriver(chromeOptions)

So Chrome starts with our custom download settings.
-------------------------------
Create expected downloaded file path
Path downloadedFile =
        downloadDirectory.resolve("practice.txt");

This is another important Java NIO concept.

If:

downloadDirectory =
.../Selenium_Aug_26_V0/downloads

then:

downloadDirectory.resolve("practice.txt")

produces:

.../Selenium_Aug_26_V0/downloads/practice.txt
Why resolve()?

It safely combines:

Directory
+
File

instead of manually concatenating strings.
===========================================
🧠 Entire code in simple language

Your code is basically doing this:

1. Find/create downloads folder
            ↓
2. Tell Chrome:
   "Download files into this folder"
            ↓
3. Open website
            ↓
4. Click Download
            ↓
5. Expected file = practice.txt
            ↓
6. Explicitly wait until
   practice.txt exists
            ↓
7. Print success
            ↓
8. quit()
============================================*/
    }
}
