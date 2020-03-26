package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Signup_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup_stepdefinition {
	WebDriver driver;
	
	public Signup_page sign=new Signup_page(driver);
	
	@Given("^the user launches the browser$")
	public void the_user_launches_the_browser() {
	    
		sign.Launchingbrowser("chrome");
	}

	@When("^the user opens the application$")
	public void the_user_opens_the_application()  {
		
	sign.Launch_Application("https://www.demoblaze.com/");
	   
	}

	@When("^the user clicks the sign up link$")
	public void the_user_clicks_the_sign_up_link()  {
		
		sign.Signup_link();
	    
	}

	@When("^the user enter the username and password and clicks on singup$")
	public void the_user_enter_the_username_and_password_and_clicks_on_singup()  {
	    
	}

	@Then("^take a Screenshot of Sign up$")
	public void take_a_Screenshot_of_Sign_up()   {
	   
		
		
		
	}


	

	
	
}
