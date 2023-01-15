package TestNGPrograms;

import org.testng.annotations.Test;

public class Day5_ChildTest  extends Day5_BaseTest
 {
  @Test(dependsOnMethods = "openBrowser")
  public void LogIn() 
   {
	  System.out.println("This willexecute second(LogIn)");
   }
 }
