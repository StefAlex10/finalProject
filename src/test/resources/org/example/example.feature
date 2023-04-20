Feature: An example

  Scenario: The example
    Given I am on main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: Negative #1
    Given I am on main page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: Negative #2
    Given I am on main page
    When I write the email address of "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"
    And I click the submit button
    Then the field is colored in red

  Scenario: Virtual Page
    Given I am on main page
    When I click on Read More button for Virtual page
    Then I should see page title as "Virtual"

  Scenario: Read More Learn Fundamentals
    Given I am on main page
    When I click on Read More for Fundamentals page
    Then I should see page title as "Fundamentals"

  Scenario: Read More Learn Selenium
    Given I am on main page
    When I click on Read More for Selenium page
    Then I should see page title as "Learn Selenium"

  Scenario: Enrollment Button
    Given I am on main page
    When I click on Start The Enrollment
    Then I should see page title as "Software Testing | Enrollment"
    
  Scenario: From footer to Header
    Given I am on main page
    When i scroll to end of the page
    And i click arrow button
    Then i get back to upper

  Scenario: Enrollment page
    Given I am on the enrollment page
    When I write the First Name as "Stef"
    And I write the Last Name as "Alexandru"
    And I write the Username as "StefAlex"
    And I write the Password as "password"
    And I write the Confirm Password as "password"
    And I click next button
    Then I get to Contact Information

  Scenario: Contact Information
    Given I am on the contact information page
    When I write the email address "test@tester.cpm"
    And I write the phone number "023455687"
    And I write the country field "Romania"
    And I write the city field "Brasov"
    And I write the PostCode field "527002"
    And I click on next button
    Then I get to Course options

   Scenario: Course options
     Given I am on the course options page
     When I click for one option
     And I click on next button from course options page
     Then I get to Payment Information

   Scenario: Payment Information
     Given I am on payment information page
     When I write the card holder name "Stef Alexandru"
     And I write card number "1111222233334444"
     And I write CVC code "000"
     And I select month "September"
     And I select year "2024"
     And I click on next button from payment information page
     Then I get to Success page

















