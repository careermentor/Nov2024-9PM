package org.wipro.automation.au.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.au.utiltiespkg.ReadPropfile;

public class SignupPage 
{

	WebDriver driver;
	
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropfile.readelement_prop("login_createnewaccount_xpath"))).click();
	}

	public void enter_firstnamename(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropfile.readelement_prop("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		
		Select dob_day = new Select(driver.findElement(By.name(ReadPropfile.readelement_prop("signup_birthday_day_name"))));
		dob_day.selectByVisibleText(day);
	}
	
	public void click_gender_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropfile.readelement_prop("signup_gen_male_xpath"))).click();
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropfile.readelement_prop("signup_signupbttn_name"))).click();
	}
}
