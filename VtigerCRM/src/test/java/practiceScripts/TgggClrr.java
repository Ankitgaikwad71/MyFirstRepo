package practiceScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TgggClrr 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gaikw/Desktop/ClearTGG.html");
		WebElement element=driver.findElement(By.name("field"));
		element.clear();
		Thread.sleep(2000);
		element.sendKeys("sanjay");
		Thread.sleep(2000);
		driver.quit();
	}

}
