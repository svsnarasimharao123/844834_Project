package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Signup_page {

	WebDriver driver;
	public Signup_page(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void Launchingbrowser(String browser)
	{
		try {
			
			
			// To launch Chrome Browser
			 if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			 
			//To launch firefox Browser
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src\\test\\resources\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			 
			 
			//to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
		} catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	
	}
		
	public void Launch_Application(String Url) {
		
		
		driver.get(Url);
	}



public void Signup_link() {
	
	driver.findElement(By.xpath("//a[@id='signin2']")).click();;
	
	
}






}





	
	
