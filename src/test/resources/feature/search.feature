Feature: Search Functionality
As a user
I want to search for products
So that I can view relevant results

@LoginRequired
Scenario Outline: Search for a product
Given user is on homepage
When user searches for "<productName>"
Then search results should contain "<productName>"


Examples:
| productName |
| laptop |
| book |
| gift card |