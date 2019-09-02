package com.selenium.selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMWindowsOpen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		((JavascriptExecutor) driver).executeScript("window.open('http://www.google.com','_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('http://www.gmail.com','_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('http://www.youtube.com','_blank');");
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
	
		System.out.println("No. of tabs: " + allWindowHandles.size());


	}

}
