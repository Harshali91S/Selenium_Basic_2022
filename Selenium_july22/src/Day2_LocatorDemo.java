import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_LocatorDemo 
 {
  public static void main(String[] args) 
   {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.utkarshaaacademy.com");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("Automation")).click();
	driver.findElement(By.id("name-firstname")).sendKeys("Harshali");
	driver.findElement(By.id("name-lastname")).sendKeys("Sonawane");
	
	driver.findElement(By.className("coblocks-field--telephone")).sendKeys("7264013513");
	driver.findElement(By.name("field-email[value]")).sendKeys("harshali.sonawane0702@gmail.com");
	
	driver.get("https://www.facebook.com");
	//driver.findElement(By.tagName("button")).click();
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	List<WebElement> images=driver.findElements(By.tagName("img"));
	System.out.println(images.size());
	
    List<WebElement> divs=driver.findElements(By.tagName("div"));
	System.out.println(divs.size());
   }

 }
