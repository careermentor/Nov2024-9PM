package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdScenatio 
{

	@Test	
	public void first_testcase()
	{
		System.out.println("First test case");
		
	}
	
	@Test
	public void second_testcase() 
	{
	System.out.println("Second test case");
		
	}

	@Test(groups="Sanity")
	public void third_testcase() 
	{
	System.out.println("Third test case");
	Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase() 
	{
	System.out.println("forth test case");
		
	}
	
	@Test(groups="Regression")
	public void fifth_testcase() 
	{
	System.out.println("fifth test case");
	Assert.assertEquals("Hello", "Hello wprld");
		
	}
	
	
}
