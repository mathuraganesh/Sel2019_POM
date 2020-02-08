package pages;

import seleniumbase.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod {
	
	public CreateLeadPage clickCreateLeadMenu()	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLeadMenu() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		return new FindLeadPage();
	}
	

}
