Feature: This feature will have Data EmplName and EmplSalary Check EmplName who having salary above particular value
Scenario Outline: Now verify Data above particular value
Given user has Data of Emp <row>
Then  Manager will get salary Range
Examples:
|row|
|1|
|2|
|3|
|4|
|5|
|6|