Feature:
  User should be able to signup with valid credentials
  Scenario: User should be able to signup successfully
    Given  User Should be on the homepage"https://en-gb.facebook.com/"
    When the user enters firstname"Devi" and surname"sundaresan"
    And the user enters the emailid "devisundaresan85@gmail.com" and password"Facebook@2024"
    And  the user
