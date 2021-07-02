@Adactin
Feature: Book a Ticket using Adacting Page

Background: User need to be in the Aadactin Page
		# we cannot add Login Details UID and password transaction here as user id and password will differ from each person its not a common one


@Smoke 
Scenario: User need to book a Hotel ticket in the Adacting Page

Given Launch Adactin Browser
# Two Dimension without header ---> Lists
When The user enter the credntials username and password
	| DiyaReneesh | Diya@2015 |
And  click Login
Then Verify the entered details are correct
When Search the required hotel location and room and inDate and outDate and adult along with the Dates and click Search
	| Adelaide 		| 4 - Four | 23/06/2021 | 25/06/2021 | 3 - Three |
	| Paris    		| 2 - Two  | 25/06/2021 | 30/06/2021 | 4 - Four  |
	| Los Angeles | 2 - Two  | 26/06/2021 | 27/06/2021 | 3 - Three |

And Select the Required Hotel and Continue
#tWO dimenion (only one value) with Headers ---> lIST AND Map 
And Enter details fname and lname and address and cc and cvv for booking Confimration and Book


		| fname   | lname | address | cc               | ccType 		      | eDate | eYear | cvv |
		| Drizzle | Drew  | Chennai | 4567123445671234 | VISA  			      | July  | 2022  | 300 |
		| Thunder | Roger | Chennai | 4569789412345698 | Master Card      | June  | 2022  | 289 |
		| Pepper  | Clint | Chennai | 6589456915987532 | American Express | April | 2022  | 199 |

And Print the Order number
And Click Logout


@regression
Scenario: User needs to check the iternary 
 	Given User launch the Adacting browser
 	When User enter the username and password
 		 | username    | password  |
 		 | CelinaRaj88 | Diya@2015 |
 		 | DiyaReneesh | Diya@2015 | 		 
 	When the user clicks booked Itenary
 	
And Click Logout
 



