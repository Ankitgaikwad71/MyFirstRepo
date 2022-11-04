package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="email")
	private WebElement userNameEdtText;
	
	@FindBy(name="pass")
	private WebElement passwordEdtTxt;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	

	public void loginToApp(String username, String password)
	{
		userNameEdtText.sendKeys(username);
		passwordEdtTxt.sendKeys(password);		
	}
	public void lgn()
	{
		loginBtn.click();
	}
	
}
