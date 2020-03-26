package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contact_page {

	WebDriver driver;
	
	public Contact_page(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void Browserandapp_launch(String browser,String url)
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
			driver.get(url);
		
		} catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	
	}	

	public void Contact_link() {
		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
	}


public void Details_Enter(String mail,String name,String message)


{
	
	driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(mail);
	driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys(name);
	driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys(message);
	
}


public void Get_message() throws InterruptedException {
	
	
	
	
	driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	String s=driver.switchTo().alert().getText();
	System.out.println(s);
	
	alert.accept();	
driver.close();		
	
	
	
}






}






