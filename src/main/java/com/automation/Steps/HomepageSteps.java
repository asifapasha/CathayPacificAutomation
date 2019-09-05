package com.automation.Steps;

import com.automation.Pages.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageSteps {
    Homepage homepage = new Homepage();
@Given("^Verify that user is on herokuapp homepage$")
public void verify_that_user_is_on_herokuapp_homepage(){
        homepage.verifyHomePage();
    }

@When("^User clicks on AB testing link$")
public void user_clicks_on_AB_testing_link(){
        homepage.navigateToABtesting();
    }

  @Then("^User navigates to AB Testing page$")
public void user_navigates_to_AB_Testing_page() {
        homepage.VerifyABTestingPage();
    }
}

