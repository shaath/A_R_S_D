Feature: Login and Logout Test

	Scenario: Login 
		Given The browser Launched and navigated to url
		When The tester enters username and password
		And clicks on login
		Then It displays welcome admin message
		
	Scenario: 	Logout
		When The tester clicks on Welcome admin link
		And also clicks on logout link
		Then it displays login page
		