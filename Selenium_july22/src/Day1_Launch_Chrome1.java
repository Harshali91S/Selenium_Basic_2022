import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Launch_Chrome1 
 {
	public static void main(String[] args) 
	 {
		 WebDriver driver=new ChromeDriver();
	       // driver.get("https://www.google.com");
		   String AmazonURL = "https://www.amazon.com";
		  driver.get(AmazonURL);
	 }

 }
