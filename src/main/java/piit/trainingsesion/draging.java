package piit.trainingsesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draging {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(6000);
			driver.get("https://jqueryui.com/droppable/");
			
			//driver.get("https://www.amazon.com");
			//what is iframe//iframe webpage inside webpage
			
			
		driver.manage().window().maximize();
	  Actions it=new Actions(driver);
	  
	driver.switchTo().frame(0) ;
	  
	  WebElement sr=driver.findElement(By.id("draggable"));
	    WebElement dr=driver.findElement(By.id("droppable"));
	   
	    it.dragAndDrop(sr, dr).build().perform();
	    
	  it.dragAndDrop(sr, dr).build().perform();
	}

}
