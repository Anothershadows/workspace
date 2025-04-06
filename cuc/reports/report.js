$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\featutes\\palasibazar.feature");
formatter.feature({
  "name": "Travel Insurance Flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Apply for travel insurance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user navigates to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "palasibazarpage.theUserNavigatesToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a travel date",
  "keyword": "And "
});
formatter.match({
  "location": "palasibazarpage.theUserSelectsATravelDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects the destination place",
  "keyword": "And "
});
formatter.match({
  "location": "palasibazarpage.theUserSelectsTheDestinationPlace()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \"Travel\" button",
  "keyword": "When "
});
formatter.match({
  "location": "palasibazarpage.theUserClicksTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user reads the policy details",
  "keyword": "And "
});
formatter.match({
  "location": "palasibazarpage.theUserReadsThePolicyDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the travel count should be displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "palasibazarpage.theTravelCountShouldBeDisplayedCorrectly()"
});
formatter.result({
  "status": "passed"
});
});