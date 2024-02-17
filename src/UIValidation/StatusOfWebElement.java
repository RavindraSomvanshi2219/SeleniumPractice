package UIValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class StatusOfWebElement {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement UserName = driver.findElement(By.id("username"));
		// UserName is Displyed ..?
		System.out.println(UserName.isDisplayed());
		
		// UserName is Enabled ..?
		System.out.println(UserName.isEnabled());
		
		// UserName is Selected ..?
		System.out.println(UserName.isSelected());
		
	}

}
