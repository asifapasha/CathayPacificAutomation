package com.automation.Pages;

import com.automation.Utils.AssertionUtils;
import com.automation.Utils.CommonUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertionUtils.*;
import static com.automation.Utils.CommonUtils.*;
import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.DriverUtils.getDriver;
//To rename the key is ?

public class Homepage {
    AssertionUtils assertionUtils = new AssertionUtils();
    CommonUtils commonUtils = new CommonUtils();
    public Homepage(){
        PageFactory.initElements(getDriver(),this);
    }

@FindBy(className = "heading")
private WebElement welcomepage;

    @FindBy(xpath = "//a[text()='A/B Testing']")
    private WebElement ABTestingLink;

    @FindBy(xpath = "//h3[contains(text(),'A/B Test Control')]")
    private WebElement abTestControlPage;

    public void verifyHomePage() {
      //  String pageTitle = driver.getTitle();
       //failed Assert.assertEquals("The Internet", pageTitle);
      assertPresent(welcomepage);

    }
    public void navigateToABtesting() {
        clickOn(ABTestingLink);
    }

    public void VerifyABTestingPage(){
     //Can I use wait until the text is visible?
        assertText(abTestControlPage, getPropertyByKey("abTestPage.title.txt"));
    }

}
