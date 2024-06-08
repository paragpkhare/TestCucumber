Feature: Visit Parabank website
@Smoke

  Scenario: Test Parabank Website home page invalid user name and password

    Given User opens Parabank website in chrome
    When User enters incorrect username and password in the text fields and click on Login button in chrome
    Then User should see the error message in chrome