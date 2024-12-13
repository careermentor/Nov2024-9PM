package org.xyz.automation.abc;

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
		
		//String xyz = "Java";
		//System.out.println("Print the value" + xyz + "this is output");
		
		FileUtils.copyFile(f, fd);
	}
	
}
