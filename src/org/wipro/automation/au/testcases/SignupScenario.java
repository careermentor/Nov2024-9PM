package org.wipro.automation.au.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.au.basepkg.InitiateBrowser;
import org.wipro.automation.au.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc02_validate_signupvalidation() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		driver.findElement(By.name("firstname")).sendKeys("user1");
		sign.enter_firstnamename("John");
		sign.select_dob_day("12");
		sign.click_gender_male();
		sign.click_signupbttn();
	}
	

}
