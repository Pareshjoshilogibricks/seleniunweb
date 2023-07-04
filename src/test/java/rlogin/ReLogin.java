package rlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReLogin {
	
	WebDriver driver;
	
	ReLogin(WebDriver driver)
	{
	
	this.driver=driver;
	
	}
	
	By txt_email_loc=By.name("Email");
	
	By txt_password_loc=By.name("Password");
	
	By btn_signin_loc=By.id("next");
	
	public void setEmail(String email) {
		
		driver.findElement(txt_email_loc).sendKeys(email);
		
		
	}
	
	public void setPassword(String password) {
		
		driver.findElement(txt_password_loc).sendKeys(password);
		
		
	}


	public void setSignin() {
	
	driver.findElement(btn_signin_loc).click();
	
	
}
	
	

}
