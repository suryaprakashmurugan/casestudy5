Feature: Testme app registration

  Scenario: signup
  Given  open Testme app
  And click signup button
  And enter username
  And enter firstname
  And enter lastname
  And enter password
  And conform password
  And select gender
  And Enter email addres
  And enter mobile number
  And enter DOB
  And enter address
  And Select security question
  When answer to security question
  Then click register
 
