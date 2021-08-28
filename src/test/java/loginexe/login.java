package loginexe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.loginrepository.loginpage;

public class login {
@Test
	public static void logintest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		loginpage log=new loginpage(driver);
		/*login.getUsername().sendKeys("admin");
		login.getUserpwd().sendKeys("admin");
		login.getLoginbtn().click();*/
		log.logginginapp("admin", "admin");

}
}
