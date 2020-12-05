package piit.trainingsesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assertion {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            //firefox
		salim("chrome", "https://www.facebook.com");
	driver.manage().window().maximize();
		
		
		
		//System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");	
		 //driver=new ChromeDriver();
	/*driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	WebElement createnewaccount=driver.findElement(By.linkText("Create New Account"));
		createnewaccount.isDisplayed();
		boolean button=createnewaccount.isDisplayed();
		System.out.println(button);
WebElement dt=driver.findElement(By.tagName("h2"));
		dt.getText();
	String textheading=dt.getText();	
		System.out.println(textheading);*/
		
		//System.setProperty("webdriver.gecko.driver","/Users/salimsehar/Desktop/geckodriver");
//driver=new FirefoxDriver();
//driver.get("https://www.facebook.com");
//driver.manage().window().maximize();
//WebElement ab=driver.findElement(By.id("u_0_b"));
//boolean jaha=ab.isDisplayed();	
	//	System.out.println(jaha);
		//System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
		// driver=new ChromeDriver();
		 //firefo
		/*System.setProperty("webdriver.gecko.driver", "/Users/salimsehar/Downloads/geckodriver");
		 driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
	 		driver.manage().window().maximize();*/
/*WebElement createNewAccounts=driver.findElement(By.linkText("Create New Account"));
  boolean button=createNewAccounts.isDisplayed();
	System.out.println(button);	
WebElement ds=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
String textheading=ds.getText();
		System.out.println(textheading);
		//Users/salimsehar/Downloads*/
	 	//	http://dl.bintray.com/testng-team/testng-eclipse-release/
//u_0_b	
	}
public static void salim(String browser,String uri) {
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
/*public void onTestSuccess(ITestResult result) {
	 
	// TODO Auto-generated method stub
	 
	//ITestListener.super.onTestSuccess(result);
	 
	System.out.println("Automation is passed");
	 
	this.driver = ((Usability)result.getInstance()).driver;
	 
	Date dt=new Date();
	 
	System.out.println(dt);
	 
	String si=dt.toString().replace(" ", "_").replace(":", "_");
	 
	System.out.println(si);
	 
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	try {
	 
	FileHandler.copy(shots,new File("C:\\Users\\user\\Coding\\Trainingsession\\Pictures\\"+si+".png"));
	 
	} catch (IOException e) {
	 
	// TODO Auto-generated catch block
	 
	e.printStackTrace();
	 
	}
	 
}*/

/*public void onTestFailure(ITestResult result) {
	 
	// TODO Auto-generated method stub
	 
	//ITestListener.super.onTestFailure(result);
	 
	this.driver = ((Usability)result.getInstance()).driver;
	 
	Date dt=new Date();
	 
	System.out.println(dt);
	 
	String si=dt.toString().replace(" ", "_").replace(":", "_");
	 
	System.out.println(si);
	 
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	try {
	 
	FileHandler.copy(shots,new File("C:\\Users\\user\\Coding\\Trainingsession\\Pictures\\"+si+".png"));
	 
	} catch (IOException e) {
	 
	// TODO Auto-generated catch block
	 
	e.printStackTrace();
	 
	}*/
}