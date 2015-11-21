Feature:  Login and Logout on OrangeHRM

Scenario: Login into the OrangeHRM
	Given the browser is launched and the page is opened
	When the user enter username and password
	And clicks on the login button
	Then it should the welcome message
	
Scenario: Logout of OrangeHRM
	When the user clicks on the welcome admin link
	And also click on the logout link
	Then it should come to the login page
 