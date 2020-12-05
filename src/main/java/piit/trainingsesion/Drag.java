package piit.trainingsesion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/salimsehar/Downloads/chromedriver-2");
				
	WebDriver driver=new ChromeDriver();
		
		driver.get("https//www.jqueryui.com/droppable/");
		
	driver.manage().window().maximize();
  Actions it=new Actions(driver);
  driver.switchTo().frame(0);
  //executeAsyncScript(),executeScript()
 //  WebElement sr
   //it.dragAndDrop(source, target);
  // JavascriptExecutor js=(JavascriptExecutor)driver;
  // js.executeAsyncScript("window.scrollBy(0, 1000)");
   driver.switchTo().frame(0);
   
   
 WebElement sr=driver.findElement(By.id("draggable"));
   WebElement dr=driver.findElement(By.id("droppable"));
  
   it.dragAndDrop(sr, dr).build().perform();
    
	}
	/*public void onTestFailure(ITestResult result) {
		 
		// TODO Auto-generated method stub
		 
		//ITestListener.super.onTestFailure(result);
		 
		this.driver = ((Usability)result.getInstance()).driver;
		 
		Date dt=new Date();
		 
		System.out.println(dt);
		 
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		 
		System.out.println(si);
		 
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		try {
		 
		FileHandler.copy(shots,new File("C:\\Users\\user\\Coding\\Trainingsession\\Pictures\\"+si+".png"));
		 
		} catch (IOException e) {
		 
		// TODO Auto-generated catch block
		 
		e.printStackTrace();
		 
		}
		 
		}*/

}
