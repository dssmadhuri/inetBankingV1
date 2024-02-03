package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TestCase2 extends BaseClass
{
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		Logger.info("url is opened");
		LoginPage lp = new LoginPage(driver);
		Logger.info("username input");
		
		lp.setUserName(username);
		Logger.info("password input");
		lp.setPassword(password);
		Logger.debug("submit click");
		lp.clickSubmit();
		
		  String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		  Logger.debug("check for title with assertion");
		  Assert.assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());

	//if(driver.getTitle().contains(" Hotels by Hilton - Book the Best Rates Across All Brands "))
		//if(driver.getTitle().contains(" Guru99 Bank Home Page "))
		/*{
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
		}
	}*/

}
}
