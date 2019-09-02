package com.selenium.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHtml2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///C:/Users/AKHON/Downloads/Selenium.html");
		
		List<WebElement> button;
		button = driver.findElements(By.xpath("//*[@type='radio']")) ;  //(By.xpath("html/body/div[1]/div[1]/input[2]"));
		//button.size();
		int x;
		x=button.size();
		System.out.println(x);
		
		//button.click();
		
		
		WebElement dlist;
		dlist = driver.findElement(By.xpath(".//*[@id='issues']"));
		
		Select sel = new Select(dlist);
		
		sel.selectByVisibleText("Bug");
		
		
		//sel.getOptions();
		
		List<WebElement> se;
		se = sel.getOptions();
		
		
		for (WebElement c:se) {
			String s;
			
			s=c.getText();
			
			System.out.println(s);
		}
		for (WebElement b:button) {
			
		b.click();
		
		}
	}

}
