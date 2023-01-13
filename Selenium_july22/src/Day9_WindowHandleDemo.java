import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_WindowHandleDemo 
 {
	public static void main(String[] args) 
	 {
       WebDriver driver = new ChromeDriver();  //(1)
       driver.get("https://www.naukri.com");   //(1)
       driver.manage().window().maximize();    //(1)
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //(1)
       
       driver.findElement(By.xpath("//div[text()='Services']")).click();
       
       String MainWindow = driver.getWindowHandle();   //2
       Set<String> ChildWindows = driver.getWindowHandles();  //2
       Iterator<String> itr = ChildWindows.iterator();    //2
       
       while(itr.hasNext())  //2
       {
         String child_window = itr.next();   //2
    	 if(!MainWindow.equals(child_window));    //3
    	  {
    	   driver.switchTo().window(child_window);   //3
    	   //driver.findElement(By.xpath("//div[text()='Services']")).click();   //(1)
    	   driver.findElement(By.xpath("//span[text()='2047']//preceding::div[@class='startsFrom']//parent::div[@class='priceDetails']//following-sibling::div[@class='knowMore']")).click(); //(1)
    	   System.out.println(driver.getTitle());   //5
    	   }
       }
       
       driver.switchTo().window(MainWindow);      //4
       
	 }
}
