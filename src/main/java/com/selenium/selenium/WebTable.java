package com.selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.livescore.in/bangladesh/");
		
		List<WebElement> el=driver.findElements(By.xpath("//tr"));
		int s=el.size()-1;
		
		for(int i=1;i<=s;i++) {
			
			for(int j=1;j<=5;j++) {
				
				String st="//tr[" + i + "]/+td["+j+"]";
				if(j !=2)
				{
					WebElement e=driver.findElement(By.xpath(st));
					String l=e.getText();
					System.out.print(l);
				}
				
			}
		}
		

	}

}
