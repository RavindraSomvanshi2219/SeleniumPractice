package iFrame_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class Handle_iFrame {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//ul[@class=\"nav nav-tabs \"]/li[1]/a")).click();
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hello Mini");
		
		
		
		
	}

}
