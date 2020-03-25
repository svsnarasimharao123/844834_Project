package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\Feature\\demoblaze.feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@tc_01","@tc_02","@tc_03","@tc_04"},
glue = {"steps"},
monochrome = true
)

public class Demoblaze_runner {

}