package org.wipro.automation.au.utiltiespkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CpatureScreenshot 
{

	public static void testresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //take screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/" + name + ".png");
		
		
		FileUtils.copyFile(f, fd);
	}
	
}
