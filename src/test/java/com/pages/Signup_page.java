package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public void Launchingbrowser(String browser)                              //Method to launch the browser
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
			
		
		} catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	
	}
		
	      public void Launch_Application(String Url) {                          // Method to launch the application
		
		
		        driver.get(Url);								 
	      }

          public void Signup_link() throws InterruptedException {                //To click on Signup_button
	
        	  driver.findElement(By.xpath("//a[@id='signin2']")).click();           
	
        	  Thread.sleep(1000);
	
          	}

         public void Signup_details(int i) throws IOException {                   //Method to send username and password from Excelsheet
	
	
        	 Exceldata ex=new Exceldata();
        	 driver.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(ex.excel_username(i));
        	 driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys(ex.excel_password(i));
	
         	}

         public void Signup_buttonclick() throws InterruptedException {               //Method to click sign up button
	
        	 driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
        	 Thread.sleep(5000);
        	 //Popup window alert handling
        	 Alert alert=driver.switchTo().alert();
        	 String s=driver.switchTo().alert().getText();                            //Getting the the text from popup window
        	 System.out.println(s);                                                   //To print the text acquired from the popup window
        	 Thread.sleep(1000);
        	 alert.accept();
	
           }
	
        public void Screenshot_signupform() throws IOException, InterruptedException {    //Method to take screen shot of sign up form
		
        	Thread.sleep(1000);
        	TakesScreenshot ts=((TakesScreenshot)driver);
        	File Store=ts.getScreenshotAs(OutputType.FILE);
        	FileUtils.copyFile(Store,new File("E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Screenshots\\Signup1.png"));
        	Thread.sleep(1000);
        	
        	driver.close();                                                         //Closes the current window
	
	
        
        }

	}










	
	
