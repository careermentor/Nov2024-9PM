package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecnodScenatio 
{

	@Test	
	public void first_testcase()
	{
		System.out.println("First test case");
		
	}
	
	@Test(groups="Smoke")
	public void second_testcase() 
	{
	System.out.println("Second test case");
		
	}

	@Test(groups="Sanity")
	public void Third_testcase() 
	{
	System.out.println("Third test case");
		
	}
	
	@Test
	public void forth_testcase() 
	{
	System.out.println("Forrth test case");
	Assert.assertEquals("Hello", "Hello wprld");
		
	}
	
	@Test
	public void fifth_testcase() 
	{
	System.out.println("Forrth test case");
	Assert.assertEquals("Hello", "Hello wprld");
		
	}
	
	
}
