package practiceScripts;

import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class POMExamplee extends BaseClass 
{
	@Test
	public void loginToFacebookApp()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginPage.LoginToApp("admin", "12345");
		loginPage.lgn();
		driver.quit();
	}
	

}
