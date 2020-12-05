package piit.trainingsesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class slocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
	
	System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		
		driver.get("https://www.facebook.com");
		
	//	driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
	/*WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	
	WebElement searchbutton=driver.findElement(By.id("nav-search-submit-text"));
		search.sendKeys("phone");
		searchbutton.click();*/
		//WebElement name=driver.findElement(By.name("email"));
		//name.sendKeys("abdeslem0907.com");
//WebElement password=driver.findElement(By.name("pass"));
		
		//password.sendKeys("abdeslem01");
		//WebElement sign=driver.findElement(By.name("login"));
		//sign.click();
		//WebElement forgot=driver.findElement(By.partialLinkText("Forgot"));
		//WebElement forgot=driver.findElement(By.linkText(" Forgot Password?"));
		
//forgot.sendKeys("abdeslem90");
	/*WebElement sa=driver.findElement(By.name("email"));
	sa.sendKeys("abdeslamszahar@gmail.co");	

WebElement za=driver.findElement(By.name("pass"));
za.sendKeys("abs1990");
	WebElement sh=driver.findElement(By.id("u_0_b"));
sh.click();
WebElement cv=driver.findElement(By.linkText("Forgot Password?"));
		cv.click();*/
		//absolutexpath
		//WebElement bv=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
	//bv.click();
	//	WebElement bc=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		//bc.sendKeys("nike shorts");
		//WebElement nm=driver.findElement(By.id("search-submit-text"));
		//nm.click();
		WebElement kl=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		kl.click();
		Thread.sleep(6000);
		//WebElement gh=driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		//gh.click();
		WebElement gh=driver.findElement(By.xpath("(//*[contains (text(),' Up')])[ 5]"));
		gh.click();
WebElement zx=driver.findElement(By.xpath("//input[@name='firstname'][1]"));
zx.sendKeys("abdeslem");

WebElement xc=driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
xc.sendKeys("sehar");
WebElement vb=driver.findElement(By.xpath("(//*[contains(@id,'password_step_input')])[1]"));
vb.sendKeys("abd90");


	}

}
