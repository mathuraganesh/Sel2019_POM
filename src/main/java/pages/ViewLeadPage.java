package pages;

import seleniumbase.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	
	public ViewLeadPage verifyFirstName(String fName)	{
		//String title = driver.getTitle();
		String sGetFirstName = driver.findElementById("viewLead_firstName_sp").getText();
		if(sGetFirstName.equals(fName))
			System.out.println("First Name-"+fName+" Contains in View Lead Page");
		else
			System.out.println("First Name-"+fName+" Does Not Contains in View Lead Page");
		return this;
	}
	
	public EditLeadPage clickEditButton() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(3000);
		return new EditLeadPage();
	}
	
	public void verifyCompanyname(String cName) {
		String sCompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		
		if(sCompanyname.contains(cName))
			System.out.println("EditLead-Company Name:"+cName+" Changed Sucessfully");
		else
			System.out.println("EditLead-Company Name Does not Changed");
	}
	
	public CreateLeadPage clickDuplicateLeadButton() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(3000);
		return new CreateLeadPage();
	}
	
	public ViewLeadPage verifyDuplicateName(String fName)	{
		//String title = driver.getTitle();
		String sDuplicatename = driver.findElementById("viewLead_firstName_sp").getText();
		if(sDuplicatename.equals(fName))
			System.out.println("DuplicateLead-Confirmed the 'Duplicated Lead Name' is same as Captured Name:"+sDuplicatename);
		else
			System.out.println("DuplicateLead-Verification Failed 'Duplicated Lead Name' is not same as Captured Name:"+sDuplicatename);
		
		return this;
	}
}
