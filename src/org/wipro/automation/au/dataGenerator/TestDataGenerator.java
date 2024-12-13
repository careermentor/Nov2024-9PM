package org.wipro.automation.au.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{
	@DataProvider(name="ddf_data")
	public Object[][] testdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1", "pass1"};  //1-D array
		Object[][] data3 = {{"user1", "pass1"},{"user2", "pass2"},{"user3", "pass3"}};
		return data3;
	}
	
	@DataProvider(name="ddf_data2")
	public Object[][] testdata2()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1", "pass1"};  //1-D array
		Object[][] data3 = {{"user1", "pass1"},{"user2", "pass2"},{"user3", "pass3"}};
		return data3;
	}
	
}
