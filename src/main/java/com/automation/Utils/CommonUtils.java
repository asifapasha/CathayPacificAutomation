package com.automation.Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.automation.Utils.DriverUtils.getDriver;
import static com.automation.Utils.WebDriverElements.waitForVisible;

public class CommonUtils {
    public static void clickOn(WebElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void sendKeys(WebElement element, String text) {
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public static void scrollPage() {
        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void selectFromDropDown(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void acceptAlert() {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public static void denyAlert() {
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
    }

    public static void switchToFrame(String frameName) {
        getDriver().switchTo().frame(frameName);
    }

    public static WebElement createDynamicLocator(String name) {
        WebElement locator = getDriver().findElement(By.xpath(String.format("//*[@value='%s']", name)));
        return locator;
    }
}
