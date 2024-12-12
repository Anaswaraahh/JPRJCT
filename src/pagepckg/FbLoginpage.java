package pagepckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginpage {

	WebDriver driver;
	
	//By fbemail=By.id("email");
	//By fbpassword=By.id("pass");
	//By fbloginbutton=By.name("login");
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement passwrd;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	public FbLoginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String email,String password) {
		//driver.findElement(fbemail).sendKeys(email);
		//driver.findElement(fbpassword).sendKeys(password);
		fbemail.sendKeys(email);
		passwrd.sendKeys(password);
		
}	
	public void login() {
		//driver.findElement(fbloginbutton).click();
		fbloginbutton.click();
	}
	
		
	}
