import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_FrameDemo 
 {
   public static void main(String[] args) 
    {
      WebDriver driver=new ChromeDriver();                     //(1)
      driver.get("https://demoqa.com/frames");                  //(1)
      driver.manage().window().maximize();                         //(1)
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));         //(1)
      
      //Frame using index
     // driver.switchTo().frame(2);                                     //(3)
      
     // Frame using name or id
     //driver.switchTo().frame("Frame1");                                 //(2)
      
      // Frame using Webelement
      WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));      //(3)
      
      driver.switchTo().frame(Frame1);                                                   //(3)
      
      String FrameText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();           //(1)
      //OR String FrameText = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();    //(1)
      
      System.out.println(FrameText);                                       //(1)
      
      driver.switchTo().parentFrame();                                //(10)
      
      driver.switchTo().frame("frame2");                                  //(10)
      
      System.out.println(FrameText);                                 //(10)
      
      
        driver.get("https://demo.guru99.com/test/guru99home");                        //(4)
        
     // String MainWindow = driver.getWindowHandle();                                   //(8)
        
      WebElement Frame2 = driver.findElement(By.xpath("//iframe[contains(@src,'youtube')]"));          //(4)
      
      driver.switchTo().frame(Frame2);                                                    //(4)
      
      //driver.switchTo().frame(0);                                                   //(8)
      
      driver.findElement(By.xpath("//button[@aria-label='Play']")).click();                    //(4)
      
      driver.switchTo().parentFrame();                                          //(7)
      
     // driver.switchTo().window(MainWindow);                                         //(9)
      
      driver.switchTo().frame("a077aa5e");                                          //(6)
      
      driver.findElement(By.xpath("//a[contains(@href,'live-selenium-project.html')]//img")).click();      //(5) 
	}
 }
