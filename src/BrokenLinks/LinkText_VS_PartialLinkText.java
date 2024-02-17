package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class LinkText_VS_PartialLinkText {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "http://www.amazon.in/");
		
// When We use LinkText() Then We Have To Pass InnerText() in Parameter ........
		
		driver.findElement(By.linkText("Mobiles")).click(); 
		
// When We use PartialLinkText() Then We Have To Pass Any InnerText() Content in Parameter ........		
// Ex: If  Mobile Seller is InnerText Then we Have to pass only seller in Parameter .....
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Releases")).click();

		System.out.println("******** END ********");
	}

}
