package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	//between lines 14-18 web driver is initialized to load elements
	 public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	
	//finding the web element in the web page
	@FindBy(name="uid")
	WebElement txtUserName;
	
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;

	 // action being performed on the we elements define from line 21 thru 34
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassword (String pwd)
	
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
}

