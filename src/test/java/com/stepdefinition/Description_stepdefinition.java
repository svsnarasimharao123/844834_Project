package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Description_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Description_stepdefinition {
WebDriver driver;
	
	public Description_page text =new Description_page(driver);
	
	
	
	@Given("^the user launches the demoblaze website$")
	public void the_user_launches_the_demoblaze_website() {
		
		text.Browserandapp_launch("chrome", "https://www.demoblaze.com/");
		
		
	   
	}

	@When("^the user scrolldown the website page$")
	public void the_user_scrolldown_the_website_page() throws InterruptedException  {
	
		
		text.Scroll_down();
	    
	}

	@Then("^the user check the information available and get the description on console$")
	public void the_user_check_the_information_available_and_get_the_description_on_console() throws InterruptedException  {
	  
		
		text.Check_info();
		
		
		
	}
	
	

	
}
