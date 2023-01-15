import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Launch_Chrome {

	public static void main(String[] args) 
	 {
	   WebDriver driver=new ChromeDriver();
       // driver.get("https://www.google.com");
	   String UtkarshaaURL = "https://www.utkarshaaacademy.com";
	  driver.get(UtkarshaaURL);
	 // System.out.println(driver.getTitle());
	  //System.out.println(driver.getCurrentUrl());
	 }

}
