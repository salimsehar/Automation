package pages.facebook;

import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import piit.trainingsesion.slocators;

public class home{ 
public WebDriver driver;
	
	
	/*@FindBy(name = "email")
	WebElement emailfieldkeys;
	@FindBy(name = "name")
	WebElement psswrdfieldkeys;
	@FindBy(linkText = "Log In")
	WebElement sign;
	home(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/
	@FindBy(xpath="//input[@id='email']")
	WebElement emailfieldkeys;
@FindBy(name = "pass")
	WebElement psswrdfieldkeys;
@FindBy(tagName = "button")
WebElement sigh;
@FindBy(linkText = "Forgot Password?")
	WebElement forgot;

public home(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver,this);
 
 
 
}
public void emailofinput(String name) {
	//emailfieldkeys.clear();
	WebDriverWait it=new WebDriverWait(driver, 10);
			it.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
	emailfieldkeys.sendKeys(name);
//emailfieldkeys.sendKeys("abdeslam0102gamil.com");	
	
	
}
public void psswrdoffield(String field) {
	WebDriverWait it=new WebDriverWait(driver, 10);
	it.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));
psswrdfieldkeys.sendKeys(field);
//psswrdfieldkeys.sendKeys("1990");
	
}
public void logg() {
sigh.click();
}
public void forgotlink() {
	forgot.click();
}
}
