package piit.trainingsesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// how to open the browser
		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		//driver.get("https://www.ebay.com");
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.quit();*/
		/*locators spoted by selenium
		 id-linktext-partialtext-tagname-css selector-tagname*/
	//driver.manage().window().maximize();
	
	//WebElement its=	driver.findElement(By.id("twotabsearchtextbox"));
	//	its.sendKeys("cumputer");
	//WebElement rs=	driver.findElement(By.id("nav-search-submit-text"));
		//rs.click();
	/*	driver.manage().window().maximize();
WebElement	sr=	driver.findElement(By.id("gh-ac"));
sr.sendKeys("apple watch6");
	WebElement ns=driver.findElement(By.id("gh-btn"));
	ns.click();	*/
		
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		
		//WebElement dh=driver.findElement(By.id("headerSearch"));
		//dh.sendKeys("grill");
		
		//WebElement sm=driver.findElement(By.id("headerSearchButton"));
		//sm.click();
		WebElement fr=driver.findElement(By.xpath("(//*[text()='Shop Now'])[1]"));
		fr.click();
WebElement st=driver.findElement(By.xpath("(//*[text()='Add To Cart'])[3]"));
	st.click();
		
		
	}

}
