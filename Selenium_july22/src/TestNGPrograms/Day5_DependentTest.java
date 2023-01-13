package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day5_DependentTest 
 {
	public WebDriver driver;
  @Test(dependsOnMethods = "openBrowser")
  public void SignIn() 
   {
	  System.out.println("This will execute second (SignIn)");
   }
  
  @Test
  public void openBrowser() 
   {
	  driver = new ChromeDriver();
	  System.out.println("This will execute first (open Browser)");
   }
  @Test(dependsOnMethods = "SignIn")
  public void viewAcc() 
   {  
	  System.out.println("This will execute third (view Account)");
   }
 }
