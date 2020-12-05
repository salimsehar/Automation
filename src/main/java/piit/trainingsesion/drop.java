package piit.trainingsesion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class drop {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();

WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
createAccount.click();
Thread.sleep(6000);


WebElement bn=driver.findElement(By.id("month"));
Select ob=new Select(bn);
Thread.sleep(6000);
ob.selectByValue("6");

  WebElement dh=driver.findElement(By.id("day"));
Select jk=new Select(dh);
jk.selectByValue("2");
WebElement hs=driver.findElement(By.id("year"));
Select om=new Select(hs);
om.selectByValue("2019");

/*WebElement birth=driver.findElement(By.name("birthday_month"));
Select ob=new Select(birth);
ob.selectByValue("6");
	WebElement dah=driver.findElement(By.xpath("(//*[contains(@name,'birthday_day')])[1]"));
Select on=new Select(dah);
on.selectByValue("30");
WebElement hassina=driver.findElement(By.xpath("(//select[@id='year'])[1]"));
Select kr=new Select(hassina);
kr.selectByValue("2019");
WebElement rc=driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
//Select gh=new Select(rc);
//gh.selectByVisibleText("female");
rc.click();
Thread.sleep(600);
   WebElement sf=driver.findElement(By.linkText("Sign Up"));
   sf.click();*/
WebElement re=driver.findElement(By.id("u_1_3"));
re.click();
//WebElement xc=driver.findElement(By.linkText("Sign Up"));
//xc.click();
	}

}
