package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonitorsSelect_page {
	
	WebDriver driver;
	public MonitorsSelect_page(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void Browserandapp_launch(String browser,String url)                                //Method to launch the browser and the application
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
			  
			                                                                               //To maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	
	}	

     public void Monitors_linkclick() {                                                 //Method to click on the monitors showing under categories
	
	
    	 	driver.findElement(By.xpath("(//*[@id=\"itemc\"])[3]")).click();

         }

    public void Monitor_select() {                                                        //Method to select the particular monitor
	
    		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
	 
	 
         }
     public void Monitor_Addcart() throws InterruptedException {                             //Method to add the selected monitor to cart
	
    	 	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
    	 	Thread.sleep(2000); 
    	 	//Popup Alert handling 
    	 	Alert alert=driver.switchTo().alert();
    	 	String s=driver.switchTo().alert().getText();                                      //Getting the  displayed on popup window alert
    	 	System.out.println(s);                                                            //To print the text getting from pop window on the console
	
    	 	alert.accept();	
    	 	
    	 	driver.close();	                                       //Closes the current window

     	  }

  }


















