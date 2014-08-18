@run1

Feature: Login to Cognizant Outlook Web Access

Scenario Outline: Invalid User Name
	Given user accesses the login page of cognizant outlook web access
	When the user try to sign-on with incorrect username
	Then message should be displayed prompting the user to enter correct credentials
	


Scenario Outline: Invalid Password
	Given user accesses the login page of Cognizant Outlook Web Access 
	When the user try to sign-on with incorrect password
	Then message should be displayed prompting the user to enter correct credentials


	


