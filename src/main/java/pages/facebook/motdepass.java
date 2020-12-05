package pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class motdepass {
	public WebDriver driver;
@FindBy(id ="username")
WebElement remple;
@FindBy(id ="reset-password-submit-button")
WebElement a3yigh;
@FindBy(xpath = "(//*[text()='Please enter your email or phone'])[1]")
WebElement text;
public motdepass(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void idir() {
	remple.sendKeys("1988");
}

public void karim() {
	a3yigh.click();
}
public WebElement hassina() {
	return text;
}
}
