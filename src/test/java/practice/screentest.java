package practice;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericutility.BaseClass;

public class screentest extends  BaseClass{
	
	@Test
	public void check(Method mtd) throws Throwable  {
		System.out.println("start");
		System.out.println(mtd.getName());
		String methodname = mtd.getName();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.edriver);
	File srcfile = edriver.getScreenshotAs(OutputType.FILE);
		File desfile = new File("./screenshot"+methodname+".png");
	FileUtils.copyFile(srcfile,desfile);
	System.out.println("fail");
		}
	

}
