import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day14_jsDemo 
 {
  public static void main(String[] args) 
   {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/buttons");     //(1)
	driver.manage().window().maximize();           //(1)
	
	WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));     //(1)
	WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));         //(1)
	WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));       //(1)
	
	Actions act= new Actions(driver);                  //(2)
	
	JavascriptExecutor js = (JavascriptExecutor)driver;         //(2)
	//WebElement Buttons = driver.findElement(By.xpath("//span[text()=' Buttons']"));           //(1)
	//act.moveToElement(Buttons).perform();                                                      //(1)
	
	act.doubleClick(DoubleClickBtn).perform();                                      //(1)
	act.contextClick(RightClickBtn).perform();                                          //(1)
	//DynamicClickBtn.click();                                                  //(3)
	//act.click(DynamicClickBtn).perform();                                            //(1)
	js.executeScript("arguments[0].click()", DynamicClickBtn);                      //(2)
	
	js.executeScript("alert('Welcome to Demo QA page')");                        //(4)
	
	driver.switchTo().alert().accept();                                        //(4)
	
	js.executeScript("window.location ='https://www.utkarshaaacademy.com'");          //(5)
	
	String DomainName = js.executeScript("return document.domain;").toString();         //(5)
	System.out.println("Domain name of the site ="+DomainName);                         //(5)
	
	String url = js.executeScript("return document.URL;").toString();                      //(5)
	System.out.println("URL of the site ="+url);                                       //(5)
	
	//Method document.title fetch the Title name of the site. Tostring() change object to name    //(5)//      
	String TitleName = js.executeScript("return document.title;").toString();                   //(5)   
	System.out.println("Title of the page ="+TitleName);                                        //(5)
	
	//js.executeScript("window.scrollBy(0,600)");                              //(6)
	
	WebElement Address = driver.findElement(By.xpath("//span[contains(text(),'Infront of Vandevi')]"));           //(7)
     js.executeScript("arguments[0].scrollIntoView(true)",Address);                       //(7)
     
     WebElement AutoPrac = driver.findElement(By.xpath("//nav[@class='menubar']//a[text()='Automation Practice']"));   //(7)
     js.executeScript("arguments[0].click()",AutoPrac);                           //(7)
     
     WebElement FirstName = driver.findElement(By.xpath("['//input[@id='name-firstname']"));         //(7)
     js.executeScript("arguments[0].value='Harshali'", FirstName);                              //(7)
   }
 }
