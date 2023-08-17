@Age
Feature:  Get user age
  Get user age after enter name & DOB

  Background:
    Given User navigate to URL "https://howoldru.m-messiah.cc"

  @correctDetails
  Scenario Outline: Verify user age
    When User enter name in "<nameField>"
    And User enter dob in "<birthdayField>"
    And User clicks submit button
    Then User see a successful message "<message>"

    Examples:
      | nameField | birthdayField | message |
      | John      | 16/08/2012    | Hello ! |
      | Tom       | 15/07/2018    | Hello ! |

  @incorrectName
  Scenario Outline: Enter wrong user name
    When User enter name in "<nameField>"
    And User clicks submit button
    Then User see a "<errorMessage>" under name field

    Examples:
      | nameField | errorMessage      |
      |           | incorrect symbols |

  @incorrectDate
  Scenario Outline: Enter wrong birthday date
    When User enter name in "<nameField>"
    And User enter dob in "<birthdayField>"
    And User clicks submit button
    Then User see a "<errorMessage>" under birthday field

    Examples:
      | nameField | birthdayField | errorMessage                      |
      | john      |               | wrong date                        |
      | Tom       | 22/09/2024    | your birthday must be in the past |
      | Kevin     | 18/09/1899    | you are too old to use it         |
