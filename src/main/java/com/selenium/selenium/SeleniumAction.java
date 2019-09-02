package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction {
	
	 static WebDriver driver = null;
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://www.hotels.com/");
		
		Actions act = new Actions(driver);
		
		WebElement click1;
	    click1=driver.findElement(By.xpath(".//*[@id='header-full']/header/nav[2]/div/ul/li[2]/a"));
	    
		elementclick(click1);
		
	    
	    
         WebElement click2;

	    click2=driver.findElement(By.xpath(".//*[@id='tab-flight-tab-hp']"));
	    elementclick(click2);
		
        

	}
	
	public static  void elementclick(WebElement x) {
		Actions act = new Actions(driver);
		
        act.moveToElement(x);
        
		
		act.click();
		act.build().perform();
	    

		
	}
	
	
	}

