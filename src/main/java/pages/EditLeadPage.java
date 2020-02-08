package pages;

import seleniumbase.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod {
	
	public EditLeadPage enterCompanyname(String cName) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() throws InterruptedException {
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		return new ViewLeadPage();
	}
	
	}
