Feature: Save Prescription
As a patient I want to save medical prescription which given by doctor

@Positive
Scenario: Validate Prescription Data
Given Patient has entered correct data
And with valid credentials "Patil"
When click on "Submit" 
Then System should display "Record Saved Successfuly"

@Negetive
Scenario: InValid Prescription Data
Given Patient has entered incorrect Data
When click on "Submit"
Then System should display "Incorrect Date Foramat"
