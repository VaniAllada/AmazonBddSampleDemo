Feature: This is to test AddCart operation in amazonpage

Background:
Given Open chromebrowser and type amazon url
Then  User clicks on SignIn link
When  User is going to enter below username
|9384632662|
Then User should click on next button
When User is going to enter below password and click on submit button
|durga@123|

#Scenario: Product Add To Cart Function
#And  Mouse over on Babies and kids and click on Remote-control toys 
#Then Select any toy and click on add to cart

#Scenario:  Sort the products based on the sort option chosen
#When Click on the Men's T-shirt
#Then Click on any checkbox under brand and Observe the chosen option displayed

Scenario: Logout Functionality
When Place the cursor on wrench icon and click
Then Move the mouse hover on Logout
