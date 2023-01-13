import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8_AlertDemo 
 {
	public static void main(String[] args) 
	 {
      WebDriver driver = new ChromeDriver();  ///(1)
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
      
      driver.get("https://demo.guru99.com/test/delete_customer.php");
      
      driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
      driver.findElement(By.xpath("//input[@name='submit']")).click();
      
      String AlertText = driver.switchTo().alert().getText();
      System.out.println(AlertText);         //(1)
      //driver.switchTo().alert().dismiss();   //(2)
      driver.switchTo().alert().accept();     //(1)
      
      String AlertText1 = driver.switchTo().alert().getText();   //(2)
      System.out.println(AlertText1);                       //(2)                                      
      driver.switchTo().alert().accept();	                  //(2)
      
      driver.get("https://demoqa.com/alerts");                  //(3)
      
      WebElement NestedFrame = driver.findElement(By.xpath("//span[text()='NestedFrames']"));     //(4)
      
      Actions actions = new Actions(driver);                                                 //(4)
      actions.moveToElement(NestedFrame).build().perform();                                   //(4)
      
      driver.findElement(By.xpath("//button[@id='promtButton']")).click();                  //(3)
      
      driver.switchTo().alert().sendKeys("Harshali Sonawane");                             //(5)
      driver.switchTo().alert().accept();                                               //(5)
      }
 }
