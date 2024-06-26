Feature:Login
  As a user i want to login sauce demo
  Background:
    Given user is in sauce demo page
  Scenario: login with valid input
    When user input "standard_user" as username "secret_sauce" as password
    Then User navigated to homepage
  Scenario Outline: login with invalid input
    When user input "<username>" as username "<password>" as password
    Then user get "<error>" as error message
    Examples:
    | username     | password   | error
    |              |            | Epic sad face:username and password is required
    | problem_user |            | Epic sad face:password is required
    |              |secret_sauce| Epic sad face:username is required
    | problem_user | scret_sauce| Epic sad face:username and password is required do not match
    | problm_user  |secret_sauce| username and password is required do not match

