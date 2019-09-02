package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHtml1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///C:/Users/AKHON/Downloads/Selenium.html");
	
		WebElement check1;
		check1 = driver.findElement(By.xpath("html/body/div[1]/div[1]/input[1]"));
	//	check1.click();
		
		WebElement check2;
		check2 = driver.findElement(By.xpath("html/body/div[1]/div[1]/input[2]"));
		
		String s;
		s= isChecked(check1);
		System.out.println(s);
		
		s=isChecked(check2);
		System.out.println(s);
	}
		
		
		
		
	static	String isChecked(WebElement x)
		{ boolean b;
		b=x.isSelected();
		
		String s;
		
		if (b) {
			
			s="it is selected";
		}
		else 
		{
			
			s="it is not selsected";
		}
		return s;
		}
		
}	