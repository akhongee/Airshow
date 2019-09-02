package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionEx3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/samples/05_drag_n_drop/01_drag_in_simple.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		WebElement drag;
		
		drag = driver.findElement(By.xpath("//*[text()='Teens']"));
		//drag.click();
        WebElement drop;
        drop = driver.findElement(By.xpath("//*[text()='History']"));
        
        
            act.dragAndDrop(drag, drop);
            act.perform();
       }
	}


