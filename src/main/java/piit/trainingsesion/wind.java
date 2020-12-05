package piit.trainingsesion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
   Actions its=new Actions(driver);
   
   its.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']")))	.build().perform();
		its.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).click().build().perform();
	String parentwindowhandeles=driver.getWindowHandle();
		//System.out.println(parentwindowhandeles);
		
		its.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.LEFT_SHIFT).click().build().perform();
		its.keyUp(Keys.LEFT_SHIFT).build().perform();
Set<String>MultipleWindows=driver.getWindowHandles();
	for(String window:MultipleWindows) {
	//	System.out.println(window); 
		if(window.equalsIgnoreCase(parentwindowhandeles)) {
			System.out.println("this to switch");
		}else {
		driver.switchTo().window(window);
		
	};
		
	}	
		WebElement name =driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("name");
		driver.switchTo().window(parentwindowhandeles);
		WebElement user6 =driver.findElement(By.id("ap_customer_name"));
		user6.sendKeys("name");
		
		///Users/salimsehar/Desktop/Chromedriver
		
		///Users/salimsehar/Downloads/chromedriver-2 
	}

}
