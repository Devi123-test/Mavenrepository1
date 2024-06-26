Feature: Registration
  Scenario Outline:
  Given User is on registration page
  When User enters valid registration details "<gender>", "<firstname>", "<lastname>","<DOBday>","<DOBmonth>","<DOByear>","<email>","<companyname>","<newsletter>","<password>","<confirmpwd>"
  And User clicks register and continue
  Then User registered successfully
  Examples:
  | gender | firstname | lastname | DOBday | DOBmonth | DOByear | email            | companyname | newsletter | password | confirmpwd |
  | male   | dev      | shan     | 12     | February      | 1970    | dev123@gmail.com | abc ltd     | yes        | dev123     | dev123     |
  | female | devi     | shan     | 21     | December      | 1960    | devi1234@gmail.com| xyz ltd    | no         | devi123    | devi123    |