Feature: AB testing page navigation test
  @Smoketest
  Scenario: Automate navigation to HerokuApp
    Given Verify that user is on herokuapp homepage
    When User clicks on AB testing link
    Then User navigates to AB Testing page

  @Smoketest
  Scenario: Automate navigation to HerokuApp
    Given Verify that user is on herokuapp homepage
    Then verify "Key Presses" link on homepage
    Then verify "Frames" link on homepage



