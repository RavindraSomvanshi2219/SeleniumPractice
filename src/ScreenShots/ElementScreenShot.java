package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class ElementScreenShot {

	public static void main(String[] args) throws IOException {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.gsmarena.com/");
		
		WebElement Image = driver.findElement(By.xpath("//*[@id=\"body\"]/aside/div[3]/div/a[6]/img"));
		
		File src = Image.getScreenshotAs(OutputType.FILE);
		File ScreenShots = new File(".\\ScreenShots\\Image.png");
		FileUtils.copyFile(src, ScreenShots);
		
		driver.close();

	}

}
