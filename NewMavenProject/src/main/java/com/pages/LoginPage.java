package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="email")
    public WebElement email;
	
	@FindBy(id="password")
    public WebElement pass;
    
    @FindBy(xpath="//button")
    public WebElement button;
    
    public  LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void loginToApp()
    {
    	email.sendKeys("kiran@gmail.com");
    	pass.sendKeys("123456");
    	button.click();
    }
}
