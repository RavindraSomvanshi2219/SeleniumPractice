package WebTable_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class StaticWebTable {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");

// 1) How many Rows In Table ?
		
		int Rows = driver.findElements(By.xpath("//figure[@class=\"wp-block-table\"]/table/tbody/tr")).size();
		System.out.println("Table Rows Size: "+Rows);
		
// 2) How Many Column In Table ?
		
		int Columns = driver.findElements(By.xpath("//figure[@class=\"wp-block-table\"]/table/tbody/tr/th")).size();
		System.out.println("Table Columns Size: "+Columns);
		
// 3) Retrieved All Data From The Table ?
		System.out.println("Table Data");
		for(int r = 1; r<Rows; r++) {
				List<WebElement> Data = driver.findElements(By.xpath("//figure[@class=\"wp-block-table\"]/tbody/tr["+r+"]/th"));
				for(int c = 0; c<Data.size();c++) {
					System.out.println(Data.get(c).getText());
					System.out.println();
				}
			
		}
		
	}

}
