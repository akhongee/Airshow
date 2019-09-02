package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHtml {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///C:/Users/AKHON/Downloads/Selenium.html");
		
		WebElement button;
		button = driver.findElement(By.xpath("html/body/div[1]/div[1]/input[2]"));
		button.click();
		
		WebElement check1;
		check1 = driver.findElement(By.xpath("html/body/div[1]/div[1]/input[4]"));
		
		boolean b=check1.isSelected();
		if (b) {
			
			System.out.println("it is selected");
		}
		else 
		{
			
			System.out.println("it is not selsected");
		}
		
		WebElement button2;
		button2 = driver.findElement(By.xpath("html/body/div[1]/div[2]/input[1]"));
		button2.click();


	}

}
