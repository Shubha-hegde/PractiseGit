package Generic_Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_Generic {
	public static void MouseHover(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

	}

	public static void DragElement(WebDriver driver, WebElement ele, WebElement ele1) {
		Actions act = new Actions(driver);
		act.dragAndDrop(ele, ele1).perform();

	}

	public static void DoubleClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();

	}

	public static void RightClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();

	}
}
