package Generic_Actitime;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsMethods {
	public void getPhoto(WebDriver driver) throws Exception {
		String photo = "./ScreenShots/";
		Date d = new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":", "-");
		TakesScreenshot as = (TakesScreenshot) driver;
		File src = as.getScreenshotAs(OutputType.FILE);
		File dest = new File(photo + date + ".png");
		FileUtils.copyFile(src, dest);

	}

}
