package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreatePage {

	WebDriver driver;
	@FindBy(linkText="Create a Page")
	WebElement CreateAPage;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement signUp;
	
	public CreatePage(WebDriver driver) {
	}{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	public void createPageClick() {
		CreateAPage.click();
	}
	public void titleVerification() {
		String actualTitle=driver.getTitle();
		Assert.assertEquals("Facebook", actualTitle);
	}
	public void signUpbutton() {
		signUp.click();
	}
} 
