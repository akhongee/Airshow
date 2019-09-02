package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateTable {

	public static void main(String[] args) throws InterruptedException  {
		
System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		
//Actions act = new Actions(driver);
		
		WebElement click1;
	    click1=driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceholder1_RadCalendar1_Top']/tbody/tr[2]/td[2]/a"));
	    
	    click1.click();
	    
	    
	   // System.out.println(x);
	    
	    WebElement textvalue;
	    textvalue=driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceholder1_ctl00_ContentPlaceholder1_Label1Panel']"));
	    //textvalue.isDisplayed();
	    Thread.sleep(3000);
	    String s;
	    s=textvalue.getText();
	    System.out.println(s);
	    
	    
	}

}
