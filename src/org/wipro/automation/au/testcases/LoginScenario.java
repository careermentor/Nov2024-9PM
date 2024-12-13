package org.wipro.automation.au.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.au.basepkg.InitiateBrowser;
import org.wipro.automation.au.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validate_validcred_loginfunct() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("password");
		login.click_loginbttn();
	}
	
	
	//"this.driver" is null
}
