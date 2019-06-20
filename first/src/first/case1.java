package first;

import org.testng.annotations.Test;

public class case1 {
	
	@Test(priority=1)
	
	public void a()
	{
		System.out.println(" hello");
		
		
	}
	
	@Test(priority=1)
	public void b()
	{
		System.out.println(" bello");
		
		
	}
	
	@Test
	
	public void c()
	{
		System.out.println(" cello");
		
		
	}
}
