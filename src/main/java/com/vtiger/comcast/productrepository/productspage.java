  package com.vtiger.comcast.productrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productspage {
	
	public productspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement Createproduct;
	public WebElement getCreateproduct() {
		return Createproduct;
	}

}
