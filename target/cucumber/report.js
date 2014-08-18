$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/WebLogin.feature");
formatter.feature({
  "line": 3,
  "name": "Login to Cognizant Outlook Web Access",
  "description": "",
  "id": "login-to-cognizant-outlook-web-access",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run2"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Invalid User Name",
  "description": "",
  "id": "login-to-cognizant-outlook-web-access;invalid-user-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user accesses the login page of cognizant outlook web access",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user try to sign-on with incorrect username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the message should be displayed prompting the user to enter correct credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "WebLogin.access_outlook_web_access()"
});
formatter.result({
  "duration": 44891594252,
  "status": "passed"
});
formatter.match({
  "location": "WebLogin.Login_with_invalid_user_name()"
});
formatter.result({
  "duration": 3527443711,
  "status": "passed"
});
formatter.match({
  "location": "WebLogin.the_message_should_be_displayed_prompting_the_user_to_enter_correct_credentials()"
});
formatter.result({
  "duration": 239863237,
  "status": "passed"
});
});