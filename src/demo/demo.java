package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class demo {
	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.icc-cricket.com/homepage");
		
		
		String PlayerName = driver.findElement(By.xpath("//span[@class='rankings-card__player-surname'][normalize-space()='Gill']")).getText();
		System.out.println("Surname: "+PlayerName);
	}
}
