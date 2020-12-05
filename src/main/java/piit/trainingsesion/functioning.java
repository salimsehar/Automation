package piit.trainingsesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class functioning {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		

	System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();

		/*WebElement createAnaccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createAnaccount.click();*/
		WebElement createAanccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAanccount.click();
		Thread.sleep(6000);
		
		//WebElement sign=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		//sign.click();
		WebElement sing=driver.findElement(By.xpath("(//*[contains(text(),'Sign Up')])[5]"));
		sing.click();
		
	
	}

}
