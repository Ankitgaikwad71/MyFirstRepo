package practiceScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TeeestNotations
{
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuit");
	}

	@BeforeTest
	public void bt()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("AfterSuit");
	}
}
