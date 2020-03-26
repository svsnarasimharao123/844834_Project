package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\Feature\\demoblazetest.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/report.html"}
,
tags = {"@TC_01","@TC_02","@TC_03","@TC_04","@TC_05"},
glue = "com/stepdefinition",
monochrome = true

)

public class Demoblaze_runner {

}
