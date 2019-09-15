package com.automation.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.DriverUtils.driver;
import static com.automation.Utils.DriverUtils.getDriver;

public class WebDriverElements {
    static Long timeOut = Long.parseLong(getPropertyByKey("default.timeout"));
    static WebDriverWait wait = new WebDriverWait(getDriver(), timeOut);

    public static void waitForVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebElement createDynamiclocators(String loc){
        String xpath = "//*[text()='%s']";
       return driver.findElement(By.xpath(String.format(xpath,loc)));
    }

    public static void waitForNotVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeSelected(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**\
     *  element: On which element we want to perfome action e
     *   date: WHich date i want to select from calander
     *   Format: which format i want to pass
     * @param element : returningDate--WebElement
     * @param date   18/09/2019
     * @param format :   dd/MM/yyyy
     */

    public static void selectDateFromPicker(WebElement element, String date, String format) {
        element.click();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            Date parsingDate = simpleDateFormat.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsingDate);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DATE);

            String dynamicXpath = "//*[@data-date-picker='book-trip']//*[@class='ui-datepicker-calendar']//*[@data-month='%s' and @data-year='%s']//a[text()='%s']";
            dynamicXpath = String.format(dynamicXpath, month, year, day);

            driver.findElement(By.xpath(dynamicXpath)).click();

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
