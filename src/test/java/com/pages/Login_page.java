package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	WebDriver driver;
	
	
	public void Browser_launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}
	
	public void Application_open() {
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	 
         public void Login_click() {
        	 
	driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
    
         }
	
	public void User_details(String username,String password) throws InterruptedException  {
		
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]")).click();;
		Thread.sleep(2000);
		
	}
	public void Screenshot_page() throws IOException {

		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("src\\test\\resources\\Screenshots.png"));
	}
	
	
	}
	

