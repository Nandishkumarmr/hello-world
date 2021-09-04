package com.vtiger.comcast.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.comcast.loginrepository.loginpage;
import com.vtiger.comcast.productrepository.homepage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver edriver;

	public javautility jlib=new javautility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public FileUTiltiy fLib=new FileUTiltiy();
	public ExcelUtility eLib=new ExcelUtility();
	
	@BeforeSuite
	public void configBS() {
		System.out.println("========================connect to DB========================");
	}
		
@BeforeClass
	public void configBC() {
		System.out.println("=============Launch the Browser=======");
	driver=new ChromeDriver();
	edriver = driver;
	wLib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
		
	}
	
@BeforeMethod
	public void configBM() throws Throwable {
		/*common Data*/
	
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String URL = fLib.getPropertyKeyValue("url");
		String BROWSER = fLib.getPropertyKeyValue("browser");
		/* Navigate to app*/
		driver.get(URL);
	/* step 1 : login */
	        loginpage lgnPage = new loginpage(driver);
	        lgnPage.logginginapp(USERNAME, PASSWORD);
	}
	
	
	@AfterMethod
	public void configAM() {
	/*step 6 : logout*/
		homepage hmePge = new homepage(driver);
		hmePge.getLogoutlink();
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("=============Close the Browser=======");
		driver.quit();
	}
	
@AfterSuite
	public void configAS() {
		System.out.println("========================close DB========================");
	}
}



