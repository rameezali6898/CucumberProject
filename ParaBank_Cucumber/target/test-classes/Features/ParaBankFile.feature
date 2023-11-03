Feature: Verify and Fill the Register page of ParaBank
Scenario: Fill the Registeration Page with personal info

Given User is on ParaBank Register page


When User Enters the Valid FirstName and LastName
And User Enters the proper Address
And User Enters the correct City and State
And User Enters the ZIP code
And User Enters the Valid PhoneNumber
And User give proper SSN
And User Give Valid USERNAME
And User Give Valid PASSWORD and CONFIRM PASSWORD
And user click the Registration button

Then Successfully register the Registration
