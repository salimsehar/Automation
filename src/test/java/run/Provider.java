package run;

import org.testng.annotations.Test;

import Codetostar.Usability;
import pages.facebook.home;

import org.testng.annotations.DataProvider;

public class Provider extends Usability {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	  home ob=new home(driver);
	  ob.emailofinput(n);
	  ob.psswrdoffield(s);
	  Thread.sleep(6000);
ob.logg();
	  /*ob.emailofinput("saligmail.com");
	  ob.psswrdoffield("1988");
	  // ob.logg();
	  ob.emailofinput("abdeslam0102gamil.com");
	  ob.psswrdoffield("1990");
  ob.logg();*/
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abdeslam0102gamil.com", "1990" },
      new Object[] { "saligmail.com", "1988" },
      new Object[] { "automation@hotmail.com", "us" },
      
      
    };
  }
}
//enter valid username and invalid password
//enter invalid username and valid password
//enter invalid username and invalid password