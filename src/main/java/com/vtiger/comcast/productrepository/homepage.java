package com.vtiger.comcast.productrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
public homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
@FindBy(xpath="//a[text()='Products']")
private WebElement productpage;

public WebElement getProductpage() {
	return productpage;
}
@FindBy(xpath="(//td[@style='padding-bottom: 1em;'])[1]")
private WebElement logoutlink;	

public WebElement getLogoutlink() {
return logoutlink;
}
@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signout;
public void signout() {
Actions actons = new Actions(driver);
actons.moveToElement(logoutlink).perform();
signout.click();
}

}
