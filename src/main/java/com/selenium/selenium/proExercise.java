package com.selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class proExercise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		//String s = driver.getTitle();
		//System.out.println(s);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		WebElement email;
		email=driver.findElement(By.xpath("//*[@id='navbar']/div[2]/div[2]/div[1]/ul/li[1]/a"));
		//email.sendKeys("products");
		email.click();
		
//		List<WebElement> el;
//		
//		el=driver.findElements(By.xpath("//*[@id=\"navbar']/div[2]/div[2]/div[1]/ul/li[1]/a"));
//		WebElement dlist;
//		dlist = driver.findElement(By.xpath("//tr"));
//		
//Select sel = new Select(dlist);
//
//		sel.selectByVisibleText("Products");
//		dlist.click();
	}

}
