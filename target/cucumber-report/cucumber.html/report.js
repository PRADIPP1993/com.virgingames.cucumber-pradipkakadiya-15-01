$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Poker.feature");
formatter.feature({
  "line": 2,
  "name": "Poker Test",
  "description": "As user I want to virgingames website",
  "id": "poker-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 6534009200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User navigate to Home page successfully",
  "description": "",
  "id": "poker-test;user-navigate-to-home-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I Accept Cookie",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Poker page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on joint now",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAcceptCookie()"
});
formatter.result({
  "duration": 262254200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPokerPage()"
});
formatter.result({
  "duration": 182653500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnJointNow()"
});
formatter.result({
  "duration": 1192866300,
  "status": "passed"
});
formatter.after({
  "duration": 883637200,
  "status": "passed"
});
});