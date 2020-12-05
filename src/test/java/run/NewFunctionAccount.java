package run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Codetostar.Usability;
import pages.facebook.Forgot_password;
import pages.facebook.home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewFunctionAccount extends Usability{
	
	//public WebDriver driver;
  //@Test
 /*public void f() {
	//open the facebook site and verify the loggin function  
	  
	  
	 home ob=new home(driver);
	  ob.emailofinput("abdeslam0102gamil.com");
	  ob.psswrdoffield("1990");
	  ob.logg();
	  ob.emailofinput("saligmail.com");
	  ob.psswrdoffield("1988");
	 // ob.logg();
  }*/
  //open the facebook site and verify login fuction
@Test
  public void forgotlinkforpassword() {
	home it=new home(driver);
	it.forgotlink();
	Forgot_password ds=new Forgot_password(driver);
	SoftAssert gt=new SoftAssert();
String Forgoturntext=ds.ForgotYourAccountText().getText();
System.out.println(Forgoturntext);
gt.assertEquals(Forgoturntext, "Find Your Account");
//Assert.assertEquals( Forgoturntext, "Find Your Accountit");

	ds.searchfieldemail("sal1988");
	ds.buttonlk();
	gt.assertAll();
	
	
}
  /*@BeforeClass
  public void beforeClass() {
		

		driver("chrome","https://wwww.facebook.com");
		
  }

  @AfterTest
  public void afterTest() {
	 //driver.close();
	  
	  
  }
  public void driver(String browser,String uri) {
		
	//String dt=System.getProperty("user.dir");
		//System.out.println("this of dt+dt");
		
	
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
			
			 driver=new ChromeDriver();
				driver.get(uri);

		 		driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/Users/salimsehar/Desktop/geckodriver");	
			 driver=new FirefoxDriver();

				driver.get(uri);

		 		driver.manage().window().maximize();
		}		
		}*/
}
