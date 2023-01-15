import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day12_DropdownDemo2 
 {
  public static void main(String[] args) 
   {
    WebDriver driver = new ChromeDriver();   
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //Dynamic Drop down//
    driver.get("https://demoqa.com/select-menu");                        //(4)
    WebElement SelectOpt = driver.findElement(By.xpath("//div[@id='withOptGroup']//div[@class=' css-1hwfws3']"));     //(4)
    SelectOpt.click();                                           //(4)
    
    driver.findElement(By.xpath("//div[text()='Group 2, option2']")).click();     //(4)
    
    driver.get("https://www.facebook.com/reg");                      //(1)
    
    WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));     //(1)
    
   // Select day = new Select(Day);                                //(1)
    //day.selectByIndex(13);                                      //(1)
    //day.selectByVisibleText("3");                                //(2)
    driver.findElement(By.cssSelector("select#day>option:nth-of-type(3)")).click();
    
    WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));           //(3)
    
    //Select month = new Select(Month);                                       //(3)
    //month.selectByValue("10");                                                //(3)
    driver.findElement(By.cssSelector("select#month>option:nth-of-type(10)")).click();          //(4)
    
    WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));     //(3)
    
    Select year = new Select(Year);                                     //(3)
    year.selectByVisibleText("2000");                                  //(3)
   }
 }
