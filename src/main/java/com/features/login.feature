Feature: JBK offline application

Scenario: login test
Given User should be on login page 
When User Enter valid credentials 
Then User should be on homepage 

Scenario:verify JBK logo
Given User should be on login page 
Then User should see JBK logo.


Scenario: Verify registration 
Given User should be on login page 
When User click on register link 
And user fill all details 
Then user should successfull message .
