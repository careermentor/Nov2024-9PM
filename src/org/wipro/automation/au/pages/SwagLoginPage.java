package org.wipro.automation.au.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.au.utiltiespkg.ReadPropfile;

public class SwagLoginPage 
{

	WebDriver driver;
	
	
	public SwagLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropfile.readelement_prop("login_username_id"))).sendKeys(uname);
	}
	}
