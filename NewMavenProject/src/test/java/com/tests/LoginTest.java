package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;


public class LoginTest {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void correctcred()
	{
		System.setProperty("webdriver.chrome.driver","driver/chromedriver_new.exe" );
		driver= new ChromeDriver(); 
		driver.get("file:///C:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		}
	
	@Test
	public void verifytitleonNextPage()
	{
		lp.loginToApp();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

}
