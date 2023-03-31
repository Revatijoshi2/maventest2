package LoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCode {
	
	WebDriver driver;
	
	
    @FindBy(xpath="//*[@id=\"email\"]")
    public WebElement email;
    
    
    @FindBy(id="password")
    public WebElement pass;
    
    @FindBy(xpath="//*[@id=\"form\"]/div[3]/div/button")
    public WebElement button;
    
    
    public  LoginPageCode(WebDriver driver)
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
