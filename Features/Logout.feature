Feature: This is to test the logout operation 

Scenario Outline: Logout Functionality
Given Open chromebrowser and type amazon url
When User clicks on SignIn link
 And user entering username and password from sheetname "<SheetName>" and rownumber "<RowNumber>"
 And user click on login button
 And place the cursor on wrenchs icon and click
Then Moves the mouse hover on Logout

  Examples:
      |SheetName|RowNumber|
      |user|0|

      