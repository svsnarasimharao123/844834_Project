package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_page {

	WebDriver driver;
	public Login_page(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void application(String browser,String url)
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
		public void Login_linkclick() {
			
			driver.findElement(By.xpath("//a[@id='login2']")).click();
			
			
		}
		
		public void Enter_logindetails(String username,String password) throws InterruptedException {
			
			
			driver.findElement(By.id("loginusername")).sendKeys(username);
			driver.findElement(By.id("loginpassword")).sendKeys(password);
			
			Thread.sleep(2000);
			
		}
		
	public void login_buttonclick() throws InterruptedException, IOException  {
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
		TakesScreenshot ts=((TakesScreenshot)driver);
		File Store=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Store,new File("E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Screenshots\\login1.png"));
		
		Thread.sleep(3000);
		driver.close();
		
	         }
		
		
	}
	
	
	

