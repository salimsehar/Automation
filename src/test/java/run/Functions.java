package run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Codetostar.Usability;
import pages.facebook.home;

public class Functions extends Usability {
	//public WebDriver driver;

  @Test(priority=2,dependsOnMethods = "g")
  public void f() {
	  
		 home ob=new home(driver);
		  ob.emailofinput("abdeslam0102gamil.com");
		  ob.psswrdoffield("1990");
	  ob.logg();
		  ob.emailofinput("saligmail.com");
		  ob.psswrdoffield("1988");
		  // ob.logg();
		  
  }
  
@Test(priority=1)
public void g() {
	System.out.println("g");
	driver.findElement(By.linkText("di"));
}





  //@BeforeClass
  //public void beforeClass() {
		

		//driver("chrome","https://wwww.facebook.com");
		
 // }

  //@AfterTest
  //public void afterClass() {
	 //driver.close();
  //} 

 /*public void driver(String browser,String uri) {
		
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