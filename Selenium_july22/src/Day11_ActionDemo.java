import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11_ActionDemo 
{
   public static void main(String[] args) throws InterruptedException 
   {
     WebDriver driver= new ChromeDriver();                             //(1)
     driver.get("https://www.browserstack.com");                       //(1)
     driver.manage().window().maximize();                             //(1)
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));      //(1)
     
     Actions act = new Actions(driver);                                  //(1)
     
     WebElement GetDemoBtn = driver.findElement(By.xpath("//a[@id='signupModalButton']"));    //(1)
     act.moveToElement(GetDemoBtn).perform();                                   //(1)
     
     Thread.sleep(2000);                                       //(2)
     
     WebElement ProductsBtn = driver.findElement(By.xpath("//button[text()='Products' and @id='product-menu-toggle']"));    //(2)
     act.moveToElement(ProductsBtn).perform();                                //(2)
     
     WebElement LiveBtn = driver.findElement(By.xpath("//div[@class='dropdown-link-wrapper']//div[text()=' Live ']"));     //(9)
     act.clickAndHold(LiveBtn).perform();                                       //(9)
     
     WebElement contactUSBtn= driver.findElement(By.xpath("//button[text()=' Contact Us ']"));           //(3)
     act.moveToElement(contactUSBtn).perform();                                              //(3)
     
     Thread.sleep(2000);                              //(4)
     
     WebElement TermsBtn = driver.findElement(By.xpath("//footer//a[text()='Terms of Service']"));        //(4)
     act.moveToElement(TermsBtn).perform();                                    //(4)
     
     driver.get("https://demoqa.com/buttons");                                 //(5)
     
     WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));      //(5)
     WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));         //(5)
     WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));         //(5)
     
     WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));            //(6)
     act.moveToElement(Buttons).perform();                                                  //(6)
     
     act.doubleClick(DoubleClickBtn).perform();                //(5)
     act.contextClick(RightClickBtn).perform();                   //(5)
     act.click(DynamicClickBtn).perform();                       //(5)
     
     driver.get("https://demoqa.com/droppable");              //(7)
     
     WebElement interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));             //(8)
     act.moveToElement(interactions).perform();                                                          //(8)
     
     WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));     //(7)
     WebElement Destination = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));     //(7)
     act.dragAndDrop(Source, Destination).perform();                                 //(7)
     
     act.clickAndHold(Source).perform();                                      //(9)
   }

}
