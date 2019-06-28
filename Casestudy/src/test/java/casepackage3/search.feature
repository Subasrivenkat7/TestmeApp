

Feature: Search


 
  Scenario:User search
    Given user enters the username "lalitha"
    And user enters the password "password123"
    Then user click login button
    Then user search product "hea"
    Then user click Find details
   
