package com.stepdefinition;

import com.pages.Laptop_page;

import cucumber.api.java.en.When;

public class Laptop_stepdefinition {
	
	Laptop_page laptop=new Laptop_page();
	@When("^the user opens the website$")
	public void the_user_opens_the_website()  {
	 laptop.Browser_launch();
		
		
	}

	@When("^the user clicks on the Laptops link under categories$")
	public void the_user_clicks_on_the_Laptops_link_under_categories() {
	    
		laptop.Website_open();
	}

	@When("^user selects the required laptop$")
	public void user_selects_the_required_laptop()  {
	    	
	laptop.Laptop_click();
	laptop.Select_laptop();
	}
	@When("^user clicks on addtocart$")
	public void user_clicks_on_addtocart() throws InterruptedException  {
		laptop.Addto_Cart();
	   
	}

}