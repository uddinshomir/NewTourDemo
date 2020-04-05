Feature: Find a flight

Background: User Logged in
Given User is on New Tours website
Given User is already on New Tours
When User enters username
And User enters password
And User clicks sign in
Then User is signed in 

Scenario: User Going Round Trip
When User selects Round Trip 
Then Round Trip is selected


Scenario: User Going One Way
When User selects One Way
Then One Way is selected