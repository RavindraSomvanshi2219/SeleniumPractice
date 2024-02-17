package BasicsOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class FindElement_VS_Findelements {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://demo.nopcommerce.com/");
		
// FindElement() 
		// Single WebElement
		WebElement SearchBox = driver.findElement(By.id("small-searchterms"));
		SearchBox.sendKeys("xyz");
		
		// List Of WebElements --> We return First WebElement Within the Multiple WebElements
		WebElement FooterLink = driver.findElement(By.xpath("//div[@class=\"footer\"]//a"));
		System.out.println(FooterLink.getText());
		System.out.println("***********************************************************");
		
		
// FindElements()	
		// List Of WebElements
		List<WebElement> SearchBox1 = driver.findElements(By.id("small-searchterms"));
		System.out.println(SearchBox1.size());
		
		List<WebElement> FooterLinks = driver.findElements(By.xpath("//div[@class=\"footer\"]//a"));
		System.out.println(FooterLinks.size());
		for(WebElement Ele: FooterLinks) {
			System.out.println(Ele.getText());
		}
		

	}

}
