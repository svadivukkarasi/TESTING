Feature:User should be able to register successfully
  with valid details
  @reg
  Scenario: Registration process
    Given The user is on homepage"https://en-gb.facebook.com"
    When The user enters firstname "Jia" lastname "mark"
    Then The user enters email "jiamark2000@gmail.com"
    And The user re-enters email "jiamark2000@gmail.com"
    And the user enters password "JM@123"
    And the user enters date of birth "15/04/1988"
    And the user clicks gender
    Then the user clicks signup
