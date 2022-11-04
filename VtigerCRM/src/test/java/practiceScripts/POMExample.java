package practiceScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMExample
{
	public static void main(String[] args) throws InterruptedException
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApp("admin", "12334");
		loginPage.lgn();
		driver.quit();
     }

}
