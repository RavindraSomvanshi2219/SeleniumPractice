package ScreenShots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class ScreenShot {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.gsmarena.com/");
		
		WebElement Image2 = driver.findElement(By.xpath("//*[@id=\"body\"]/aside/div[3]/div/a[6]/img"));
		
		util.takeScreenShot(".\\ScreenShots");
		driver.close();


	}

}
