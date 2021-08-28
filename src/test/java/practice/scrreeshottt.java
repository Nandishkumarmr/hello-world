package practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericutility.BaseClass;

@Listeners(com.vtiger.comcast.genericutility.listimpscreenclass.class)
public class scrreeshottt extends BaseClass{
	@Test
public void test()
{
	System.out.println("main");
	Assert.assertEquals(true, false);
	System.out.println("end");
}
}
