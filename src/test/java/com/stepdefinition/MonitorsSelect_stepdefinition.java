package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.MonitorsSelect_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MonitorsSelect_stepdefinition {
WebDriver driver;
	
	public MonitorsSelect_page mon=new MonitorsSelect_page(driver);
	
	
	@Given("^the user launch the demoblaze application$")
	public void the_user_launch_the_demoblaze_application() {
	    
		
	mon.Browserandapp_launch("chrome", "https://www.demoblaze.com/");           //Accessing the launch browser and application method
		
	}

	@When("^the user clicks on montiors under categories$")
	public void the_user_clicks_on_montiors_under_categories()  {
		
		mon.Monitors_linkclick();                                             //Accessing the Monitors link click method
		
	   
	}

	@When("^the user click on the reuired monitor and added to cart$")
	public void the_user_click_on_the_reuired_monitor_and_added_to_cart()  {
	
		mon.Monitor_select();                                                 //Accessing the Selecting monitor method
		
			
	}

	@Then("^the user get a message$")
	public void the_user_get_a_message() throws InterruptedException {
	    
		mon.Monitor_Addcart();                                                 //Accessing the add to cart method

	}
 
}