package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbase.ProjectSpecificMethod;

public class TC001_CreateLead extends ProjectSpecificMethod {

@BeforeTest
	public void fSetData() {
		excelFileName="TC001_CreateLead";
	}

@Test(dataProvider = "fetchdata")	
	public void runCreateLead(String sUsername,String sPassword,String sCompanyName,
						String sFirstName,String sLastName,String sSource,String sEmailID,String sPhoneNumber ) throws InterruptedException {
		//LoginPage obj=new LoginPage()
		new LoginPage()
		.enterUserName(sUsername)
		.enterPassword(sPassword)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLeadMenu()
		.enterCompanyName(sCompanyName)
		.enterFirstName(sFirstName)
		.enterLastName(sLastName)
		.selectSource(sSource)
		.enterEmailID(sEmailID)
		.enterPhoneNo(sPhoneNumber)
		.clickCreateLeadButton()
		.verifyFirstName(sFirstName);
		
		
		
	}

}
