package com.automation.Pages;

import com.automation.Utils.AssertionUtils;
import com.automation.Utils.WebDriverElements;
import com.automation.bean.UserDataBean;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertionUtils.assertPresent;
import static com.automation.Utils.CommonUtils.clickOn;
import static com.automation.Utils.CommonUtils.sendKeys;
import static com.automation.Utils.DriverUtils.getDriver;
import static com.automation.Utils.WebDriverElements.selectDateFromPicker;

public class CathayPacificHomePage {
    // AssertionUtils assertionUtils = new AssertionUtils();
    UserDataBean bean = new UserDataBean();


    public CathayPacificHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id = "book-trip-tab")
    private WebElement bookAtrip;
    @FindBy(id = "depart-label")
    private WebElement leaveFromCity;
    @FindBy(id = "destination-label")
    private WebElement destinationCity;
    @FindBy(xpath = "//*[@data-ui-overlay-id=\"trip-dates-picker\" and contains(@aria-label,'Departing')]")
    private WebElement departingDate;
    @FindBy(xpath = "//*[@data-ui-overlay-id=\"trip-dates-picker\" and contains(@aria-label,'Returning')]")
    private WebElement returningDate;
    @FindBy(xpath = "//form[@class='trip-form']//*[@class=\"button-submit\"]")
    private WebElement searchFlightbtn;
    @FindBy(xpath = "//*[@data-date-picker='book-trip']//*[@class='ui-datepicker-calendar']//*[@data-month='%s' and @data-year='%s']//a[text()='%s']")
    private WebElement calenderDate;
    @FindBy(className = "brand-logo")
    private WebElement brandLogoImg;

public void verifyUserOnHomepage(){
       assertPresent(bookAtrip);
}

public void enterFlightdetails() throws InterruptedException {
    sendKeys(leaveFromCity, "Sydney");
    Thread.sleep(2000);
    leaveFromCity.sendKeys(Keys.TAB);
    Thread.sleep(2000);
   sendKeys(destinationCity, "Paris"+ Keys.TAB);
   selectDateFromPicker(departingDate, "18/09/2019", "dd/MM/yyyy");
   selectDateFromPicker(returningDate, "25/10/2019", "dd/MM/yyyy");
    clickOn(searchFlightbtn);

}
}


