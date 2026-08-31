package com.rawteananya.WebElement_UIcomponent.DatePickers;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Datepicker_LocalDate {
    public static void main(String []args){

        LocalDate targetDate = LocalDate.of(2026, 12, 15);

        int date = targetDate.getDayOfMonth();
        Month month = targetDate.getMonth();
        int year = targetDate.getYear();
        String day_Name = targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH);
        String month_Name = targetDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println("Date : " + date);
        System.out.println("Month : " + month);
        System.out.println("Year : " + year);
        System.out.println("Day Name : " + day_Name);
        System.out.println("Month Name : " + month_Name);


    }
}
