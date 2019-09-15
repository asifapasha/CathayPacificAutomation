package com.automation.Steps;

import com.automation.Pages.SelectDepartingFlightPage;
import cucumber.api.java.en.Then;

public class SelectDepartingFlightSteps {
    SelectDepartingFlightPage selectDepartingFlightPage = new SelectDepartingFlightPage();

    @Then("^verify flight booking results$")
    public void verify_flight_booking_results() {
        selectDepartingFlightPage.verifyFlightBookingResults();
    }
}