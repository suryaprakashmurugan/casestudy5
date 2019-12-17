
Feature: Adding items to cart
  
  Scenario: without adding items to cart proceding to payment
  Given open and login to testme app
  And search for product headphone
  And proceed to payment without adding to card
  Then testme doesnt allow to enter without proceeding to payment