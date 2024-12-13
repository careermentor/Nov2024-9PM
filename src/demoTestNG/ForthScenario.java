package demoTestNG;

import org.testng.annotations.Test;

public class ForthScenario 
{

	@Test	
	public void first_testcase()
	{
		System.out.println("First test case");
		
	}
	
	@Test(enabled=false)
	public void second_testcase() 
	{
	System.out.println("Second test case");
		
	}

	@Test
	public void Third_testcase() 
	{
	System.out.println("Third test case");
		
	}
	
	@Test
	public void forth_testcase() 
	{
	System.out.println("Forrth test case");
		
	}
	
	@Test
	public void fifth_testcase() 
	{
	System.out.println("Forrth test case");
		
	}
	
	
}
