package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop_page {
	
	WebDriver driver;
	
	public void Browser_launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}
	
	public void Website_open() {
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}

	public void Laptop_click() {
		driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
	}
	public void Select_laptop() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();
		
	}
	public void Addto_Cart() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		alert.accept();
	}

	
	
}
