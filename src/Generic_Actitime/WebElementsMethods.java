package Generic_Actitime;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WebElementsMethods {

	String text;

	public String fetch_Text(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
		return text;
	}

	public void clear_Method(WebElement ele) {
		ele.clear();
	}

	public void click_Method(WebElement ele) {
		ele.click();
	}

	public void submit_Method(WebElement ele) {
		ele.submit();
	}

	public void fetch_ToolTip(WebElement ele, String str) {
		String attribute = ele.getCssValue(str);
		System.out.println(attribute);
	}

	public void fetch_CssValue(WebElement ele, String css) {
		String cssvalue = ele.getCssValue(css);
	}

	public void fetch_Location(WebElement ele) {
		Point location = ele.getLocation();
		System.out.println(location);
	}

	public void fetch_TagName(WebElement ele) {
		String tagname = ele.getTagName();
		System.out.println(tagname);
	}

	public void check_is_Enabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
	}

	public void check_is_Displayed(WebElement ele) {
		boolean displayed = ele.isEnabled();
		System.out.println(displayed);
	}

	public void check_is_selected(WebElement ele) {
		boolean selected = ele.isEnabled();
		System.out.println(selected);
	}

	public void sendData(WebElement ele, String keys) {
		ele.sendKeys(keys);
	}

	public void fetch_Size(WebElement ele) {
		Dimension size = ele.getSize();
		System.out.println(size);
	}
}
