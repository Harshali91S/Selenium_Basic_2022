package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Day2_AnnotationTest 
 {
  @Test
  public void first() 
   {
	  System.out.println("First Test Annotation");
   }
  @BeforeMethod
  public void beforeMethod() 
   {
	  System.out.println("Before Method");
   }

  @AfterMethod
  public void afterMethod() 
   {
	  System.out.println("After Method");
   }

  @BeforeClass
  public void beforeClass() 
   {
	  System.out.println("Before Class");
   }

  @AfterClass
  public void afterClass() 
   {
	  System.out.println("After Class");
   }

  @BeforeTest
  public void beforeTest() 
   {
	  System.out.println("Before Test");
   }

  @AfterTest
  public void afterTest() 
   {
	  System.out.println("After Test");
   }

  @BeforeSuite
  public void beforeSuite() 
   {
	  System.out.println("Before Suit");
   }

  @AfterSuite
  public void afterSuite() 
   {
	  System.out.println("After Suite");
   }
}
