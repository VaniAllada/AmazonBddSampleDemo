Feature: This is to test an email sending feature

Scenario: To test an email scenario
Given Open chromebrowser and navigate to gmail
When Enter a valid Email Id or Phone Number and Click Next button 
And Enter Password and click Sign in button and verify gmail loggedin successfully
And Click compose button and verify that a new mail window is opened.
And Enter Email Id say |saurabh@qatechhub.com| 
And Enter some subject say |Test Mail|
Then Enter some text in body and Click send button.


