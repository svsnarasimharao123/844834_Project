@Demoblazefeature
Feature:Demoblaze website

@TC_01
Scenario:Sign up with demoblaze website
Given the user launches the browser
When the user opens the application
When the user clicks the sign up link
When the user enter the username and password and clicks on singup
Then take a Screenshot of Sign up

@TC_02
Scenario Outline:Login in to the demoblaze website
Given the user launch the application
When the user clicks on login link
When the user enter username as "<username>" & password "<password>"
Then click on login button 
Examples:

       | username | password |
	   | Narasimharao123 | narasimharao123 | 


@TC_03
Scenario:Selecting the Monitors from the demobalze application
Given the user launch the demoblaze application
When the user clicks on montiors under categories
When the user click on the reuired monitor and added to cart
Then the user get a message

@TC_04
Scenario:Providing the contact details 
Given the user launch the demoblaze site
When the user clicks on contact link
When the user enter the email name and message
Then the user get a pop window message

@TC_05
Scenario:Getting the website description 
Given the user launches the demoblaze website
When the user scrolldown the website page
Then the user check the information available and get the description on console



