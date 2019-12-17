
Feature: testme app to check the search option

  Scenario: check the search is showing the products when the starting of four characters is entered
  Given open testme
  And Enter username and password
  And clik login button
  And search product in searchbutton and click appropriate results
  And click find product
  And add to cart
  And click cart
  And checkout
  And procede to pay
  And choose bank
  And click on continue
  And enter username and password 
  And continue to pay
  And enter transaction password
  Then click paynow
