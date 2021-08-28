package com.vtiger.comcast.genericutility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class listimpscreenclass implements ITestListener{
	
	public void ontestfailure(ITestResult result) {
		System.out.println("hai nandish");
		 String methodname = result.getMethod().getMethodName();
		System.out.println(methodname);
		 EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.edriver);
		 File srcfile = edriver.getScreenshotAs(OutputType.FILE);
			File desfile = new File("../ScreenShots"+methodname+".png");
		try{
			FileUtils.copyFile(srcfile, desfile);
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}

}
