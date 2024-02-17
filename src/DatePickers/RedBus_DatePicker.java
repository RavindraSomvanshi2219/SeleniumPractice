package DatePickers;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class RedBus_DatePicker {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.redbus.in/");
		
		
// select Month & year First
		String Year = "2025";
		String Month = "Feb";
		String Date = "22";
		
		driver.findElement(By.id("onwardCal")).click();
		
		while(true)
		{
			String YrMon = driver.findElement(By.xpath("//div[@class=\"DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR\"]/div[1]/div[2]")).getText();
			
			String arr[] = YrMon.split("\n");
			String data = arr[0];
			String arr1[] = data.split(" ");
			String mt = arr1[0];
			String yr = arr1[1];
			
			if(mt.equals(Month)&& yr.equals(Year))
				break;
				
			else 
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[3]")).click();
		    	
		}
		
	
		

	}

}
