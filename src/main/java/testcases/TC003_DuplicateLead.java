package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import seleniumbase.ProjectSpecificMethod;

public class TC003_DuplicateLead extends ProjectSpecificMethod {

@BeforeTest
	public void fSetData() {
	excelFileName="TC003_DuplicateLead";
	
	}

@Test(dataProvider = "fetchdata")	
	public void runCreateLead(String sUsername,String sPassword,String sEmailID) throws InterruptedException {
		//LoginPage obj=new LoginPage()
		String firstName = new LoginPage()
		.enterUserName(sUsername)
		.enterPassword(sPassword)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLeadMenu()
		.clickEmailTab()
		.enterEmailID(sEmailID)
		.clickFindLeadButton()
		.GetFirstName();
		
		new FindLeadPage()
		.clickLeadID()
		.clickDuplicateLeadButton()
		.clickCreateLeadButton()
		.verifyDuplicateName(firstName);
		
		
		
		
	}

}
