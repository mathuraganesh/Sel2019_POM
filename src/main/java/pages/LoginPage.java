package pages;

import org.openqa.selenium.By;

import seleniumbase.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElementByName("PASSWORD").sendKeys(pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		
		/*HomePage obj=new HomePage();
		return obj;*/
		
		return new HomePage();
		
		
	}


}
