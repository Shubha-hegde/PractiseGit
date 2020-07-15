package Generic_Actitime;

import org.openqa.selenium.WebDriver;

public class WebDriverMethods {
	// String url;

	public void fetch_Url(WebDriver driver, String url1) {
		driver.get(url1);
	}

	public void close_Brower(WebDriver driver) {
		driver.close();
	}

	public void quit_Browser(WebDriver driver) {
		driver.quit();

	}

	public String fetch_Title(WebDriver driver) {

		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public void fetch_Current_Url(WebDriver driver) {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// return url;
	}

	public void fetch_Page_Source(WebDriver driver, String page) {
		driver.getPageSource();

	}
}
