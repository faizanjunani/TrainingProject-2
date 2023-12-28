Feature: Request Timeoff

#  Background:
#    Given user is present on Atlas Login page

  Scenario: Submit a PTO Request
    Given user is present on Atlas Login page
    When user logins to Atlas with username and password
    Then user navigates to Time management tab
    When user clicks the request timeoff button
    And user is present on request timeoff popup
    And user selects option for PTO
    And user selects option for FromDate
    And user selects option for ToDate
    And user clicks the request button
    Then PTO should be submitted successfully