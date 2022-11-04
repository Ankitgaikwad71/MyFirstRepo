package practiceScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesstN2 {
   @Test
   public void test4()
   {
	   WebDriverManager.edgedriver().setup();
	   WebDriver driver=new EdgeDriver();
	   driver.get("https://www.instagram.com");
	   Reporter.log("insta",true);
   }
     @Test
     public void test5()
     {
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://localhost:8888");
    	 Reporter.log("vtiger",true);
     }
}
