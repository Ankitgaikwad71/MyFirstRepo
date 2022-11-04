package practiceScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesttN {
   @Test
   public void test1()
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   System.out.println("success");
	   Reporter.log("facebook", true);
   }
}
