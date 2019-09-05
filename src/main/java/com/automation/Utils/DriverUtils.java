package com.automation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.ConfigUtils.loadProperties;

public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("application.url"));
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
     //   driver.quit();
        driver = null;
    }

    /*   public void closeDriver() {

           driver.close();
       }
   */
    public static void main(String[] args) {
        getDriver();
    }
}