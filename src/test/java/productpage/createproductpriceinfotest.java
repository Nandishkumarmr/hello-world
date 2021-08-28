package productpage;

import org.testng.annotations.Test;

import com.vtiger.comcast.genericutility.BaseClass;
import com.vtiger.comcast.genericutility.ExcelUtility;
import com.vtiger.comcast.productrepository.createnewproductpage;
import com.vtiger.comcast.productrepository.homepage;
import com.vtiger.comcast.productrepository.productspage;

public class createproductpriceinfotest extends BaseClass {
	@Test
	public  void createpriceinfotest() throws Throwable {
	
	homepage homepg=new homepage(driver);
	homepg.getProductpage().click();
	productspage products=new productspage(driver);
	products.getCreateproduct().click();
	createnewproductpage newproduct=new createnewproductpage(driver);
	ExcelUtility elib = new ExcelUtility();
	String Productname = elib.getDataFromExcel("sheet1", 16,1 );
	newproduct.getProductname().sendKeys(Productname);
	String Unit_price = elib.getDataFromExcel("sheet1", 17,1 );
	newproduct.getUnit_price().sendKeys(Unit_price);
	String Commissionrate = elib.getDataFromExcel("sheet1", 18,1 );
	newproduct.getCommissionrate().sendKeys(Commissionrate);	
	newproduct.getSave();
	homepg.signout();
	
}
}
