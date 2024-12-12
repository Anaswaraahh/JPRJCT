package testpackage;

import org.testng.annotations.Test;

import baseclspckg.BaseClsPgm;
import pagepckg.FbLoginpage;

import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FbLoginTest extends BaseClsPgm{

	
	@Test
	public void testLogin() {
		FbLoginpage ob=new FbLoginpage(driver);
		ob.setValues("abchdgmail.com", "asdfjnbv");
		ob.buttonClick();
	}
}
