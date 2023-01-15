import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day15_NotificationsDemo 
 {
  public static void main(String[] args) throws IOException
   {
	ChromeOptions option = new ChromeOptions();                    //(3)
	option.addArguments("--disable-notifications");                     //(3)
//	option.addArguments("--headless");                                //(3)
//	option.addArguments("window-size=390,844");                          //(6)
	
	WebDriver driver = new ChromeDriver(option);        //(1)       
	Dimension dem = new Dimension(750,450);               //(7)
	driver.manage().window().setSize(dem);                      //(7)
	driver.get("https://www.facebook.com");                  //(1)  
//	driver.manage().window().maximize();                    //(1)  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));           //(1) 
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Abhijit\\eclipse-workspace\\Selenium_july22\\Day15_fb.properties");   //(1)
	Properties prop = new Properties();                   //(1)         
	prop.load(fis);                                        //(1)       
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));   //(1)
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));     //(1)
	driver.findElement(By.tagName("button")).click();                                               //(1)
	
	driver.findElement(By.xpath("//a[text()='Home']")).click();                         //(2)
	String userName = driver.findElement(By.xpath("//span[contains[text(),'Sunil J']]")).getText();     //(4)
	System.out.println(userName);                                                      //(4)
	System.out.println("Method Pass");                                              //(5)
	
	driver.get("admin:admin@the-internet.herokuapp.com/basic_auth");                    //(8)
   }
 }
