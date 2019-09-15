Feature: booking flight
  @test
Scenario:Verify that the user is able to book a flight
  Given user is on cathaypacific homepage
  When user enters the flight details
  Then verify flight booking results