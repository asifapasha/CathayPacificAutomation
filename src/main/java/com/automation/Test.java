package com.automation;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.automation.Utils.DriverUtils.getDriver;


public class Test {

    public static void swipTODirection(direction dir) {
        switch (dir) {
            case down:
               scrollDown();
            case up:
                scrollUp();
            case left:
                swipeleft();
            case right:
                swiperight();

        }
    }

    public static void scrollDown() {
        //code for scrolling
    }

    public static void scrollUp() {
        //code for scrolling
    }

    public static void swipeleft() {
        //code for scrolling
    }
    public static void swiperight() {
        //code for scrolling
    }
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date parsingDate = simpleDateFormat.parse("18/09/2019");
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsingDate);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DATE);

            System.out.println(year + "===========================" + month + "===================" + day);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        swipTODirection(direction.left);
    }
}
