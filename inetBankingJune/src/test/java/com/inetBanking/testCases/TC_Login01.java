package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingJune.PageObjects.LoginPageObj;

public class TC_Login01 extends BaseClass
{
	
	@Test
	public void login()
	
	{
		LoginPageObj login= new LoginPageObj(driver);
		//driver.get(url);
		login.setUserName(userName);
		log.info("Username Entered");
		login.setPassWord(passWord);
		log.info("Password Entered");
		login.clickLogin();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("Correct title");
		}
		else
		{
			log.info("wrong title");
			captureScreenShots(driver,"login");
			Assert.assertTrue(false);
		
					
		}
	}


}
