Feature: Checkout and Billing Process
As a user
I want to complete checkout process
So that I can place an order successfully


Scenario: Complete checkout with billing details
Given user is logged in
And user has product in cart
When user proceeds to checkout
And user enters billing details
And user selects shipping method
And user selects payment method
And user confirms the order
Then order confirmation message should be displayed