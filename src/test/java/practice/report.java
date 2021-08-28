package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class report {
	
	public ChromeDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeSuite
	public void configbs() {
		reporter=new ExtentHtmlReporter("../testyantra/testyantra/Anythim.html");
		System.out.println("=======connect to db============");
		System.out.println("beforesuit");
		reporter.config().setDocumentTitle("practicerep");
		reporter.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.attachReporter(reporter)  ;
		System.out.println("=======connect to db============");
		
	}
	
	@BeforeClass
	public void configbf() {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
		@BeforeMethod
		public void configbm() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/") ;
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		}
		@Test
		public void homepage() {
			test=reports.createTest("home");
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
//		hard assertion
		Assert.assertEquals(hometitle, "home");
//	soft assertion
//		if you are using soft assertion you must call assertall non staic method so you can see the error otherwise it will run as pass
		SoftAssert Softassert = new SoftAssert();
		Softassert.assertEquals(hometitle, "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");
		Softassert.assertAll();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		String orgtitle = driver.getTitle();
		System.out.println(orgtitle);
		}
		@AfterMethod
		public void configbam() {
		Actions acction = new Actions(driver);
		WebElement signimg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		acction.moveToElement(signimg).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		}
		@AfterClass
		public void configbac() {
		driver.quit();
	}
		@AfterSuite
		public void configas() {
			System.out.println("=======close to-  db============");
			reports.flush();
		}
		}


