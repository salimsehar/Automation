package Codetostar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.AfterClass;

public class Usability {
	public WebDriver driver;
  @Parameters({"browser","url"})
  @BeforeClass
  public void beforeClass(String browser,String site) {
	  
	 // public void driver(String browser,String uri) {
			
			//String dt=System.getProperty("user.dir");
				//System.out.println("this of dt+dt");
				
  
			if(browser.equalsIgnoreCase("chrome")) {
					
					System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
					
					 driver=new ChromeDriver();
						driver.get(site);

				 		driver.manage().window().maximize();
				}else if(browser.equalsIgnoreCase("firefox")) {
					
					System.setProperty("webdriver.gecko.driver","/Users/salimsehar/Desktop/geckodriver");	
					 driver=new FirefoxDriver();

						driver.get(site);

				 		driver.manage().window().maximize();
				}	
	}
	 // driver("Chrome", "https://www.facebook.com");
  
  //@AfterClass
  //public void afterClass() {
	//driver.close();  
 // }
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

