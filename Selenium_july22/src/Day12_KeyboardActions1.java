import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_KeyboardActions1 
 {
  public static void main(String[] args) 
   {
     WebDriver driver= new ChromeDriver();
     driver.get("https://demoqa.com/text-box");    //(1)
     
     driver.manage().window().maximize();           //(1)
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));           //(1)
     
     WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));       //(1)
/*     WebElement UserEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));         //(1)
     WebElement UserCurrentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));    //(1)
     WebElement UserPerAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));       //(1)
     WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));               //(1)
     
     UserName.sendKeys("Harshali Sonawane");                    //(1)
     UserEmail.sendKeys("abcd@gmail.com");                      //(1)
     UserCurrentAdd.sendKeys("123,Nashik");                      //(1)
     UserPerAdd.sendKeys("Time Blossom, Nashik");                 //(1)
     SubmitBtn.click();           */                                    //(1)
     
     Actions act = new Actions(driver);                            //(2)
     act.sendKeys(UserName, "Harshali Sonawane").perform();          //(2)
     act.sendKeys(Keys.TAB).perform();                                 //(2)
     act.sendKeys("abcd@gmail.com").perform();                             //(2)
     act.sendKeys(Keys.TAB).perform();                                  //(2)
     act.sendKeys("Time Blossom, Nashik Pin-422009").perform();           //(2)
     
     //Select a text
     act.keyDown(Keys.CONTROL);                             //(3)
     act.sendKeys("a");                                           //(3)
     act.build().perform();                                //(3)
     act.keyUp(Keys.CONTROL).perform();                      //(3)
     
     //Copy a text
     act.keyDown(Keys.CONTROL);                            //(4)
     act.sendKeys("c");                                    //(4)
     act.build().perform();                                //(4)
     act.keyUp(Keys.CONTROL).perform();                       //(4)
     
     act.sendKeys(Keys.TAB).perform();                        //(4)
     
     //Paste a Selected text
     act.keyDown(Keys.CONTROL);                                 //(5)
     act.sendKeys("v");                                          //(5)
     act.build().perform();                                     //(5)
     act.keyUp(Keys.CONTROL).perform();                        //(5)
     
     act.sendKeys(Keys.TAB).perform();                            //(5)
    // act.click().perform();                                        //(5)
     act.sendKeys(Keys.ENTER).perform();                            //(5)
   }
 }
