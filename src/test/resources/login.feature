@run

Feature: Test Login parameterised

Scenario Outline: Login Success
	
	Given I navigate to the singlesignon login application
	When I try to login using correct username password credentials
	Then I should see that login successful
	
Examples:
	| password			| status		|
	| ValidPassword1	| successful	|
	| InvalidPassword	| unsuccessful	|