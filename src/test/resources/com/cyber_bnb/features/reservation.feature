Feature: MYtest cases 

@smj
Scenario: MySmoke Test 
	Given the user is on the login page 
	Given the user login using email "jalabaster7f@drupal.org" and password "terimapam" 
	And the user clicks on the sign in button 
	Then user clicks on the hunt button
	Then user selects the desired dates 23 time "8:00am" to "10:00am" and clicks search button
	Then confirmation message displayed

#2 test case
@sms
Scenario Outline: Cancel Reservation 
	Given the user is on the login page 
	Given the user login using email "<username>" and password "<password>" 
	And the user clicks on the sign in button 
	Then user clicks on the hunt button
	Then user selects the desired dates 23 time "8:00am" to "10:00am" and clicks search button
	And user cancels the reservation
	Examples:
	|username				|	password|
	|jalabaster7f@drupal.org|	terimapam|

#3 test case
@sm
Scenario: Double reservation error
	Given the team lead has an existing reservation
	When the user tries to reserve second time dates 23 time "8:00am" to "10:00am" and clicks search button
	Then it should give message "you already have a conference for 2018-08-23." at the screen
	
	
	
#4 test case
@smb
Scenario: verify rooms
	Given the user is on the login page 
	Given the user login using email "jalabaster7f@drupal.org" and password "terimapam" 
	And the user clicks on the sign in button
	Then user clicks on the hunt button
	Then user selects the desired dates 23 time "8:00am" to "10:00am" and clicks button
	And user confirms all rooms displayed
	|mit	    |
	|harvard    |
	|yale		|
	|princeton	|
	|stanford	|
	|duke       |
	|berkeley   |
	