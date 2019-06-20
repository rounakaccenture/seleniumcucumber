package first;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATA {
	
	
	
	@Test(dataProvider="dp1")
	public void testdata(String Username,String password)
	{
		System.out.println("Username"+ Username);
		System.out.println("password"+ password);
		
	}
	
	
	@DataProvider(name="dp1")
	
	public Object[][] getdata()
	{
		Object[][] Obj= {
				{"kim","kin"},
				{"pim","pin"},
				{"sim","sin"}
		};
		return Obj;
	}
	
	
}
