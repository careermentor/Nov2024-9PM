package org.wipro.automation.au.basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.au.utiltiespkg.ReadPropfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		if(ReadPropfile.readconfig_config("BrowserName").equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(ReadPropfile.readconfig_config("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else if(ReadPropfile.readconfig_config("BrowserName").equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		
		driver.get(ReadPropfile.readconfig_config("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.quit();	
	}
	
	
}
