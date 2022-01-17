Feature: This is to test AddCart operation in amazonpage


Scenario Outline: Product Add To Cart Function
Given Open chromebrowser and type amazon url
When User clicks on SignIn link
 And user entering username and password from sheetname "<SheetName>" and rownumber "<RowNumber>"
 And user click on login button
 And  Mouse over on Babies and kids and click on Remote-control toys 
Then Select any toy and click on add to cart

   Examples:
      |SheetName|RowNumber|
      |user|0|
          
Scenario Outline:  Sort the products based on the sort option chosen
Given Open chromebrowser and type amazon url
When User clicks on SignIn link
 And user entering username and password from sheetname "<SheetName>" and rownumber "<RowNumber>"
 And user click on login button
When Click on the Men's T-shirt
Then Click on any checkbox under brand and Observe the chosen option displayed

 Examples:
      |SheetName|RowNumber|
      |user|0|

