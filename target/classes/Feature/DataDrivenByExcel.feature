Feature: This feature will add two and check whether the result is even or odd
Scenario Outline: it will verify if the data addition is even or not
Given user has <row> 
When user add two numbers
Then verify addition
Examples:
|row|
|1|
|2|
|3|
|4|
|5|
|6|
|8|