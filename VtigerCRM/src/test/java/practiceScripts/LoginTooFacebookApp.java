package practiceScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LoginTooFacebookApp extends BaseClass
{
	@Test
	public void loginToFacebookApp() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jhjhbxvjv");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("15455756");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
