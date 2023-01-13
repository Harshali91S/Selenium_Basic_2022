import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_CSSSelectorDemo 
 {
	public static void main(String[] args) 
	 {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		
		driver.manage().window().maximize();
		 
		//driver.findElement(By.partialLinkText("Automation")).click();
		
		//CSS Selector with parent child relationship
		driver.findElement(By.cssSelector("nav>ul>li>a[title='Automation Practice']")).click();
		
		//CSS Selector
		
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Harshali");
		//driver.findElement(By.cssSelector("#name-firstname")).sendKeys("Harshali");
		//driver.findElement(By.cssSelector("input[id='name-firstname']")).sendKeys("Harshali");
		
		//driver.findElement(By.cssSelector("input[class='coblocks-field coblocks-field--name last']")).sendKeys("Sonawane");
		
		driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Sonawane");
		
		//driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--telephone")).sendKeys("7264013513");
		
		//driver.findElement(By.cssSelector("input[name='field-phone[value]']")).sendKeys("7264013513");
		//driver.findElement(By.cssSelector("input[id^='ph']")).sendKeys("7264013513");
		// driver.findElement(By.cssSelector("input[id$='ne']")).sendKeys("7264013513");
		  driver.findElement(By.cssSelector("input[id*='ho']")).sendKeys("7264013513");
		//driver.findElement(By.cssSelector("button[class='wp-block-search__button wp-element-button']")).click();
		
		//CSS Selector with Combinations
		
		//driver.findElement(By.cssSelector("input.coblocks-field--email#email")).sendKeys("harshali.sonawane0702@gmail.com");
		
		//CSS Selector with id along with other attribute
		 driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("harshali.sonawane0702@gmail.com");
		 
		 driver.get("https://www.facebook.com");
		 
		 //CSS Selector with parent child relationship
		// driver.findElement(By.cssSelector("div._6ltg>button")).click();
		 
		 driver.get("https://demoqa.com/select-menu");
		 
	      driver.findElement(By.cssSelector("select>option:nth-of-type(9)")).click();
	      
		  driver.findElement(By.cssSelector("div#withOptGroup>div.css-lhwfw3")).click();
		  
		// driver.findElement(By.cssSelector("div#withOptGroup>div>div>div.css-lucc91-singleValue")).click();
		  
		  driver.findElement(By.cssSelector("div#withOptGroup>div>div>div:nth-of-type(3)")).click();
		 
	 }

 }
