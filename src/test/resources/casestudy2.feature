
Feature: login

  Scenario Outline: login using registered username
  Given open testme app
  And Enter "<username>" and "<password>"
  Then click login button 
  
 Examples: 
 | username | password    |
 | lalitha  | password123 |