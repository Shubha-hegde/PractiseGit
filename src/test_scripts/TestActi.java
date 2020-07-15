package test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Actitime.ScreenshotsMethods;
import Generic_Actitime.WebDriverMethods;
import pom.LoginActiTime;
import pom.LogoutActiTime;

public class TestActi {
	@Test
	public void testLogin() throws Exception {

		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// USING POM N TEST CLASS
		LoginActiTime pf = new LoginActiTime(driver);
		pf.set_Username("admin");
		pf.set_password("manager");
		pf.clickLogin();

		// generic webdriver method to get title
		WebDriverMethods wb = new WebDriverMethods();
		String title1 = wb.fetch_Title(driver);

		// verifcation by testNg
		Assert.assertTrue(title1.contains("actiTIME"));
		ScreenshotsMethods sm = new ScreenshotsMethods();
		sm.getPhoto(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// USIING POM N TESTnG CLASS
		LogoutActiTime lf = new LogoutActiTime(driver);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lf.clickLogout();
	}
}
