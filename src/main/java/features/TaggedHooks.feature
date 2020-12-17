Feature: Using Tagged hooks
Background: using background
Given background test 
@laptop
Scenario: buying laptop
Given buyer is in electronic shop
When chooses acer brand
Then pay the bill

@phone
Scenario: buying phone
Given buyer goes to mobileshop
When chooses the iphone
Then pay the bill

@outfit
Scenario: byuing dress
Given buyer goes to the txtile
When selecting dresses
Then pay the bill
