Feature: Reset functionality on login page of Application 


Scenario Outline: Verification of Reset button 


Given Open the Chrome and launch the application			


When Enter the "<uname>" and  "<pass>"			


Then click login button

Then check the login sucessfully or not

Examples:
|uname | pass |
| ranjitk | Ranjit7001 |
|cdscsdc |  Ranjit7001 |