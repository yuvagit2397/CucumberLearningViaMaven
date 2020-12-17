@login @datadriven
Feature: Data Table With Examples
Scenario Outline: validate Hrm login functionality
Given :you are on  login page
When  :you enters "<username>" and "<password>"
When  :you clicks login button

Examples:
|username|password|
|Admin   |admin123|
|admi    |12345   |
|ascdf   |asd345  |

