Feature: user is try to login the OrangeHRM application
 
	@ValidCredentials
	Scenario: user used to launch application on computer
	
	Given User is on OrangeHRM login webpage
	When user must provide the correct credentials
		|Username|Password|
		|Admin|admin123|
		
	Then user is able to login sucessfully and see homepage
	
		@InvalidCredentials
	Scenario: Login in the website with the invalid credentials
	
		Given User is on OrangeHRM login webpage
		When user must provide the correct credentials
			|Username|Password|
			|Admin1|admin123|
			|Admin1|admin1231|
			
			Then User should be able to see unsucessfull with error message