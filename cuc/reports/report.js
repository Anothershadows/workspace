$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\featutes\\login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Valid user login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.userClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.userEnterTheUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.userClicksTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.loginShouldBeSuccess()"
});
formatter.result({
  "status": "passed"
});
});