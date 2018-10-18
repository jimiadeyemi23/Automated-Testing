package com.qa.parameterisation;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step 
{
	
	public WebDriver driver = null;
	
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reports\\CucumberReport.html", true);
	ExtentTest test;
	
	String argHolder = "";
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) 
	{
	    // Write code here that turns the phrase above into concrete actions
		//driver.get(ConstantVars.bingURL);
		driver.get(arg1);

	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) 
	{
	    // Write code here that turns the phrase above into concrete actions
		BrowserPage browser = PageFactory.initElements(driver, BrowserPage.class);
		
		browser.click().sendKeys(arg1);
		browser.click().submit();
		
		argHolder = arg1;
		
	    
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search()  
	{
	    // Write code here that turns the phrase above into concrete actions
		BrowserPage browser = PageFactory.initElements(driver, BrowserPage.class);
		assertEquals(argHolder, browser.searchBar());

	}

}
