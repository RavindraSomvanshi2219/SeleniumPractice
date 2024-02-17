package UIValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class OrangeHRM_LoginPage {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement UserName = driver.findElement(By.name("username"));
		System.out.println("UserName Field Is Displayed..? : "+UserName.isDisplayed());
		System.out.println("UserName Field Is Enabled..? : "+UserName.isEnabled());
		System.out.println("UserName Default Value : "+UserName.getAttribute("placeholder"));
		
		
		UserName.clear();
		UserName.sendKeys("Admin");
		
//**************************************************************************************************
		
		WebElement Password = driver.findElement(By.name("password"));
		System.out.println("Password Field Is Displayed..? : "+Password.isDisplayed());
		System.out.println("Password Field Is Enabled..? : "+Password.isEnabled());
		System.out.println("Password Default Value : "+Password.getAttribute("placeholder"));
		
		Password.clear();
		Password.sendKeys("admin123");
		
//**************************************************************************************************
		
		WebElement LoginButton = driver.findElement(By.cssSelector(".orangehrm-login-button"));
		System.out.println("LoginButton Field Is Displayed..? : "+LoginButton.isDisplayed());
		System.out.println("LoginButton Field Is Enabled..? : "+LoginButton.isEnabled());
		System.out.println("LoginButton Default Value : "+LoginButton.getAttribute("type"));
		System.out.println("LoginButton Default Text : "+LoginButton.getText());
		
		LoginButton.click();
		
		
		
		
		
	}

}
