package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Day8_DataDrivenTest 
 {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) 
   {
	Integer Sum =n + s;
	System.out.println("Addition "+Sum);
   }
  
  @Test(dataProvider = "dp")
  public void diff(Integer n, Integer s) 
   {
	Integer Diff =n - s;
	System.out.println("Difference "+Diff);
   }
  
  @Test(dataProvider = "dp")
  public void mul(Integer n, Integer s) 
   {
	Integer Mul =n * s;
	System.out.println("Multiplication "+Mul);
   }
  
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) 
   {
	Integer Div =n / s;
	System.out.println("Divison "+Div);
   }

  @DataProvider
  public Object[][] dp() 
   {
    return new Object[][] 
     {
      new Object[] { 1, 2 },
      new Object[] { 2, 3 },
      new Object[] { 11, 29 },
      new Object[] { 25, 93 },
      new Object[] { 100, 22 },
      new Object[] { 72, 93 },
      new Object[] { 51, 20 },
      new Object[] { 26, 32 },
     };
   }
 }
