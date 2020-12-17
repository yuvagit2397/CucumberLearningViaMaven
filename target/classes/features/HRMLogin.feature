@login
Feature: verifying HRM login functionality
@positive
Scenario: verifying correct login credentials
Given user is on login page
When user enters username and password
And user clicks login button
Then user navigated to admin page

#@empdetails
#Scenario: verifying the employer details
#Given user is on directory page
#When user enter the employee name 'Robert Craig' 
#And  user choose jobtitle and location
#And user click the search button
#Then employee details are verified
