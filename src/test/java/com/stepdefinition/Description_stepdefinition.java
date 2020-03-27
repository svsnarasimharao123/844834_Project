package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.Description_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Description_stepdefinition {
WebDriver driver;
	
	public Description_page text =new Description_page(driver);                  //Description page object creation
	
	
	
	@Given("^the user launches the demoblaze website$")
	public void the_user_launches_the_demoblaze_website() {
		
		text.Browserandapp_launch("chrome", "https://www.demoblaze.com/");     //Method accesses to launch the browser and application
		
		
	   
	}

	@When("^the user scrolldown the website page$")
	public void the_user_scrolldown_the_website_page() throws InterruptedException, IOException  {
	
		
		text.Scroll_down();                                                   //Method accessing to scroll down page
		text.Screenshot_Des();                                                //Accessing  metod to take screenshot
	    
	}

	@Then("^the user check the information available and get the description on console$")
	public void the_user_check_the_information_available_and_get_the_description_on_console() throws InterruptedException  {
	  
		
		text.Check_info();                                               //Method accesses to check the ewebsite information
		
			
	}	
}
