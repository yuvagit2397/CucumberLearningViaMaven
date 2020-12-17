@DataTableWithHeader
Feature: HRM DataTable With Header
@WithHeader
Scenario: verifying correct login credentials
Given you are on orangehrm login page
When you enters orangehrm username and password
|username|password|
|Admin   |admin123|
And you clicks orangehrm login button
