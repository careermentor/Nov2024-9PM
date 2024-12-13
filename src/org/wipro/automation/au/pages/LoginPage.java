package org.wipro.automation.au.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.au.utiltiespkg.ReadPropfile;

public class LoginPage 
{

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropfile.readelement_prop("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropfile.readelement_prop("login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropfile.readelement_prop("login_loginBttn_css"))).click();
	}
}
