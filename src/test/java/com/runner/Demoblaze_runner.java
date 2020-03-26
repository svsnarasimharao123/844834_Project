package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\Feature\\demoblazetest.feature",     //feature file path
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/report.html"}
,
tags = {"@TC_01,@TC_02,@TC_03,@TC_04,@TC_05"},
glue = "com/stepdefinition",                           //path of stepdefinition file
monochrome = true                                     //To diplay the console output in readable format

)

public class Demoblaze_runner {


		@AfterClass
		  public static void extendReport() 
		{
		     
		}
	}
	
	
	
	
	

