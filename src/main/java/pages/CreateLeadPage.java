package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumbase.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	public CreateLeadPage enterCompanyName(String cName)	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName)	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName)	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage selectSource(String sSource)	{
		WebElement eleSource=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(eleSource);
		source.selectByValue(sSource);
		return this;
	}
	
	public CreateLeadPage enterEmailID(String sEmailID)	{
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(sEmailID);
		return this;
	}
	
	public CreateLeadPage enterPhoneNo(String sPhoneNO)	{
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(sPhoneNO);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() throws InterruptedException	{
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(3000);
		return new ViewLeadPage();
	}
	
	


}
