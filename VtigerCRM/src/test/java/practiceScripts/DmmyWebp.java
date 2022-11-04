package practiceScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DmmyWebp 
{
public static void main(String[] args) throws InterruptedException
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/gaikw/Desktop/dhtml.html");
	driver.findElement(By.xpath("//input[@id='i1w']")).sendKeys("hi");
	driver.findElement(By.xpath("//input[@id='sf']")).sendKeys("hello");
	driver.findElement(By.xpath("//input[@name='safese']")).click();
	driver.findElement(By.xpath("//input[@class='qwfee']")).click();
	driver.findElement(By.xpath("//input[@id='adqwe']")).click();
	driver.findElement(By.xpath("//a[@id='afef']")).click();
	Thread.sleep(5000);
	driver.quit();
	
}
}
