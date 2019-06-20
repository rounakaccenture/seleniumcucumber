package first;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void P() {
	  
	  
	  System.out.println(" hello");
  }
  
  @Test
  public void G() {
	  
	  
	  System.out.println(" hello JAVA");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" rounak");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" proona");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" shubha");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println(" dhnusha");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println(" eb");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println(" sorav");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println(" divyA");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" SATYA");
	  
  }

}
