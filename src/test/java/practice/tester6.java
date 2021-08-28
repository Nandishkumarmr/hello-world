package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tester6 {
	
	@BeforeClass
	public void testa()
	{
		System.out.println("java session before ============");
		
	}
	@BeforeMethod
	public void test0()
	{
		System.out.println("java session before");
		
	}
	@Test
public void test()
{
	System.out.println("java session");
	
}
	@Test(priority=0)
public void test1()
{
	System.out.println("java session end");
	
}
	@AfterMethod

	public void test2()
	{
		System.out.println("java session end");
		
	}
	@AfterClass
	public void testz()
	{
		System.out.println("java session after======");
		
	}

}
