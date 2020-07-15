package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActiTime {
	// declaration
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username1;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;

	// initialization
	public LoginActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void set_Username(String un) {
		username1.sendKeys(un);

	}

	public void set_password(String pwd) {
		password.sendKeys(pwd);

	}

	public void clickLogin() {
		login.click();

	}

}
