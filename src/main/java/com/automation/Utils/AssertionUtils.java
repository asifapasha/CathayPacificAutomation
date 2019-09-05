package com.automation.Utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.automation.Utils.WebDriverElements.waitForNotVisible;
import static com.automation.Utils.WebDriverElements.waitForVisible;

public class AssertionUtils {
    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s is not present", element.getText()), element.isDisplayed());
    }

    public static void assertNotPresent(WebElement element) {
        waitForNotVisible(element);
        Assert.assertFalse(String.format("Element %s is not present", element.getText()), element.isDisplayed());
    }

    public static void assertText(WebElement element, String expectedValue) {
        Assert.assertTrue(String.format("Assertion on text is failing for %s", element.getText()), element.getText().contains(expectedValue));
    }
}
