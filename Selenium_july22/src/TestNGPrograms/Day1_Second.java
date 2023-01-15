package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1_Second 
 {
	  public WebDriver driver;
	   @Test
	   public void launchTest()
	   {
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com");
	   }
	   @Test
	   public void loginTest()
	   {
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7264013513");
		   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@Harshali001");
		   driver.findElement(By.tagName("button")).click();
	   }
  }
