package TestNGPrograms;

import org.testng.annotations.Test;

public class Day5_GroupDependentTest 
 {
  @Test(groups = "login")
  public void openBrowser() 
   {
     System.out.println("This will execute first");
   }
  @Test(groups = "login")
  public void signIn() 
   {
     System.out.println("This will execute second");
   }
  @Test(dependsOnGroups = "login")
  public void viewAcc() 
   {
     System.out.println("This will execute Third");
   }
 }
