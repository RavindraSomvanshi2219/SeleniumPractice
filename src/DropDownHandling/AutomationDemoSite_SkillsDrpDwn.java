package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtil;

public class AutomationDemoSite_SkillsDrpDwn {

	public static void main(String[] args) {
		SeleniumUtil util = new SeleniumUtil();
		WebDriver driver = util.setUp("Chrome", "https://demo.automationtesting.in/Register.html");
		
		WebElement SkillDrp = driver.findElement(By.id("Skills"));
		Select slt = new Select(SkillDrp);
		
		System.out.println("Drp Is MultiSelected : "+slt.isMultiple());
		System.out.println("Default Selected Value : "+slt.getFirstSelectedOption().getText());
		System.out.println("Drp Size : "+ slt.getOptions().size());
		
		List<WebElement> Skills = slt.getOptions();
		for(int i = 0; i<Skills.size(); i++) {
			System.out.println(Skills.get(i).getText());
		}
	
		
		slt.selectByIndex(2);
		System.out.println("Drp Selected By Index : "+slt.getFirstSelectedOption().getText());
		
		slt.selectByVisibleText("Certifications");
		System.out.println("Drp Selected By Visible Text : "+slt.getFirstSelectedOption().getText());
		
		slt.selectByValue("Data Analytics");
		System.out.println("Drp Selected By Value : "+slt.getFirstSelectedOption().getText());
		

	}

}
