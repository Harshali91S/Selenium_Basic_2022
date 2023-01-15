import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_NavigationDemo 
 {
   public static void main(String[] args) 
    {
      WebDriver driver=new ChromeDriver();
      
      //Maximize the window
      driver.manage().window().maximize();
      
      String URL="https://www.utkarshaaacademy.com";
      driver.get("https://www.facebook.com");
      
      //Navigation commands
      //driver.navigate().to("https://www.utkarshaaacademy.com");
      
      driver.navigate().to(URL);
      driver.navigate().back();
      
      driver.navigate().forward();
      driver.navigate().refresh();
      
      driver.get("https://www.google.com");
      driver.close();
	}

 }
