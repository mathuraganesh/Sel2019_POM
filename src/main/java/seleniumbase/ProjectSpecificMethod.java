package seleniumbase;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;



public class ProjectSpecificMethod {
		public static ChromeDriver driver;
		public String excelFileName;
	//@Parameters({"url","UName","Pwd"})
	@BeforeMethod
	  public void fLogin() {
		//System.out.println("@Parameters");
		System.out.println("@BeforeMethod");
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
						
	  }
	  
	@AfterMethod
	  public void fBrowserClose() {
		System.out.println("@AfterMethod");
		  driver.close();
	  }


	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("@BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("@AfterClass");
	  }

	  

	  @AfterTest
	  public void afterTest() {
		  System.out.println("@AfterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("@BeforeSuite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("@AfterSuite");
	  }

@DataProvider(name="fetchdata")
	  public String[][] SendData() throws IOException {
	  	  System.out.println("@DataProvider");
	  	  /*String[][] data=new String[2][6];
	  	  
	  	  data[0][0]="IBM";
	  	  data[0][1]="Matura";
	  	  data[0][2]="Ganesh";
	  	  data[0][3]="LEAD_EMPLOYEE";
	  	  data[0][4]="mathura@gmail.com";
	  	  data[0][5]="9962066735";
	  	  
	  	  data[1][0]="CGI";
	  	  data[1][1]="Divya";
	  	  data[1][2]="Lakshmi";
	  	  data[1][3]="LEAD_EMPLOYEE";
	  	  data[1][4]="divya@gmail.com";
	  	  data[1][5]="9566188394";  */
	  	
	  	ReadExcel excel=new ReadExcel();
	  	String[][] data=excel.readExcel(excelFileName);
	  	  
	  	  	  
	  	  return data;
	  	  
	  	  } 




}
