package rlogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://dev.logibricks.com/");
	}
	
	
	@Test
	void testLogin()
	{
		ReLogin lp = new ReLogin(driver);
		lp.setEmail("paresh+700@logibricks.in");
		lp.setPassword("Advik@007");
		lp.setSignin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Assert.assertEquals(driver.getTitle(),"Logibricks Technologies");
	}
	
	@AfterClass
	void testDown()
	{
		driver.quit();
	}

}
