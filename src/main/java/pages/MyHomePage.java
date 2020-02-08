package pages;


import seleniumbase.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyLeadPage clickLeadsTab()	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new MyLeadPage();
	}


}
