package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class SelectedPortionScreenShot {

	public static void main(String[] args) throws IOException {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.gsmarena.com/");
		
		WebElement PhoneFinder = driver.findElement(By.xpath("//div[@id=\"body\"]/aside/div"));
		
		File src = PhoneFinder.getScreenshotAs(OutputType.FILE);
		File ScreenShots = new File(".\\ScreenShots\\PhoneFinder.png");
		FileUtils.copyFile(src, ScreenShots);
		
		driver.close();

	}

}
