package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginPage.LoginPageCode;

public class LoginTestCode {
	
	WebDriver driver;
	LoginPageCode lp;
	
	@BeforeMethod
	
	public void correctcred()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver new.exe" );
		driver= new ChromeDriver(); 
		driver.get("file:///C:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp=new LoginPageCode(driver);
		}
	@Test
	public void verifytitleonNextPage()
	{
		lp.loginToApp();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
