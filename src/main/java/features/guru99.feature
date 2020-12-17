
Feature: checking login functionality in guru99 
Scenario: Without entering email
Given user is on the home page
When clicking submit button
Then error msg shown

Scenario: login with email
Given user is on the home page
When user enters email id
And clicking submit button
Then user got the access details