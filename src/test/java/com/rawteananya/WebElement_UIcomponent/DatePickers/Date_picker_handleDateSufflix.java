package com.rawteananya.WebElement_UIcomponent.DatePickers;
public class Date_picker_handleDateSufflix {


    /*Step 1 — Understand the basic rule
For most dates:
1 → st
2 → nd
3 → rd
Everything else → th

    if(day %10==1)
   {
        return "st";
    }else-if(day%10==2)

    {
        return "nd";
    }
    else-if(day%10==3)
    {
        return "rd"
    }
    else{
        return "th";
    }

    But there is a problem. ❗

What about:
11,12,13
According to English date formatting:
11 → 11th
12 → 12th
13 → 13th
So we need to handle these special cases first.

if (day >= 11 && day <= 13) {
    return "th";
}
*/

    // so combining them :
    public static String getDateSuffix(int day) {

        if (day >= 11 && day <= 13) {
            return "th";
        }

        if (day % 10 == 1) {
            return "st";
        } else if (day % 10 == 2) {
            return "nd";
        } else if (day % 10 == 3) {
            return "rd";
        } else {
            return "th";
        }
    }
        public static void main(String[] args){
            System.out.println(getDateSuffix(1));
            System.out.println(getDateSuffix(2));
            System.out.println(getDateSuffix(3));
        }
    }
