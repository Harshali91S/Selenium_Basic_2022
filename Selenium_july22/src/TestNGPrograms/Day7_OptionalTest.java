package TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7_OptionalTest 
 {
  @Test
  @Parameters("message")
  public void op(@Optional("optional message selected")String message) 
   {
	  System.out.println(message);
   }
   
	  @Test
	  @Parameters({"val1","val2"})
	  public void OP1(@Optional("10")int val1,@Optional("20")int val2) 
	   {
		  int finalsum = val1+val2;
		  System.out.println("Final Addition is "+finalsum);
	   }
  }
