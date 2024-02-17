package BrokenLinks;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class HowToCheck_BrokenLinks {

	public static void main(String[] args) throws IOException{
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "http://www.deadlinkcity.com/");
		
		int BrokenLinks=0;
		
		List<WebElement> AvlLinks = driver.findElements(By.tagName("a"));
		for(WebElement Links:AvlLinks)
		{
			String url = Links.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL Is Empty");
				continue;
			}
			URL links =new URL(url);
			try {
				HttpURLConnection httpcon = (HttpURLConnection)links.openConnection();
				httpcon.connect();
				if(httpcon.getResponseCode()>=400)
				{
					System.out.println(httpcon.getResponseCode()+url+" Is Broken Link");
					BrokenLinks++;
				}else
				{
					System.out.println(httpcon.getResponseCode()+url+" Is Valid Link");
				}
				
			} catch (Exception e) {
				
			}
	}
		System.out.println("Number of Broken Links: "+BrokenLinks);
		driver.quit();

}
	
	
}
