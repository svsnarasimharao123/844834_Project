package com.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Description_page {
	WebDriver driver;
	
	public Description_page(WebDriver driver) 
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
	
	public void Scroll_down() throws InterruptedException
	
	{
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(2000);
		
	}
	
	
	public void Check_info() throws InterruptedException {
		
		String a=driver.findElement(By.xpath("//*[@id=\"fotcont\"]/div[1]/div/div/p")).getText();
		String  c="We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.";
		Assert.assertEquals(a,c);
		String s=driver.findElement(By.xpath("//*[@id=\"fotcont\"]/div[2]/div/div/p[2]")).getText();
		System.out.println("Contact is:" +s);
		System.out.println("Aboutus is:" +a);
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
}