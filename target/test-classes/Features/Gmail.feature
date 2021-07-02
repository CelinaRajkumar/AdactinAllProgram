@Gmail
Feature: Login into Gmail account and checking sent Items 

@regression
Scenario: User login to Gmail account using valid credentials and checks sent items
Given Login into the Gamil account
When the user enters UserID and Password
	|	username     | password       |
	| CelinaRenu   | Daddylove@1954 |
	| autotest1988 | Diya@2015      |
	
And the user clicks Login
Then to verify if the user has entered the right page




