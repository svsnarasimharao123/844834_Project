package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src\\main\\resources\\Feature\\demoblazetest.feature",     //Feature file path
			// To Generate Extent, html,json,junit reports
			plugin =  {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
			tags = {"@TC_01,@TC_02,@TC_03,@TC_04,@TC_05"},
            glue = "com/stepdefinition",                           //Path of stepdefinition file
            monochrome = true ,                                    //To diplay the console output in readable format
            strict=true,                                          //To check if any step is not defined in stepdefinition file
      		dryRun=false                                          // Mapping between feature and stepdefinition file
      )

           public class Demoblaze_runner {
	
	@AfterClass
	 public static void extendReport()
	{
	Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	   Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	   Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	   Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	   Reporter.setSystemInfo("Selenium", "3.141.59");
	   Reporter.setSystemInfo("Maven", "4.0.0");
	   Reporter.setSystemInfo("Java Version", "1.8.0_131");
	}
	
	

		
            }
	
	
	

