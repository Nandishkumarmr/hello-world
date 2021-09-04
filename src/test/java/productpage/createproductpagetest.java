package productpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericutility.BaseClass;
import com.vtiger.comcast.genericutility.ExcelUtility;
import com.vtiger.comcast.genericutility.FileUTiltiy;
import com.vtiger.comcast.genericutility.WebDriverUtility;
import com.vtiger.comcast.genericutility.javautility;
import com.vtiger.comcast.loginrepository.loginpage;
import com.vtiger.comcast.productrepository.createnewproductpage;
import com.vtiger.comcast.productrepository.homepage;
import com.vtiger.comcast.productrepository.productspage;

public class createproductpagetest extends BaseClass {
	@Test
	public void createpagetest() throws Throwable {
		
		homepage homepg=new homepage(driver);
		homepg.getProductpage().click();
		productspage products=new productspage(driver);
		products.getCreateproduct().click();
		createnewproductpage newproduct=new createnewproductpage(driver);
		ExcelUtility exut = new ExcelUtility();
		String productname = exut.getDataFromExcel("sheet1", 1,1);
		newproduct.getProductname().sendKeys(productname);
		String todaydate = jlib.getsystemdateYYYY_MM_DD();
		System.out.println(todaydate);
		newproduct.getStartdatepopup().sendKeys(todaydate);
		String Partno = exut.getDataFromExcel("sheet1", 2,1);
		newproduct.getPartno().sendKeys(Partno);  
		newproduct.getProductcategorydrop().click();
		wLib.select(newproduct.getProductcategorydrop(), 1);
		newproduct.getManufacturedrop().click();
		wLib.select(newproduct.getManufacturedrop(),"AltvetPet Inc.");
		String Enddatepopup = exut.getDataFromExcel("sheet1", 9,1);
		newproduct.getEnddatepopup().sendKeys(Enddatepopup);
		newproduct.getSupportdatepopup().sendKeys(todaydate);
		String Supportexpirydatepopup = exut.getDataFromExcel("sheet1", 10,1);
		newproduct.getSupportexpirydatepopup().sendKeys(Supportexpirydatepopup);
		String Vendorpartno = exut.getDataFromExcel("sheet1", 4,1);
		newproduct.getVendorpartno().sendKeys(Vendorpartno);
		String Website = exut.getDataFromExcel("sheet1", 5,1);
		newproduct.getWebsite().sendKeys(Website);
		String Productsheet = exut.getDataFromExcel("sheet1", 6,1);
		newproduct.getProductsheet().sendKeys(Productsheet);
		String Mfr_part_no = exut.getDataFromExcel("sheet1", 7,1);
		newproduct.getMfr_part_no().sendKeys(Mfr_part_no);
		String Serial_no = exut.getDataFromExcel("sheet1", 8,1);
		newproduct.getSerial_no().sendKeys(Serial_no);
		newproduct.getGlacct().click();
		wLib.select(newproduct.getGlacct(), 2);
		newproduct.getSave();
		
}
}

