package WindowsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class WindowHandle {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String WindowId = driver.getWindowHandle();
		System.out.println("WindowId : "+WindowId);
		
	}

}
