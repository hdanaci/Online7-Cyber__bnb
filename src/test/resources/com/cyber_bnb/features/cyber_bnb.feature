Feature: test cases 

@smoke 
Scenario: Smoke Test 
	Given the user is on the login page 
	Given the user login using email "jalabaster7f@drupal.org" and password "terimapam" 
	And the user clicks on the sign in button 
	When user clicks on hunt to make reservation 
	And user chooses August 20, 2018 at  "9:00am" - "11:00am" as the desired date 
	Then user clicks on book for "yale" as the room 
	Then user verify room name "yale" 
	And user clicks on confirm button to reserve the room 
	And "conference in yale has been successfully scheduled" message displayed 
	
	
Scenario Outline: Verify usernames 
	Given the user is on the login page 
	When I login using username "<username>" and password "<password>" 
	And The user click on myself 
	Then users full name "<firstname>" "<lastname>" should be displayed 
	
	Examples: 
		|firstname 	   |lastname         |username                     	|password		 |    
		|Ruthann       |Johnes 			 |daldie7l@seattletimes.com     |ruthannjohnes   |
		|Arluene  	   |Reolfo  	     |gmcalister7n@google.nl        |arluenereolfo   |
		|Leonard 	   |Warfield  		 |sutting7v@liveinternet.ru     |leonardwarfield |
		|Carlos  	   |Michie      	 |strayford84@e-recht24.de      |carlosmichie    |
		|Hadley  	   |Climer      	 |finkles7z@studiopress.com     |hadleyclimer    |
		
		
Scenario: Verify group members on team page 
	Given the user is on the home page 
	When the user click on team button 
	Then the user should be able to see following names 
		|Teri Mapam        |
		|Angie Coatham     |
		|Bennett Tomanek   |
		|Mariann Dewi      |
		
@temp 
Scenario Outline: verify user information: <email> 
	Given the user sign in using email "<username>" and password "<password>" 
	When the user is on the my self page 
	Then the user information should be displayed 
		|name  |<name>|
		|role  |<role>|
		
	Examples: 
		| username                  | password      | name           | role        		   | 
		| bcrosetti88@sitemeter.com | jamesmcdonagh | James McDonagh | student-team-member | 
		| cbrose86@cbslocal.com     | garrikheis    | Garrik Heis    | student-team-member |
		| gmcalister7n@google.nl    | arluenereolfo | Arluene Reolfo | student-team-leader |
		
		
		
		# use the test data given to you in the excel file
		#@temp 
		#Scenario Outline: verify user information: <email> 
		#	Given the user logs in using "<email>" "<password>" 
		#	When the user is on the my self page 
		#	Then the user information should be displayed 
		#		|<name>|<role>|<team>|<campus>|
		#		
		#	Examples: 
		#		| email          | password | name              | role      | team             | campus          |
		#		| tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
		#		| tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
		#		| tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
		#		| tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
		#		| tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
		
		
		#Scenario: make a reservation 
		#	Given the user is on the home page 
		#	When the user click hunt 
		#	And subtitle “hunt for spot” should be display 
		#	Then the user select 8-17-2018 11.00-12.00am 
		#	And the user choose stanford 
		#	And confirm reservation (edited) 
		#	
		#	
		#Scenario: verify first and last two hours 
		#	Given the user is on the home page 
		#	When the user click on berkeley room 
		#	Then subtitle should be “berkeley” 
		#	Then the first and last two hours should be displayed in the following : 
		#		|7:00AM   |
		#		|7:30AM   |
		#		|9:30PM   |
		#		|10:00PM  |
		#		
		#		
		#Scenario Outline: Verify room names and under title names 
		#	Given the user is on the home page 
		#	When the user selects "<roomName>" 
		#	Then room name should be "<roomName>" 
		#	And the under title name should be "<underName>" 
		#	
		#	Examples: 
		#		|underName        |roomName |
		#		|mens et manus    |mit      |
		#		|veritas          |harvard  |
		#		|lux et veritas   |yale     |
		#		|fiat lux         |berkeley |
		#		
		#		
		#
		
