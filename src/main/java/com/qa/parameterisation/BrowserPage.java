package com.qa.parameterisation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserPage 
{
	@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
	WebElement searchbox;
	
	@FindBy(xpath = "//*[@id=\"b_results\"]")
	WebElement element_1;
	

	
	public WebElement click( )
	{	
		return searchbox;
	}
	
	public String searchBar()
	{
		return element_1.getAttribute("value");
	}

}
