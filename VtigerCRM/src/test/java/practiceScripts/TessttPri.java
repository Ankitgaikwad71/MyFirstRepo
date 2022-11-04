package practiceScripts;

import org.testng.annotations.Test;

public class TessttPri {

	@Test(priority = 0)
	public void snake()
	{
		System.out.println("buss buss");
	}
	
	@Test(priority = -1)
	public void cat()
	{
		System.out.println("meow meow");
	}
	
	@Test(priority = 1)
	public void dog()
	{
		System.out.println("bow bow");
	}
	
}
