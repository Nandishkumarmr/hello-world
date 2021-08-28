package com.vtiger.comcast.productrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createnewproductpage {
	public createnewproductpage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="productname")
	private WebElement productname;
	
	@FindBy(name="sales_start_date")
	private WebElement salesstartdatepopup;
	
	@FindBy(id="productcode")
	private WebElement partno;
	
    
	
	@FindBy(name="manufacturer")
	private WebElement manufacturedrop;
	
	@FindBy(name="productcategory")
	private WebElement productcategorydrop;
	
	@FindBy(id="jscal_field_sales_end_date")
	private WebElement salesenddatepopup;
	
	@FindBy(id="jscal_field_start_date")
	private WebElement supportdatepopup;
	
	@FindBy(id="jscal_field_expiry_date")
	private WebElement supportexpirydatepopup;
	
	@FindBy(id="vendor_part_no")
	private WebElement vendorpartno;
	
	@FindBy(name="website")
	private WebElement website;
	
	@FindBy(name="productsheet")
	private WebElement productsheet;
	
	@FindBy(id="mfr_part_no")
	private WebElement mfr_part_no;
	
	@FindBy(id="serial_no")
	private WebElement serial_no;
	 
	@FindBy(name="glacct")
	private WebElement glacct;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement save;
	public WebElement getProductname() {
		return productname;
	}
	public WebElement getStartdatepopup() {
		return salesstartdatepopup;
	}
	public WebElement getPartno() {
		return partno;
	}
	public WebElement getManufacturedrop() {
		return manufacturedrop;
	}
	public WebElement getProductcategorydrop() {
		return productcategorydrop;
	}
	public WebElement getEnddatepopup() {
		return salesenddatepopup;
	}
	public WebElement getSupportdatepopup() {
		return supportdatepopup;
	}
	public WebElement getSupportexpirydatepopup() {
		return supportexpirydatepopup;
	}
	public WebElement getVendorpartno() {
		return vendorpartno;
	}
	public WebElement getUnit_price() {
		return unit_price;
	}
	public WebElement getCommissionrate() {
		return commissionrate;
	}
	public WebElement getWebsite() {
		return website;
	}
	public WebElement getProductsheet() {
		return productsheet;
	}
	public WebElement getMfr_part_no() {
		return mfr_part_no;
	}
	public WebElement getSerial_no() {
		return serial_no;
	}
	public WebElement getGlacct() {
		return glacct;
	}
	public WebElement getSave() {
		return save;
	}
	@FindBy(id="unit_price")
	private WebElement unit_price;
	
	@FindBy(id="commissionrate")
	private WebElement commissionrate;
	
	@FindBy(name="usageunit")
	private WebElement usageunitdropdown;
	
	@FindBy(id="qty_per_unit")
	private WebElement qty_per_unit;
	
	@FindBy(name="assigned_group_id")
	private WebElement handler;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement groupradio;
	
	
	public WebElement getGroupradio() {
		return groupradio;
	}
	public WebElement getHandler() {
		return handler;
	}
	@FindBy(id="qtyinstock")
	private WebElement qtyinstock;
	
	@FindBy(id="reorderlevel")
	private WebElement reorderlevel;
	
	@FindBy(id="qtyindemand")
	private WebElement qtyindemand;
	
	public WebElement getUsageunitdropdown() {
		return usageunitdropdown;
	}
	public WebElement getQty_per_unit() {
		return qty_per_unit;
	}
	public WebElement getQtyinstock() {
		return qtyinstock;
	}
	public WebElement getReorderlevel() {
		return reorderlevel;
	}
	public WebElement getQtyindemand() {
		return qtyindemand;
	}
}
