package TestNGPrograms;

import org.testng.annotations.Test;

public class Day5_GroupDependancy 
 {
  @Test(groups = {"viewacc"},dependsOnGroups = "login")
  public void ViewAcc() 
   {
  System.out.println("View Your Dashboard");
   }
  @Test(groups = {"openbrowser"})
  public void OpenBrowser() 
   {
  System.out.println("Browser Open Successfully");
   }
  @Test(groups = {"login"}, dependsOnGroups = "openbrowser")
  public void LogIn() 
   {
  System.out.println("Login Into The Account");
   }
  @Test(groups = {"logout"}, dependsOnGroups = "viewacc")
  public void CloseAccount() 
   {
  System.out.println("Closing The Account");
   }
 }
