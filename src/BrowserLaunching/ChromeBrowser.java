package BrowserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
	
// How To Launch a Browser in Traditional way ------>
// 1) Chrome browser -->
		
	 System.setProperty("Webdriver.Chrome.driver", "D:\\Software Testing\\Automation Workspace\\SeleniumPractice\\executables\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
// Launch a browser with Generic Way --->>
// Chrome Browser --->
	 
	 WebDriver driver1 = new ChromeDriver();
	 
//********************************************************************************************
	 
	 
//2) FireFox browser --> 
	 
	 System.setProperty("Webdriver.gecko.driver", "D:\\Software Testing\\Automation Workspace\\SeleniumPractice\\executables\\geckodriver.exe");
	 WebDriver driver2 = new FirefoxDriver();
	 
// Generic Way
	 
	 WebDriver driver3 = new FirefoxDriver();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
