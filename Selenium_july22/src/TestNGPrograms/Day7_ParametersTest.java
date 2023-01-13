package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7_ParametersTest 
 {
	public WebDriver driver;
	
  @Test
  @Parameters("browser")
  public void SelectBrowser(String Browser)
   {
	  if(Browser.equalsIgnoreCase("Chrome"))
	 {
	  driver = new ChromeDriver();
     }
  else
	  if(Browser.equalsIgnoreCase("edge"))
     {
	  driver = new EdgeDriver();
     }
  driver.get("https://utkarshaaacademy.com");
   }
 }
