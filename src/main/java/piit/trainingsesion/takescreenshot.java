package piit.trainingsesion;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {
static	WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

	System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		 driver=new ChromeDriver();

		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.get("https://www.ebay.com");
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("cookie-close")).click();
		salim();
		//picture("cokies");
		WebElement dts=driver.findElement(By.id("T7-departure_1"));
		dts.click();	
		salim();
		 driver.findElement(By.xpath("(//*[text()='15'])[1]")).click();
		 salim();
		 //picture("calende");
//picture("Dates");
//File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileHandler.copy( shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/pictures/Magic.png"));
	//}
//public static void picture(String pic) throws IOException  {
	//capture the system date or time
//convirt to string format
	//use to picture name
	//Date dt=new Date();
	//Date dt=new Date();
	// String si=dt.toString().replace(" ", "_").replace(":", "_");
	// System.out.println(si);
	// System.out.println(dt);
	 //File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileHandler.copy( shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/pictures/"+si+pic+".png"));
	//File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//FileHandler.copy(shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/pictures/practice.png"));
	
	
	
}
public static void salim() throws IOException {
	//capture the system date or time
	//convert to string format
	//use with picture name
	Date dt=new Date();
	System.out.println(dt);
	String si=dt.toString().replace(" ", "_").replace(":","_");
	System.out.println(si);
	
File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(shots, new File("/Users/salimsehar/eclipse-workspace/trainingsesion/pictures/"+si+".opg"));
	
	
	
}
}







