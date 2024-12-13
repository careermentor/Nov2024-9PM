package org.wipro.automation.au.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.au.basepkg.InitiateBrowser;
import org.wipro.automation.au.pages.SwagLoginPage;

public class SwagLoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validate_validcred_loginfunct() throws Exception
	{
		SwagLoginPage login = new SwagLoginPage(driver);
		login.enter_username("standard_user");
		
	}
	
	
	//"this.driver" is null
}
