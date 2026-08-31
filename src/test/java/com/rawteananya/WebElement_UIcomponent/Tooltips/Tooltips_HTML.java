package com.rawteananya.WebElement_UIcomponent.Tooltips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tooltips_HTML {
    public static void main(String[] args){

        /*
        HTML title Tooltip :
        For an HTML title tooltip, I retrieve the tooltip text directly using getAttribute("title")

        // <button id="save" title="Save changes">Save</button>
//HTML title tooltip:
Element
   ↓
getAttribute("title")

        WebElement element = driver.findElement(By.id("save"));
        String tooltip = element.getAttribute("title");
        System.out.println("Tooltip: " + tooltip);

       // O/P : Tooltip: Save changes

*/
    }
}
