package org.xyz.automation.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new EdgeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}

	@Test
	public void validate_loginfunct()
	{
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user2");
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(enabled=false)
	public void validate_signupfunct()
	{
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Java");
		
	}
	
}
