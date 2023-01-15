import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_XpathAxesDemo 
 {
  public static void main(String[] args)  
   {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
     
     driver.manage().window().maximize();
     
      //preceding & Following(5)
      //driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Harshali");
     driver.findElement(By.xpath("//input[@id='pass']//preceding::input[1]")).sendKeys("Harshali");
     driver.findElement(By.xpath("//input[contains(@id,'email')]//following::input[1]")).sendKeys("sdfg45");
     //driver.findElement(By.xpath("//input[contains(@id,'email')]//following::button")).click();
     
     //Descendant(1)
    // driver.findElement(By.xpath("//div[@id='pageFooterChildren']//descendant::a[7]")).click();
     
     //ancestor(2)
     List<WebElement> ancestorsDiv= driver.findElements(By.xpath("//a[text()='Sign Up']//ancestor::div"));
     System.out.println(ancestorsDiv.size());
     
     //Preceding(3)
     List<WebElement> PrecedingDiv= driver.findElements(By.xpath("//a[text()='Sign Up']//preceding::div"));
     System.out.println(PrecedingDiv.size());
     
     //Descendant
    // driver.findElement(By.xpath("//div[@id='pageFooterChildren']//descendant::a[7]")).click();
     
     //Child(4)
    // driver.findElement(By.xpath("//div[@id='pageFooterChildren']//child::li[18]")).click();
     
     //Following-Sibling(6)
     driver.findElement(By.xpath("//a[text()='Facebook Lite']//parent::li//following-sibling::li[2]")).click();
     
     //Preceding-sibling(7)
     driver.findElement(By.xpath("//a[text()='Facebook Lite']//parent::li//preceding-sibling::li[3]")).click();
   }

 }
