package com.stepdefinition;

import com.pages.Navigation_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Navigation_stepdefinition {
	Navigation_page website=new Navigation_page();
	
	@Given("^the browser is launched$")
	public void the_browser_is_launched() {
		website.browser_open();
	}
	@When("^the user opens the demoblaze website$")
	public void the_user_opens_the_demoblaze_website() {
		
		website.application_open();
	}

	@When("^the user scrolls down$")
	public void the_user_scrolls_down() {
		
		website.Scrol_page();
	    
	}

	@When("^clicks on next button for navigating to next page$")
	public void clicks_on_next_button_for_navigating_to_next_page() {
		
		website.Next_click();
	    
	}

	@Then("^cliks on prev button to navigate previous page$")
	public void cliks_on_prev_button_to_navigate_previous_page() {
	   
		website.Prev_click();
}
}