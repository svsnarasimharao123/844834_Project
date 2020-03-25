package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_page {

	WebDriver driver;
	
	public void browser_open() {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}
	public void  application_open() {
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());

	}
	
	public void Scrol_page() {
		
		WebElement a=driver.findElement(By.id("next2"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)");
		driver.findElement(By.xpath("//html//body//div[5]//div//div[2]//form//ul//li[2]//button")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]//div[4]//div//div//h4//a")).click();
	
	
	}
	
	public void Next_click() {
		
		
	driver.findElement(By.xpath("//*[@id=\"next2\"]")).click();
	
	}
	
	public void Prev_click() {
		driver.findElement(By.xpath("//*[@id=\"prev2\"]")).click();
		
	}
	
}


