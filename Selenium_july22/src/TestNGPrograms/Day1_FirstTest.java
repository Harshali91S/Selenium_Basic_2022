package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1_FirstTest 
 {
	public WebDriver driver;
  @Test
  public void fiza() 
   {
	  System.out.println("Hi i am Fiza");
	  driver = new ChromeDriver();
	  driver.get("httls://www.google.com");
   }
 }
