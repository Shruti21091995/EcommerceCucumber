Feature: Home Page Navigation
As a user
I want to open the Demo Web Shop website
So that I can verify homepage elements and navigate through menus


Scenario: Verify homepage is loaded successfully
Given user launches the browser
When user opens the Demo Web Shop application
Then homepage should be displayed with title "Demo Web Shop"


Scenario: Navigate to Login page from Home
Given user is on homepage
When user clicks on Login link
Then login page should be displayed