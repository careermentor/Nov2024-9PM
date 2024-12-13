package org.xyz.automation.abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime
{

	WebDriver driver;
	
	
	@Test
	public void checkthefields() throws Exception
	{
		driver = new ChromeDriver();
		
		//Step1
		
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL); //fail  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);
		
		System.out.println("this step getting failed");
		
		String ExpLoginPage = "Facebook – log in or sign up";
		
		String ActLoginPage =  driver.getTitle();
		System.out.println(ActLoginPage);
		
		sa.assertEquals(ActLoginPage, ExpLoginPage);
		
		String Exp_Username_field = "Email address or phone number";
		
		String Act_Username_field= driver.findElement(By.id("email")).getAttribute("placeholder");
		
		System.out.println(Act_Username_field);
		
		sa.assertEquals(Act_Username_field, Exp_Username_field);
		
		String Exp_login_link = "Login";
		String Act_login_link=  driver.findElement(By.name("login")).getText();
		System.out.println(Act_login_link);
		
		sa.assertEquals(Act_login_link, Exp_login_link);
		
		
		System.out.println(driver.findElement(By.name("login")).getLocation());
		
		//System.out.println(driver.getPageSource());
		
		CpatureScreenshot.testresults(driver,"checkthefields");
		
		sa.assertAll();
		
		
		
	}
	
	
	
}
