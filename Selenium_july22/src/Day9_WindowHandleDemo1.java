import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_WindowHandleDemo1 
 {
   public static void main(String[] args) 
    {	
      WebDriver driver=new ChromeDriver();                  //(1)
      driver.get("https://demoqa.com/browser-windows");       //(1)
      driver.manage().window().maximize();                   //(1)
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //(1)
      
      driver.findElement(By.xpath("//button[@id='tabButton']")).click();    //(1)
      //driver.findElement(By.xpath("//button[@id='windowButton']")).click();   //(1)
      //driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();    //(1)
      
      String MainWindow = driver.getWindowHandle();         //(1)
      Set<String> ChildWindows = driver.getWindowHandles();    //(1)
      
      for(String childwindow : ChildWindows)                  //(4)
      {                                                       //(4)
    	  if(!MainWindow.equals(childwindow))                     //(4)
     	 {                                                      //(4)
     		driver.switchTo().window(childwindow);                  //(4)
     		String headingTest = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();       //(4)
     		//String bodyText = driver.findElement(By.xpath("/html/body/text()")).getText();                  // (4)
     		System.out.println(headingTest);                                                               //(4)
     	 }
     		//driver.close();                                                                //(4)
      }
      //Iterator<String> itr = ChildWindows.iterator();      //(1)
      
    //  while(itr.hasNext())                       //(1)
      //{                                             //(1)
    	// String child_window = itr.next();           //(1)
    	 //if(!MainWindow.equals(child_window))        //(1)
    	 //{                                              //(1)
    		//driver.switchTo().window(child_window);       //(1)
    		//String headingTest = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();      //(1)
    		//String bodyText = driver.findElement(By.xpath("/html/body/text()")).getText();              //(1)
    		//System.out.println(bodyText);                                                        //(1)
    		//driver.close();                                        //(2)
    	// }                                                          //(1)
     // }                                                              //(1)
      //driver.switchTo().window(MainWindow);                                         //(1)
     // driver.quit();                                               //(3)
	}
 }
