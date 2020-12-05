package pages.facebook;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linkedln {
	public WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	
	WebElement sigggg;
	
	@FindBy(id ="session_key")
	WebElement fillup;
	@FindBy(id ="session_password")
	WebElement pswfill;
	@FindBy(xpath = "( //*[contains(text(),' Sign in')])[1]")
	WebElement sign;
	@FindBy(linkText = "Forgot password?")
	WebElement motdepass;
 public Linkedln(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
 public void salim(String name) {
	 fillup.clear();
	 fillup.sendKeys(name);
 }
 public void abdeslam(String field) {
	 pswfill.clear();
	pswfill.sendKeys("1990"); 
 }
 public void younes() {
	 sign.click();
 }
 public void abderahmen() {
	 motdepass.click();
 }
}
