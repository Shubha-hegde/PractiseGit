package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutActiTime {
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logout;

	public LogoutActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLogout() {
		logout.click();

	}

}
