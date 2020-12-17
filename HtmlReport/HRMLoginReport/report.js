$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/HRMDataTableWithHeader.feature");
formatter.feature({
  "name": "HRM HRMDataTableWithHeader",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verifying correct login credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "you are on orangehrm login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.HrmDataTableWithHeaderDef.you_are_on_orangehrm_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "you enters orangehrm username and password",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.HrmDataTableWithHeaderDef.you_enters_orangehrm_username_and_password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "you clicks orangehrm login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.HrmDataTableWithHeaderDef.you_clicks_orangehrm_login_button()"
});
formatter.result({
  "status": "passed"
});
});