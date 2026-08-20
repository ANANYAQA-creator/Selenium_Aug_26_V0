package com.rawteananya.TheInternet.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_Descendant_Child {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        //
       // WebElement fullName =driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
       // fullName.sendKeys("ABCTest");





        /*
        1. Descendant selector — space
        Suppose the HTML structure is:
                <div class="parent">
                <div class="container">
                <input id="username">
                </div>
                </div>
        You can locate the input with:  By.cssSelector(".parent input")
        The space means:
       "Find input anywhere inside .parent, regardless of how deeply nested it is."
       2. Direct child selector — >

Consider:
<div class="parent">
    <input id="username">
</div>
You can use: By.cssSelector(".parent > input")
> means:
Find input that is a direct child of .parent.

Important difference
.parent input
➡️ input can be anywhere inside the parent.
.parent > input
➡️ input must be directly inside the parent.

3. CSS Attribute Operators ⭐
These are very useful for dynamic elements.
Suppose we have:

<input id="user123" name="username" class="form-control">

3.1 ^ — starts with
By.cssSelector("input[id^='user']")

Means:
ID starts with user.

Matches:

user123
username

3.2 $ — ends with
By.cssSelector("input[id$='123']")

Means:
ID ends with 123.

Matches:
user123

3.3 * — contains
By.cssSelector("input[id*='user']")

Means:
ID contains user.

Matches:
user123
username

🎯 Your practice task
Inspect the Full Name field.
Find its:
id
class
placeholder

Then create these CSS selectors:

A — Attribute equals
By.cssSelector("input[placeholder='_____']")
B — Attribute contains
By.cssSelector("input[placeholder*='_____']")
C — Tag + class
By.cssSelector("input._____")

Ans
<input autocomplete="off" placeholder="Full Name" id="userName" class=" mr-sm-2 form-control" type="text" fdprocessedid="0dhxrb4">

A — Attribute equals  =  By.cssSelector("input[placeholder='Full Name']")   [Find an input whose placeholder is exactly Full Name.]
B — Attribute contains = By.cssSelector("input[placeholder*='Full']")  [*= means contains. eg Full name , Full, My Full name]
C — Tag + class = = By.cssSelector("input.mr-sm-2.form-control") []

Automation rule : 🧠
Don't just find a locator that works. Find a locator that is stable.

🎯 CSS Selector Challenge — Final Round

Using this HTML:

<input autocomplete="off"
       placeholder="Full Name"
       id="userName"
       class="mr-sm-2 form-control"
       type="text"
       fdprocessedid="0dhxrb4">

Create these selectors:

1. ID using CSS
By.cssSelector("_____")

2. Tag + ID
By.cssSelector("_____")

3. Tag + class
Use only form-control:
By.cssSelector("_____")

4. Attribute starts-with ^=
Create a selector where the placeholder starts with Full:
By.cssSelector("_____")

5. Attribute ends-with $=
Create a selector where the placeholder ends with Name:
By.cssSelector("_____")

Ans.
<input autocomplete="off"
       placeholder="Full Name"
       id="userName"
       class="mr-sm-2 form-control"
       type="text"
       fdprocessedid="0dhxrb4">

1. ID using CSS : By.cssSelector("#userName")
2. Tag + ID : By.cssSelector("input[id='userName']")
3. Tag + class : By.cssSelector("input.form-control")
4. Attribute starts-with ^= : By.cssSelector("input[placeholder^='Full']")
5. Attribute ends-with $= By.cssSelector("input[placeholder$='Name']")

🎉 CSS Selectors — Completed
Rule: Prefer the simplest stable and unique locator.

#id
.class
tag
tag#id
tag.class
[attribute='value']
[attribute*='value']   → contains
[attribute^='value']   → starts with
[attribute$='value']   → ends with
[attribute1='x'][attribute2='y']
parent > child
parent child


*/


        // wait for 3 second
        Thread.sleep(3000);
        // quit driver
        driver.quit();

    }
}
