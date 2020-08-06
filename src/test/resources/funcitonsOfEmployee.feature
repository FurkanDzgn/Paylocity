Feature: Paylocity WebSite

  @Add
  Scenario: Add Employee
    Given User goes to the Website
    When Valitade url and title
    Then Click add employee button
    Then enter employee details
    And the employee should save
    And Validate employee who created from table
    And the benefit cost calculations are correct

  @Edit
  Scenario: Edit Employee
    Given User goes to the Website
    When Valitade url and title
    Then Click action edit employee button
    Then edit employee details
    And  validate employee who is edited

  @Delete
  Scenario: Delete Employee
    Given User goes to the Website
    When Valitade url and title
    Then Click delete employee button
    Then validate the employee deleted
