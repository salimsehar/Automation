package piit.trainingsesion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxwork {
	static	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	driver("chrome","https://wwww.amazon.com");
		//driver("firefox","https://wwww.facebook.com");
	/*System.setProperty("webdriver.gecko.driver","/Users/salimsehar/Desktop/geckodriver");	
	 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
 		driver.manage().window().maximize();*/
	}
public static void driver(String browser,String uri) {
	
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
}
}
