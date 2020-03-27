package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src\\main\\resources\\Feature\\demoblazetest.feature",     //Feature file path
			// To Generate Extent, html,json,junit reports
			plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
			tags = {"@TC_01,@TC_02,@TC_03,@TC_04,@TC_05"},
            glue = "com/stepdefinition",                           //Path of stepdefinition file
            monochrome = true ,                                    //To diplay the console output in readable format
            strict=true,                                          //To check if any step is not defined in stepdefinition file
      		dryRun=false                                          // Mapping between feature and stepdefinition file
      )

           public class Demoblaze_runner {


		
            }
	
	
	

