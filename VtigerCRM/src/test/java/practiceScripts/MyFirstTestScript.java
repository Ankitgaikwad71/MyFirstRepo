package practiceScripts;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTestScript {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".src/main/resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
	}
}
