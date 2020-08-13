Feature: Lets go to google

  Scenario: User goes to Google Main Page
    Given user navigates "https://www.google.com"
    When user enters "Selenium" to "Search_Button" area
    Then user views "number_of_results"

  Scenario: User logins Facebook
    Given user navigates "https://www.facebook.com"
    When user enters "erdierdinet@gmail.com" to "Facebook_Email" area
    And user enters "1234567" to "Facebook_Password" area
    And user clicks "Facebook_Login"
    Then user should see "Login_Facebook" page

  Scenario: user logins Twitter
    Given user navigates "https://twitter.com/login"
    When user enters "deneme" to "Username" area
    And user enters "deneme" to "password" area
    And user move "picture" to "attachment" area
    And user move to " " area