Feature: Form automation
  As a user I want to fill my form
  also I submit it

  Scenario Outline: Form filling and submition
    Given user navigates to the app url
    When user fills first name with value "<firstname>"
    And user fills last name with value "<lastName>"
    And user fills gender "<gender>"
    And user fills date of birth "<dob>"
    And user fills address "<address>"
   And user fills email "<email>"
    And user fills password  "<pass>"
    And user fills company "<company>"
And user selects role
    And user selects job expectations
    And user selects 3 random ways of development
    And user fills the comment "<comment>"
   And user submit form
    Then form is submitted

    Examples:
      | firstname | lastName  | dob        |  gender   | address                            |   email           | pass     |  company | comment      |
      | Nick      | Jackson   | 03/15/1908 |  0        | 60606 Chicago Il, 222 South R plaza| grisha@yopmail.com| 1QAZ2wsx | ABCSoft  | hello-hello  |
      | john      | Deer      |02/11/1978  | 0         |60074 Palatine IL, Barberry ln      |mm@yopmail.com     |2323sdd   | SMP      |meowe         |



