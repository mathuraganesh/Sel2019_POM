package pages;

import seleniumbase.ProjectSpecificMethod;

public class FindLeadPage extends ProjectSpecificMethod {
	
	public FindLeadPage enterfirstname(String fName) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		return this;
	}
	
	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		return this;
	}
	
	public ViewLeadPage clickLeadID() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadPage();
	}
	
	public FindLeadPage clickEmailTab(){
		driver.findElementByXPath("//span[text()='Email']").click();
		return this;
	}
	
	public FindLeadPage enterEmailID(String sEmailId) {
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(sEmailId);
		return this;
	}
	
	public String GetFirstName() {
		String sFirstname = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		return sFirstname;
	}
	
	}
