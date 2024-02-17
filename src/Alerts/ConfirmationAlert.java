package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class ConfirmationAlert {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		
// Confirmation Alert for Confirm Button
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		driver.switchTo().alert().accept();
		
// Confirmation Alert for Cancel Button	
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		driver.switchTo().alert().dismiss();

	}

}
