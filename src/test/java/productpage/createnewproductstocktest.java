package productpage;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericutility.BaseClass;
import com.vtiger.comcast.genericutility.ExcelUtility;
import com.vtiger.comcast.genericutility.FileUTiltiy;
import com.vtiger.comcast.genericutility.WebDriverUtility;
import com.vtiger.comcast.loginrepository.loginpage;

import com.vtiger.comcast.productrepository.createnewproductpage;
import com.vtiger.comcast.productrepository.homepage;
import com.vtiger.comcast.productrepository.productspage;

//@Listeners(com.vtiger.comcast.genericutility.listimpscreenclass.class)
public class createnewproductstocktest extends BaseClass {
@Test
public  void createnewproducttest() throws Throwable{	
		
		homepage homepg=new homepage(driver);
		homepg.getProductpage().click();

		productspage products=new productspage(driver);
		products.getCreateproduct().click();
		createnewproductpage newproduct=new createnewproductpage(driver);
		
		newproduct.getUsageunitdropdown().click();
		
		//Assert.assertEquals(true, true);
		
		wLib.select(newproduct.getUsageunitdropdown(), 2);
		
		String Qtyinstock = eLib.getDataFromExcel("sheet1", 21,1);
		newproduct.getQtyinstock().sendKeys(Qtyinstock);
		String Qty_per_unit = eLib.getDataFromExcel("sheet1", 22,1);
		newproduct.getQty_per_unit().sendKeys(Qty_per_unit);
		String Reorderlevel = eLib.getDataFromExcel("sheet1", 23,1);
		newproduct.getReorderlevel().sendKeys(Reorderlevel);
		newproduct.getGroupradio().click();
		newproduct.getHandler().click();
		wLib.select(newproduct.getHandler(), 1);
		String Qtyindemand = eLib.getDataFromExcel("sheet1", 24,1);
		newproduct.getQtyindemand().sendKeys(Qtyindemand);
		
		newproduct.getSave().click();
		
}
}

