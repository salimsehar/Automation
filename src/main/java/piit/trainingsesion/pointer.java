package piit.trainingsesion;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pointer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
					
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.com");
			
		driver.manage().window().maximize();
Actions its=new Actions(driver);
its.moveToElement(driver.findElement(By.xpath("(//span[text()='Hello, Sign in'])[1]"))).build().perform();
	its.moveToElement(driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"))).click().build().perform();
its.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
	its.keyUp(Keys.LEFT_SHIFT).build().perform();	
String parentwindowhandles=driver.getWindowHandle();
	System.out.println( parentwindowhandles);	
Set<String> multiplewindows=driver.getWindowHandles();
	for(String window:multiplewindows)	{
		//System.out.println(window);
		
		if(window.equalsIgnoreCase( parentwindowhandles )) {
			System.out.println("this to switch");
		}else { 
		
	driver.switchTo().window(window);
	
	}
		/*System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		WebElement ft=driver.findElement(By.xpath("//input[@placeholder='Email or Phone Number']"));
		ft.sendKeys("hassina@");
				WebElement sa=driver.findElement(By.xpath("(//*[text()='Create New Account'])[1]"));
		sa.click();
		Thread.sleep(6000);
		WebElement ab=driver.findElement(By.xpath("(//input[contains(@name,'reg_email__')])[1]"));
		ab.sendKeys("salim@");
		WebElement rf=driver.findElement(By.name("firstname"));
		rf.sendKeys("sal");
			WebElement vb=driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]"));
		vb.click();*/
	}	
	WebElement sa=driver.findElement(By.id("ap_customer_name"));
	sa.sendKeys("sal");
	driver.switchTo().window(parentwindowhandles);
	
	WebElement user6=driver.findElement(By.id("ap_customer_name"));
	user6.sendKeys("abd");
	}

}
