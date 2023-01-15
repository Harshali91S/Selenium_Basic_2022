package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Day8_DPTest 
 {
	public WebDriver driver;
  @Test(dataProvider = "FBLogin")
  public void FaceBookLogin(String username, String password) 
   {
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 Reporter.log("Chrome Successfully Started");
	 WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	 WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	 WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	 
	 UserName.sendKeys(username);
	 PassWord.sendKeys(password);
	 LoginBtn.click();
	 Reporter.log("Successfully Enter username and password and click on login button",true);
	 
   }

  @DataProvider
  public Object[][] FBLogin() 
   {
    return new Object[][] 
     {
      new Object[] {"harshali.sonawane123@gmail.com","123345" },
      new Object[] {"harshali.sonawane3@gmail.com", "derfs12"},
      new Object[] {"harshali.sonawane109@gmail.com","1dfr5" },
      new Object[] {"harshali.sonawane399@gmail.com", "derfs99"},
      new Object[] {"harshali.sonawane1ew@gmail.com","1233vbn" },
      new Object[] {"harshali.sonawane@gmail.com", "derfs123"},
     };
   }
 }
