$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/funcitonsOfEmployee.feature");
formatter.feature({
  "name": "Paylocity WebSite",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Add"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User goes to the Website",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Valitade url and title",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click add employee button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter employee details",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the employee should save",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate employee who created from table",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the benefit cost calculations are correct",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});