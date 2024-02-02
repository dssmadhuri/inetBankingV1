package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL= "https://demo.guru99.com/v4";
	//public String baseURL= "https://www.hilton.com/en";
	public String username ="mngr551320";
	public String password="upYtyrY";
	public static WebDriver driver;
	
	public static Logger Logger;
	
	@BeforeClass
	 public void setup()
	 {
		//below for Chrome driver 
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		// driver = new ChromeDriver();
		//below for Firefox driver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//geckodriver.exe");
	    driver = new FirefoxDriver();
	    //below two lines for log4j
	    Logger=org.apache.log4j.Logger.getLogger("ebanking");
	    PropertyConfigurator.configure("log4j.properties");
	 }
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
