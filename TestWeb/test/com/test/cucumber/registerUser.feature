#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: User Registration
	As a user I want to register myself into system

@Positive
Scenario: Provide Valid Data
Given "User" provided valid information of himself "nodata"
When Click on "Submit"
Then Should display "Success" 
	

@Negetive
Scenario Outline: Provide Data 
Given <patientName> provided valid information of himself <nodata>
When Click on <button>
Then Should display <message>

Examples:
|patientName|nodata|contact|email|securityKey|button|message|
|"viru"|""|"9165366440"|"virendra.patidar@worldpay.com"|"test"|"Submit"|"Success"|
|"viru"|"contact"|""|"virendra.patidar@worldpay.com"|"test"|"Submit"|"Fail"|