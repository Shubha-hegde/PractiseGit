package Generic_Actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupGeneric {
	public static void confirpopup(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmdismiss(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void HiddenDivision(WebElement hiddenpopup) {
		hiddenpopup.click();
	}

	public static void FileUploadPopUp(WebElement fileuploadpopup, String str) {
		fileuploadpopup.sendKeys(str);
	}

	public static void FileDownLoadPopUp(WebElement filedownloadpopup) throws AWTException {
		filedownloadpopup.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
