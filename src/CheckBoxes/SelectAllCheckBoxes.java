package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class SelectAllCheckBoxes {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		
		List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement CheckBoxes:CheckBox)
		{
			CheckBoxes.click();
		}

	}

}
