package linkdpractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.facebook.Linkedln;
import pages.facebook.motdepass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Practicelinkdln {
	public WebDriver driver;
  @Test
  public void A() throws InterruptedException{
	  
	  Linkedln ob=new Linkedln(driver);
	  	Thread.sleep(6000);
	  ob.salim("sali0501");
	  ob.abdeslam("1991");
	  ob.younes();
	  ob.salim("abdesgmail.com");
	  ob.abdeslam("1991");
	  ob.younes();
	 
  }
  @Test
  public void linkedin() throws InterruptedException{
	 
	  Linkedln ob=new Linkedln(driver);
	  ob.abderahmen();
	  motdepass it=new motdepass(driver);
	  SoftAssert  gt=new SoftAssert();
	  Thread.sleep(6000);
		 it.idir();
		  it.karim();
String forgettext=it.hassina().getText();
	  System.out.println(forgettext);
	  gt.assertEquals(forgettext, "Please enter your email or phone");
	  //Assert.assertEquals(forgettext, "Please enter your emai or phone");
	  gt.assertAll();
  }
  @BeforeClass
  public void beforeClass() {
	salim("chrome","https://www.linkedin.com");
  }


  public void afterClass() {
	driver.manage().window().maximize();
	
  }
  public void salim(String browser,String uri) {
		if(browser.equalsIgnoreCase("chrome")) { 

			System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");	
			 driver=new ChromeDriver();
			 driver.get(uri);
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/Users/salimsehar/Desktop/geckodriver");
	driver=new FirefoxDriver();
	driver.get(uri);
		}
			
		
	}
}
