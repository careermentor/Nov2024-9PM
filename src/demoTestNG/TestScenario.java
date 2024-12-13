package demoTestNG;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test(priority=1)	
	public void first_testcase()
	{
		System.out.println("First test case");
		
		Assert.assertEquals("Hello", "Hello wprld");
			
	}
	
	@Test(priority=2)
	public void second_testcase() 
	{
	System.out.println("Second test case");
		
	}
	
	@Test(priority=0)
	public void third_testcase() 
	{
	System.out.println("third test case");
		
	}
	
	@Test
	public void forth_testcase() 
	{
	System.out.println("forth test case");
		
	}
	
	@Test(priority=-1)
	public void fifth_testcase() 
	{
	System.out.println("fifth test case");
		
	}
	
	@Test(priority=-2)
	public void sixth_testcase() 
	{
	System.out.println("sixth test case");
		
	}
	
	

	
	
}
