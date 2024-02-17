package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class FullpageScreenShot {

	public static void main(String[] args) throws IOException {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.snapdeal.in/");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File Screenshots = new File(".\\ScreenShots\\SnapDealHomePage.png");
		FileUtils.copyFile(src, Screenshots);
	}

}
