Feature: Adactin Ticket Booking


Scenario Outline: Login Functionality
Given user is launch the application
When user is enter the "<Username>" in username field
And user is enter the "<Password>" in password field
Then user is enter the submit button

Examples:
		|Username|Password|
		|abcd|9T40ZB|
		|pradeep321|9T40ZB|
		
Scenario: Search Hotel Detials
When user is select the location
And user is select the hotel
And user is select the roomtype
And user is select the number of rooms
And user is enter check in date
And user is enter check out date
And user is select adults per room
And user is select children per room
Then user is enter the search button

Scenario: Select Hotel Details 
When user is select the checkbox
Then user is enter continue button

Scenario: Book A Hotel 
When user enter first name
And user enter last name
And user enter the billing address
And user enter credit card number
And user enter credit card type
And user enter expiry date 
And user enter cvv number
Then user enter book now button

Scenario: Booking Confirmation Details
Then user is enter my itinerary button
























































































