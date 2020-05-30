$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/batTests/Bat01.feature");
formatter.feature({
  "name": "Bat test number 01",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Scenario 01 of Bat test 01",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.Bat.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid login details",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.Bat.user_enters_valid_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Bat.user_login_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Bat.user_is_able_to_see_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});