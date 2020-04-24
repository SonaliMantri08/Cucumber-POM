$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/user_signIn.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login feature",
  "description": "\r\nDescription: The purpose of this feature is to test login feature",
  "id": "test-login-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "User navigation to sign in page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User open the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicked the Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User navigated to sign in page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_SignIn.user_open_the_landing_page()"
});
formatter.result({
  "duration": 7663653100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_clicked_the_Sign_in_link()"
});
formatter.result({
  "duration": 2356102900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_navigated_to_sign_in_page()"
});
formatter.result({
  "duration": 75401100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Perform login with correct credentials",
  "description": "",
  "id": "test-login-feature;perform-login-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User unselect Stay signed in checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User navigates to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User closes the browser.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_SignIn.user_is_on_Sign_in_page()"
});
formatter.result({
  "duration": 234794500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_enters_email_and_password()"
});
formatter.result({
  "duration": 413172300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_unselect_Stay_signed_in_checkbox()"
});
formatter.result({
  "duration": 89731400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_click_on_Sign_In_button()"
});
formatter.result({
  "duration": 54202600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_navigates_to_home_page()"
});
formatter.result({
  "duration": 1717627000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_SignIn.user_closes_the_browser()"
});
formatter.result({
  "duration": 645562800,
  "status": "passed"
});
});