package BasicsOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOps {

	public static void main(String[] args) {
		WebDriver driver = new  FirefoxDriver();
		
// How To Launch URL --->
		driver.get("https://www.google.com/");
		
// How to Capture Title ----->
		
		 driver.findElement(By.id("APjFqb")).sendKeys("Gopal Patil");
		

	}

}
