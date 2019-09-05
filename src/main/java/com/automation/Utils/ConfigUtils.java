package com.automation.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\config.properties")));
            prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\messages.properties")));
            System.out.println(prop);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        loadProperties();
    }
}
