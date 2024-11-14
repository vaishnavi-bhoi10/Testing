package TextNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TextNG1 {
  @Test
  public void f() {
	  System.out.println("i am in Test Case");
  }
  @Test
  public void s() {
	  System.out.println("i am in Test Case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in Before Case");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in After Case");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in Before Test Case");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in After Suite");
  }

}
