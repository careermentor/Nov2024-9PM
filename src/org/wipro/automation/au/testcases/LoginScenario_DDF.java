package org.wipro.automation.au.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.au.basepkg.InitiateBrowser;
import org.wipro.automation.au.dataGenerator.TestDataGenerator;
import org.wipro.automation.au.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="ddf_data",dataProviderClass=TestDataGenerator.class)
	public void tc01_vloginfunct(String uname, String pass) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(uname);
		login.enter_password(pass);
		login.click_loginbttn();
	}
	
	
	
}
