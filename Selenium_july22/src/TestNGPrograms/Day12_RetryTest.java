package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day12_RetryTest 
 {
  @Test(retryAnalyzer = TestNGPrograms.Day12_RetryAnalyzer.class)
  public void First() 
   {
	 Assert.assertEquals(false, true); 
   }
  @Test
  public void Second() 
   {
	 Assert.assertEquals(false, true); 
   }
  @Test
  public void Third() 
   {
	 Assert.assertEquals(true, true); 
   }
 }
