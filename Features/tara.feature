Feature: login and logout module of orange HRM
Scenario: verify login functionality

Given we launch the browser and navigate to orange HRM
And click on the login button
Then welcome admin msg should be displayed

Scenario: verify logout functionality
When we click on welcome admin link
And also click on logout link
Then it should come to homepage