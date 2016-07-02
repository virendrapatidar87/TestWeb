Feature: Register User UI Test

@Positive
Scenario: User Registration UI
Given Click on "Sign Up"
And I want to add a new User with name "Pankaj", contact "9699239696", email "ppp@wp.com", securityKey "test"
When click on button "operation"
Then System should display "Registration SuccessFul now Go to Login Page"