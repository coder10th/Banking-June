package com.inetBankingJune.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObj {
	WebDriver driver;
	
	public LoginPageObj(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(name="btnLogin")
	 WebElement login;
	  
	public void setUserName(String uname)
	   {
		userName.sendKeys(uname);
		}
	
	public void setPassWord(String pw)
	   {
		passWord.sendKeys(pw);
		
	   }
	  
	public void clickLogin()
	   {
		login.click();
	   }
}
