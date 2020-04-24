Feature: Test Login feature

Description: The purpose of this feature is to test login feature

Background: User navigation to sign in page
Given User open the landing page
When User clicked the Sign in link
Then User navigated to sign in page 

Scenario: Perform login with correct credentials

Given User is on Sign in page
When User enters email and password
When User unselect Stay signed in checkbox
When User click on Sign In button
Then User navigates to home page
Then User closes the browser.

