package com.stepdefinition;

import java.io.IOException;

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
	    
		sign.Launchingbrowser("chrome");                                   //Accessing the browser launch method to Launch the chrome browser 
	}

	@When("^the user opens the application$")
	public void the_user_opens_the_application()  {
		
	sign.Launch_Application("https://www.demoblaze.com/");                //Accessing launching application method to launch the demoblaze application
	   
	}

	@When("^the user clicks the sign up link$")
	public void the_user_clicks_the_sign_up_link() throws InterruptedException  {
		
		sign.Signup_link();                                              //Accessing the signup link click method 
	    
	}

	@When("^the user enter the username and password and clicks on singup$")
	public void the_user_enter_the_username_and_password_and_clicks_on_singup() throws IOException, InterruptedException   {
	    
		//Accessing the sending username and password from excel sheet method to pass multiple set of data 
		for(int j=1;j<=10;j++) {
		sign.Signup_details(j);  
		sign.Signup_buttonclick();
		sign.Launch_Application("https://www.demoblaze.com/");
		sign.Signup_link();

		}
	}
	@Then("^take a Screenshot of Sign up$")
	public void take_a_Screenshot_of_Sign_up() throws InterruptedException, IOException   {
	   
		sign.Screenshot_signupform();                            //Accessing the Signup form screenshot method to take screenshot
			
			
		}
		
			
	}


	

	
	

