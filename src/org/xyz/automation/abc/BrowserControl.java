package org.xyz.automation.abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserControl
{

	WebDriver driver;
	
	
	@Test
	public void dropdownlist_calendar() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Step1
		driver.findElement(By.name("fld_username")).sendKeys("selenium");
		
		driver.findElement(By.id("datepicker")).sendKeys("11/26/1981");
		driver.findElement(By.xpath("//a[text()='26']")).click();
		
		WebElement xyz = driver.findElement(By.name("sex"));
		Select gen = new Select(xyz);
		
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		//WebElement abc = driver.findElement(By.id("email"));
		
		//char x = 'a';
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Hawaii"));
		
		st.selectByVisibleText("Florida");
		
		/*
		
		boolean actcheckboxtstaus_f = driver.findElement(By.name("terms")).isSelected();
		System.out.println(actcheckboxtstaus_f);
		Assert.assertEquals(actcheckboxtstaus_f, false);
		
		driver.findElement(By.name("terms")).click();
		
		boolean actcheckboxtstaus_t = driver.findElement(By.name("terms")).isSelected();
		System.out.println(actcheckboxtstaus_t);
		Assert.assertEquals(actcheckboxtstaus_t, true);
		
		boolean x = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		System.out.println(x);
		*/
		
	}
	
	@Test(enabled=false)
	public void validate_differentbrowsercontrol() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();  //one window
		driver.quit();  //all the window
		
	}
	
}
