Feature: Login 

Background: User on Website
Given User is on New Tours website

Scenario: User is able to login to New Tours 
Given User is already on New Tours
When User enters username
And User enters password
And User clicks sign in
Then User is signed in 

Scenario Outline: User is unable to login 
Given User is already on New Tours
When User enters invalid username "<username>"
And User enters invalid password "<password>"
And User clicks sign in
Then User fails to sign in

Examples:
    |  username     |  password       |
    | shomir        | shomir123       |
    | selenium      | selenium123     |
    | eclipse       | eclipse123      |
    | $elenium      | $elenium123     |
    
    
 
