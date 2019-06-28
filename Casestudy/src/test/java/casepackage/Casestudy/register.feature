
@tag
Feature: Registration 
  

  @tag1
  Scenario: Register
    Given Testme app is displayed
    And  user click the signup button
    Then user is on the register page
    Then user enter User name "venki"
    Then user enter the First Name "venkat"
    Then user enter the Last Name "ramanan"
    Then user enter the password "suba7venkat"
    Then user enter the confirm password "suba7venkat"
    Then user enter the click the Gender
    Then user enter the E-mail "venksuba7@gmail.com"
    Then user enter the Mobile Number  "7708880296"
    Then user enter the DOB "07/12/1997"
    Then user enter the Address "kumbakonam"
    Then user enter click the  Security Question "what is your birth place"
    Then user enter the answer "vilupuram"
		And User click the register button
