package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction1 {
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		 driver = new ChromeDriver();
		
		
		driver.get("https://www.hotels.com/");
		
		Actions act = new Actions(driver);
		
		WebElement click1;
	    click1=driver.findElement(By.xpath(".//*[@id='header-full']/header/nav[2]/div/ul/li[2]/a"));
	    
		act.moveToElement(click1);
		
		act.click();
		act.build().perform();
		
		WebElement click2;
	    
	    
        // act.moveToElement(x);
        
		
		act.click();
		act.build().perform();

	    click2=driver.findElement(By.xpath(".//*[@id='tab-flight-tab-hp']"));
	    
		//act.moveToElement(click2);
		
		//act.click();
		//act.build().perform();
	    
	    
        //act.moveToElement(x);
        
		
		act.click();
		act.build().perform();
	    


	}
	
	public static  void elementclick(WebElement x) {
		Actions act = new Actions(driver);
		
	}
	
	
	}


