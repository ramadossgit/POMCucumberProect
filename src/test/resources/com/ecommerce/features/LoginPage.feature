Feature: Login Page feature

Background:
		Given user is on login page
		

Scenario: Login page title
When user gets the title of the Landing page
And user click on Signin button
Then Login page title should be "Login - My Shop"


Scenario: Forgot Password Link
Given user click on Signin button
Then forgot password link should be displayed


Scenario: login with correct credentials
Given user click on Signin button
When user enters username "email2ramadoss@gmail.com"
And user enters password "12345"
And user clicks on Login button
Then Home page title should be "My account - My Shop"