Feature: This feature will add two and check whether the result is even or odd
@Nutan
Scenario Outline: it will verify if the data addition is even or not
Given user has <num1> and <num2>
When user adds both numbers
Then verify addition result 

Examples:
|num1|num2|
|12|13|
|23|54|
|56|2|