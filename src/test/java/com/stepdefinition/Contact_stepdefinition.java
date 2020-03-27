package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.Contact_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact_stepdefinition {
	
WebDriver driver;
	
	public  Contact_page con=new Contact_page(driver);                        //Contact_page object creation
	

	@Given("^the user launch the demoblaze site$")
	public void the_user_launch_the_demoblaze_site() {
	  con.Browserandapp_launch("chrome", "https://www.demoblaze.com/");        //Accessing the browser and application launch method
	}

	@When("^the user clicks on contact link$")
	public void the_user_clicks_on_contact_link()  {
		
		con.Contact_link();                                                     //Accesssing the Clicking  contact  link method
	    
	}

	@When("^the user enter the email name and message$")
	public void the_user_enter_the_email_name_and_message() {
		
		con.Details_Enter("svssnarasimharao@gmail.com", "narasimharao", "Good website");     // Passing parameters to send details method
			
	    
	}

	@Then("^the user get a pop window message$")                                           
	public void the_user_get_a_pop_window_message() throws InterruptedException, IOException  {
	   
		
		con.Get_message();                                                        //Acccessing the message getting method 
		
		
	}

	

}
