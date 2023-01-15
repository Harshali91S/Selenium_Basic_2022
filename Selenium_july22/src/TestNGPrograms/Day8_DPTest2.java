package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class Day8_DPTest2 
 {
	
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
