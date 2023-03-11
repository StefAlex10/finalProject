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
    Then the confirmation pop-up appears

  Scenario: Virtual Page
    Given I am on main page
    When I click on Read More button for Virtual page
    Then appropriate page opens with Virtual header

  Scenario: Read More Learn Fundamentals
    Given I am on main page
    When I click on Read More for Fundamentals page
    Then open new Fundamentals Page

  Scenario: Read More Learn Selenium
    Given I am on main page
    When I click on Read More for Selenium page
    Then I should see page title as "Learn Selenium"

  Scenario: Enrollment Button
    Given I am on main page
    When I click on Start The Enrollment
    Then open new Page

  Scenario: From footer to Header
    Given I am on main page
    When i scroll to end of the page
    And i click arrow button
    Then i get back to upper





















  Scenario Outline: Instructors
    Given I am on main page
    When I scroll to Instructors description
    When I click on each <instructor> social media button <Twitter>, <Facebook>, <LinkedIn>, <Instagram>
    Then I will be redirected to each social media page

    Examples:
    | instructor |       Twitter       |       Facebook           |      LinkedIn            |         Instagram         |
    |   John     | https://twitter.com/| https://www.facebook.com/| https://www.linkedin.com/| https://www.instagram.com/|















