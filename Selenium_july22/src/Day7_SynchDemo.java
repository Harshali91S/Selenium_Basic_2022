import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day7_SynchDemo 
 {
	public static void main(String[] args)
	 {
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		
		//Explicit wait provided by selenium(3)
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Dynamic wait provided by selenium implicit wait(2)
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.get("https://www.facebook.com");  //(1)
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//Static wait provided by java(1)
		//Thread.sleep(5000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Harshali");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to Facebook')");
		
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harshali");
		
	 }
 }
