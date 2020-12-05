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

public class phototaking {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");		
		driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		WebElement sa=driver.findElement(By.id("email"));
		sa.sendKeys("abdeslamo5o61990");
			photo();
			
		WebElement ds=driver.findElement(By.id("u_0_2"));	
			ds.click();
			Thread.sleep(6000);
			WebElement cv=driver.findElement(By.id("u_1_b"));
			cv.sendKeys("abdeslem");
				photo();
	//File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileHandler.copy(shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/photo/facebook.png"));
	
	}
public static void photo() throws IOException {
	
	
	
Date dt=new Date();
System.out.println(dt);	
String si=dt.toString().replace(" ", "_").replace(":", "_");
System.out.println(si);

File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(shots,new File("/Users/salimsehar/eclipse-workspace/trainingsesion/photo/"+si+".png"));

}
}
