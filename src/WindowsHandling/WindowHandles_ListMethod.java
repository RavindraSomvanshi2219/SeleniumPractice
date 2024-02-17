package WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class WindowHandles_ListMethod {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//div[@class=\"orangehrm-copyright-wrapper\"]/p[2]/a")).click();
		Set<String> Windows = driver.getWindowHandles();
		
		List<String> WinId = new ArrayList(Windows);
		
		String ParentWindowId = WinId.get(0);
		String ChildWindowId = WinId.get(1);
		
		System.out.println("Parent WindowID : "+ParentWindowId);
		System.out.println("Chiild WindowID : "+ChildWindowId);

	}

}