@Demoblaze_Feature
Feature: Demoblaze website

@tc_01
Scenario Outline: Data Driven Login to https://www.demoblaze.com/index.html
Given launch the browser
When open the application
When the user clicks on Login
When enter username as "<username>" & password "<password>" and click on login
Then take screenshot
Examples:
	| username | password |
	| Narasimharao123 | narasimharao123 | 
	
	
@tc_02
Scenario:  Selection of Laptops in Demblaze applicaton
Given launch the browser
When the user opens the website
When the user clicks on the Laptops link under categories
When user selects the required laptop
Then user clicks on addtocart

@tc_03
Scenario: Demoblaze page navigation
Given the browser is launched
When the user opens the demoblaze website
When the user scrolls down
And clicks on next button for navigating to next page
Then cliks on prev button to navigate previous page

@tc_04
Scenario: Deleting added product from cart
Given  user launched Demoblaze application
When user selects  the product and addtocart
When the user clicks on Cart button
And the user remove the added product from cart







