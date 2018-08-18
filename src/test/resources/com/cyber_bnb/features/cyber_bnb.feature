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
		
		
		
@temp 
Scenario Outline: verify user information: <email> 
	Given  the user logs in using "<email>" and "<password>" 
	When  the user is on the my self page 
	Then  the user information should be assert excelfile 
	
	Examples: 
		| email						| password      |
		| gmcalister7n@google.nl	| arluenereolfo |
		| uvalerio7o@google.com		| sharaipencot  |
		| bczadla7p@uol.com.br		| humphreyalsop |
		| ehegel7q@usatoday.com		| nefenyong     |
	




	
