package CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class SelectCheckBox {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		
		driver.findElement(By.xpath("//input[@id=\"profession-0\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();
	}

}
