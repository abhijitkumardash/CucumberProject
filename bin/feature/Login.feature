Feature: Login feature

@Smoke 
Scenario: Login with valid username or password
	Given user navigate to facebook website
	When user enter 108 and "password"
	And click on login button
	Then user should be navigated to home page