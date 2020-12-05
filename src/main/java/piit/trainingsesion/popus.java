package piit.trainingsesion;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class popus {
static	WebDriver driver;
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		 driver=new ChromeDriver();
		
		//driver.get("https://www.qatarairways.com/en-us/homepage.html");
		//driver.get("https://www.amazon.com");
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
//WebElement fr=driver.findElement(By.id("primary-button"));
//fr.click();




	//	driver.manage().window().maximize();
//WebElement	sb=driver.findElement(By.name("submit"));
	//sb.click();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();	
		//  driver.findElement(By.id("cookie-close")).click();
		 // driver.findElement(By.className("close-sc closeStyle1-sc")).click();
		  
		  //driver.findElement(By.xpath("(//*[text()='26'])[3]"));
		  
		 // driver.findElement(By.xpath("(//*[text()='x'])[1]")).click();
	//WebElement dts=driver.findElement(By.id("T7-departure_1"));
	//dts.click();	
	// driver.findElement(By.xpath("(//*[text()='15'])[1]")).click();

/*File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/pictures/Airline.png"));*/

	/*}
	
	public static void picture() throws IOException{
		
	
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/pictures/Airline.png"));*/
	}
}

