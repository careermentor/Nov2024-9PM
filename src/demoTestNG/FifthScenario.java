package demoTestNG;

import org.testng.annotations.Test;

public class FifthScenario 
{

	@Test(groups="Smoke")	
	public void first_testcase()
	{
		System.out.println("First test case");
		
	}
	
	@Test(groups="Sanity")
	public void second_testcase() 
	{
	System.out.println("Second test case");
		
	}

	@Test(groups="Regression")
	public void Third_testcase() 
	{
	System.out.println("Third test case");
		
	}
	
	@Test(groups={"Sanity","Regression"})
	public void forth_testcase() 
	{
	System.out.println("Forrth test case");
		
	}
	
	@Test(groups="Regression")
	public void fifth_testcase() 
	{
	System.out.println("Forrth test case");
		
	}
	
	
}
