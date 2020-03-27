$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/demoblazetest.feature");
formatter.feature({
  "line": 2,
  "name": "Demoblaze website",
  "description": "",
  "id": "demoblaze-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Demoblaze_feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Sign up with demoblaze website",
  "description": "",
  "id": "demoblaze-website;sign-up-with-demoblaze-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user opens the application",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user clicks the sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enter the username and password and clicks on singup",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "take a Screenshot of Sign up",
  "keyword": "Then "
});
formatter.match({
  "location": "Signup_stepdefinition.the_user_launches_the_browser()"
});
formatter.result({
  "duration": 10747598100,
  "status": "passed"
});
formatter.match({
  "location": "Signup_stepdefinition.the_user_opens_the_application()"
});
formatter.result({
  "duration": 1731733600,
  "status": "passed"
});
formatter.match({
  "location": "Signup_stepdefinition.the_user_clicks_the_sign_up_link()"
});
formatter.result({
  "duration": 1227792300,
  "status": "passed"
});
formatter.match({
  "location": "Signup_stepdefinition.the_user_enter_the_username_and_password_and_clicks_on_singup()"
});
formatter.result({
  "duration": 86206861600,
  "status": "passed"
});
formatter.match({
  "location": "Signup_stepdefinition.take_a_Screenshot_of_Sign_up()"
});
formatter.result({
  "duration": 2693028400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Login in to the demoblaze website",
  "description": "",
  "id": "demoblaze-website;login-in-to-the-demoblaze-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "the user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user clicks on login link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user enter username as \"\u003cusername\u003e\" \u0026 password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "demoblaze-website;login-in-to-the-demoblaze-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "demoblaze-website;login-in-to-the-demoblaze-website;;1"
    },
    {
      "cells": [
        "Narasimharao123",
        "narasimharao123"
      ],
      "line": 21,
      "id": "demoblaze-website;login-in-to-the-demoblaze-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Login in to the demoblaze website",
  "description": "",
  "id": "demoblaze-website;login-in-to-the-demoblaze-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02"
    },
    {
      "line": 1,
      "name": "@Demoblaze_feature"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "the user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user clicks on login link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user enter username as \"Narasimharao123\" \u0026 password \"narasimharao123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_stepdefinition.the_user_launch_the_application()"
});
formatter.result({
  "duration": 11904363100,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepdefinition.the_user_clicks_on_login_link()"
});
formatter.result({
  "duration": 149710900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Narasimharao123",
      "offset": 28
    },
    {
      "val": "narasimharao123",
      "offset": 57
    }
  ],
  "location": "Login_stepdefinition.the_user_enter_username_as_password(String,String)"
});
formatter.result({
  "duration": 2500636200,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepdefinition.click_on_login_button()"
});
formatter.result({
  "duration": 5094164000,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Wrong password.}\n  (Session info: chrome\u003d80.0.3987.149): Wrong password.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-HPDV7GE\u0027, ip: \u0027192.168.0.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\opava\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56570}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0255c1fb6fa00f89f2e198fb824455d2\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.pages.Login_page.login_buttonclick(Login_page.java:75)\r\n\tat com.stepdefinition.Login_stepdefinition.click_on_login_button(Login_stepdefinition.java:41)\r\n\tat ✽.Then click on login button(src/main/resources/Feature/demoblazetest.feature:17)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 25,
  "name": "Selecting the Monitors from the demobalze application",
  "description": "",
  "id": "demoblaze-website;selecting-the-monitors-from-the-demobalze-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@TC_03"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "the user launch the demoblaze application",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "the user clicks on montiors under categories",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "the user click on the reuired monitor and added to cart",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "the user get a message",
  "keyword": "Then "
});
formatter.match({
  "location": "MonitorsSelect_stepdefinition.the_user_launch_the_demoblaze_application()"
});
formatter.result({
  "duration": 11627690700,
  "status": "passed"
});
formatter.match({
  "location": "MonitorsSelect_stepdefinition.the_user_clicks_on_montiors_under_categories()"
});
formatter.result({
  "duration": 142950200,
  "status": "passed"
});
formatter.match({
  "location": "MonitorsSelect_stepdefinition.the_user_click_on_the_reuired_monitor_and_added_to_cart()"
});
formatter.result({
  "duration": 1541157200,
  "status": "passed"
});
formatter.match({
  "location": "MonitorsSelect_stepdefinition.the_user_get_a_message()"
});
formatter.result({
  "duration": 6864193200,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Providing the contact details",
  "description": "",
  "id": "demoblaze-website;providing-the-contact-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "the user launch the demoblaze site",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "the user clicks on contact link",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the user enter the email name and message",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "the user get a pop window message",
  "keyword": "Then "
});
formatter.match({
  "location": "Contact_stepdefinition.the_user_launch_the_demoblaze_site()"
});
formatter.result({
  "duration": 13387119900,
  "status": "passed"
});
formatter.match({
  "location": "Contact_stepdefinition.the_user_clicks_on_contact_link()"
});
formatter.result({
  "duration": 110085500,
  "status": "passed"
});
formatter.match({
  "location": "Contact_stepdefinition.the_user_enter_the_email_name_and_message()"
});
formatter.result({
  "duration": 638402300,
  "status": "passed"
});
formatter.match({
  "location": "Contact_stepdefinition.the_user_get_a_pop_window_message()"
});
formatter.result({
  "duration": 3872069600,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Getting the website description",
  "description": "",
  "id": "demoblaze-website;getting-the-website-description",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@TC_05"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "the user launches the demoblaze website",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "the user scrolldown the website page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "the user check the information available and get the description on console",
  "keyword": "Then "
});
formatter.match({
  "location": "Description_stepdefinition.the_user_launches_the_demoblaze_website()"
});
formatter.result({
  "duration": 14798358100,
  "status": "passed"
});
formatter.match({
  "location": "Description_stepdefinition.the_user_scrolldown_the_website_page()"
});
formatter.result({
  "duration": 4508875400,
  "status": "passed"
});
formatter.match({
  "location": "Description_stepdefinition.the_user_check_the_information_available_and_get_the_description_on_console()"
});
formatter.result({
  "duration": 6164631200,
  "status": "passed"
});
});