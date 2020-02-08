package pages;

import seleniumbase.ProjectSpecificMethod;

public class LeadPage extends ProjectSpecificMethod {
	
	public void clickCRMSFA()	{
		driver.findElementByLinkText("CRM/SFA").click();
	}


}
