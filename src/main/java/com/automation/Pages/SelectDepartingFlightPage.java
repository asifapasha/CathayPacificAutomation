package com.automation.Pages;

import com.automation.Utils.AssertionUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertionUtils.assertPresent;
import static com.automation.Utils.DriverUtils.getDriver;

public class SelectDepartingFlightPage {
    public SelectDepartingFlightPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h2[contains(@class,\"ribe-page-title\")]")
    private WebElement selectFlighttitleText;

    public void verifyFlightBookingResults(){
        assertPresent(selectFlighttitleText);
    }

}
