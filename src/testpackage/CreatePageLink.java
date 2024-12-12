package testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclspckg.BaseClsPgm;
import pagepckg.CreatePage;

public class CreatePageLink extends BaseClsPgm {

	@Test
	public void testLogin() {
		CreatePage cp=new CreatePage(driver);
		cp.createPageClick();
		cp.titleVerification();
		cp.signUpbutton();
	}
}
