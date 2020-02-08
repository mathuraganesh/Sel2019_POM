package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.EditLeadPage;
import pages.FindLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadPage;
import pages.ViewLeadPage;
import seleniumbase.ProjectSpecificMethod;

public class TC002_EditLead extends ProjectSpecificMethod {
	
@BeforeTest
	public void setData() {
	excelFileName="TC002_EditLead";
}
	
@Test(dataProvider ="fetchdata")
	public void runEditLead(String uName,String pwd,String fName,String cName ) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
		
		new HomePage()
		.clickCRMSFA();
		
		new MyHomePage()
		.clickLeadsTab();
		
		new MyLeadPage()
		.clickFindLeadMenu();
		
		new FindLeadPage()
		.enterfirstname(fName)
		.clickFindLeadButton()
		.clickLeadID();
		
		new ViewLeadPage()
		.clickEditButton();
		
		new EditLeadPage()
		.enterCompanyname(cName)
		.clickUpdateButton();
		
		new ViewLeadPage()
		.verifyCompanyname(cName);
		
}

}
