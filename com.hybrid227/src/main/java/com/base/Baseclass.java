package com.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.PropertiesUtiles;

public class Baseclass {
	
public static WebDriver driver=null;
	  
	public static void initialization() throws Exception{
		
		String browser = PropertiesUtiles.readProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver_new.exe");
			driver =new ChromeDriver();
			}
		  driver.get(PropertiesUtiles.readProperty("url"));
		  driver.manage().window().maximize();
		}
		
	public static void main(String [] args) throws Exception
    {
    	initialization();
    }
}


 