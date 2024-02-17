package WindowsHandling;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class WindowHandles_IteratorMethod {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//div[@class=\"orangehrm-copyright-wrapper\"]/p[2]/a")).click();
		Set<String> Windows = driver.getWindowHandles();
		
		// Using Iterator Method 
		
		Iterator<String> itr = Windows.iterator();
		
		String ParentWindowId = itr.next();
		String ChildWindowID = itr.next();
		
		System.out.println("Parent WindowID : "+ParentWindowId);
		System.out.println("Chiild WindowID : "+ChildWindowID);
		
	}

}
