package pages;



import seleniumbase.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public MyHomePage clickCRMSFA()	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}


}

