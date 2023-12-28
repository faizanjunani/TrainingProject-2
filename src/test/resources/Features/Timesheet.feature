Feature: Edit Timesheet

  Scenario: Edit Timesheet for a date
    Given user is present on Time Management tab
    When user vists Timesheet tab
    Then user opens the timesheet date range
    And user edits the timesheet for particular date
    Then user enters the starttime and endtime for that date
    Then user confirms his timesheet entry