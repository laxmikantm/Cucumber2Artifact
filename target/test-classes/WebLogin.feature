@run2

Feature: Login to Cognizant Outlook Web Access

Scenario Outline: Invalid User Name
	Given the user accesses the login page of cognizant outlook web access
	When the user try to sign-on with incorrect username
	Then the message should be displayed prompting the user to enter correct credentials
	
Examples:
	|Username 		| password		| status		|
	|InvalidUsername| ValidPassword1| unsuccessful	|

