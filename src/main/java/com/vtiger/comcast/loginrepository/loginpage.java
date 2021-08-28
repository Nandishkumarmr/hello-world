package com.vtiger.comcast.loginrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement username;
	@FindBy(name="user_password")
	private WebElement userpwd;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getUserpwd() {
		return userpwd;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void logginginapp(String username,String userpwd  ) {
		getUsername().sendKeys(username);
		getUserpwd().sendKeys(userpwd);
		loginbtn.click();
		
	}

}
