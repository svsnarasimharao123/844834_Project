package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excelutillity.Exceldata;




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
		
		
		driver.get(Url);								 //To launch demablaze application
	}



public void Signup_link() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[@id='signin2']")).click();           //To click on Signup_button
	
	Thread.sleep(3000);
	
	driver.close();
	
	
}

public void Signup_details(int i) throws IOException {
	
	Exceldata ex=new Exceldata();
	driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(ex.excel_username(i));
	driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys(ex.excel_password(i));
	
	}

public void Signup_buttonclick() throws InterruptedException {


	driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	driver.close();
	


}



}






	
	
