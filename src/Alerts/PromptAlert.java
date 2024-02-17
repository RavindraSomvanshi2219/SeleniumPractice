package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class PromptAlert {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		
		Alert alertWindow = driver.switchTo().alert();
		alertWindow.sendKeys("Welcome Here");
		alertWindow.accept();
		
		
		
	}

}
