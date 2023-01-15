package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Day12_ParallelTest 
 {
	public WebDriver driver;
	  @Test
	  public void ChromeTest() 
	   {
		  ChromeOptions coption = new ChromeOptions();
		  coption.addArguments("--headless");
		  driver = new ChromeDriver(coption);
		  System.out.println("The thread ID for Chrome is "+Thread.currentThread().getId());
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  
		  UserName.sendKeys("harshali.sonawane02@gmail.com");
		  PassWord.sendKeys("123543");
		  LoginBtn.click();
		  }
	  
	  @Test
	  public void EdgeTest() 
	   {
		  EdgeOptions eoption = new EdgeOptions();
		  eoption.addArguments("--headless");
		  driver = new EdgeDriver(eoption);
		  System.out.println("The thread ID for Edge is "+Thread.currentThread().getId());
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  
		  UserName.sendKeys("harshali.sonawane02@gmail.com");
		  PassWord.sendKeys("123543");
		  LoginBtn.click();
		  }

	  
	  @Test
	  public void FirefoxTest() 
	   {
		  FirefoxOptions foption = new FirefoxOptions();
		  foption.addArguments("--headless");
		  driver = new FirefoxDriver(foption);
		  System.out.println("The thread ID for Firefox is "+Thread.currentThread().getId());
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  
		  UserName.sendKeys("harshali.sonawane02@gmail.com");
		  PassWord.sendKeys("123543");
		  LoginBtn.click();
		  }
	  public int i=1;
	  @Test (successPercentage = 60, invocationCount = 3)  //Failing Within Success
	   public void AccountTest()
	   {
		  if(i<2)
			  Assert.assertEquals(i, i);
		  i++;
	   }
	//  @Test    //skip Test
	//  public void skipTest()
	//  {
	//	  throw new SkipException("skipping The Test Method");
	//  }
	 // @Test (successPercentage = 60)    //Failing Within Success
	//  public void AccountTest1()
	//  {
	//	  Assert.assertEquals(false, true);
	//  } 
 }
