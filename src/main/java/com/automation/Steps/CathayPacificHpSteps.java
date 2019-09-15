package com.automation.Steps;

import com.automation.Pages.CathayPacificHomePage;
import com.automation.direction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.automation.Test.swipTODirection;

public class CathayPacificHpSteps {
    CathayPacificHomePage cathayPacificHomePage = new CathayPacificHomePage();
    @Given("^user is on cathaypacific homepage$")
    public void user_is_on_cathaypacific_homepage(){
        cathayPacificHomePage.verifyUserOnHomepage();
    }

    @When("^user enters the flight details$")
    public void user_enters_the_flight_details() throws InterruptedException {
        cathayPacificHomePage.enterFlightdetails();
    }


}
