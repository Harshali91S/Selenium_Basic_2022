import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_XpathDemo1 
 {
  public static void main(String[] args) 
   {
	WebDriver driver=new ChromeDriver();
	driver.get("https://utkarshaaacademy.com");
	 
	driver.manage().window().maximize();
	
	//Contains Method XPath
	
	driver.findElement(By.xpath("//nav//a[@title='Automation Practice']")).click();
	
	//driver.findElement(By.xpath("//input[contains(@class,'first')]")).sendKeys("Harshali");
	
	//driver.findElement(By.xpath("//input[contains(@class,'last')]")).sendKeys("Sonawane");
	
	//driver.findElement(By.xpath("//input[contains(@class,'telephone')]")).sendKeys("8755365459");
	
	//driver.findElement(By.xpath("//input[contains(@class,'field--email')]")).sendKeys("sfdssj@gmail.com");
	
	//driver.findElement(By.xpath("//input[contains(@class,'date')]")).sendKeys("06-12-2022");
	
	//driver.findElement(By.xpath("//input[contains(@id,'afternoon')]")).click();
	
	//driver.findElement(By.xpath("//textarea[contains(@id,'notes')]")).sendKeys("I am Learning Software Testing");
	
	//driver.findElement(By.xpath("//button[contains(@class,'button__link')]")).click();
	
	//driver.close();
	
	//Starts with XPath(1)
	
	driver.findElement(By.xpath("//input[starts-with(@id,'name-fir')]")).sendKeys("Harshali");
	driver.findElement(By.xpath("//input[starts-with(@id,'name-l')]")).sendKeys("Sonawane");
	driver.findElement(By.xpath("//input[starts-with(@id,'p')]")).sendKeys("24564567");
	driver.findElement(By.xpath("//input[starts-with(@class,'coblocks-field coblocks-field--e')]")).sendKeys("Sonawane@gmail.com");
	driver.findElement(By.xpath("//input[starts-with(@id,'d')]")).sendKeys("06-12-2022");
	driver.findElement(By.xpath("//input[starts-with(@id,'time-a')]")).click();
	driver.findElement(By.xpath("//textarea[starts-with(@id,'s')]")).sendKeys("I am Learning Testing");
	//driver.findElement(By.xpath("//button[starts-with(@class,'wp-block-b')]")).click();
	
	//Text Function in XPath(2)
	//driver.findElement(By.xpath("//button[text()='Book Appointment']")).click();
	
	//Text Function with Contains(3)
	 driver.findElement(By.xpath("//button[contains(text(),'Book')]")).click();
	 
	 // USing OR & AND Function(1)
	driver.get("https://www.facebook.com");   
	driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("sonawane@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass' and @name='pass']")).sendKeys("23456789876");
	driver.findElement(By.xpath("//button[@name='login' and contains(@id,'u_0_5_')]")).click();
   }

 }
