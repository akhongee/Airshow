package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement firstname;
		// *[@id="u_0_c"]
		firstname = driver.findElement(By.xpath(".//*[@id='u_0_c']"));
		firstname.sendKeys("ALmin");
		Thread.sleep(3000);
		
		String name=driver.findElement(By.xpath(".//*[@id='u_0_c']")).getAttribute("value");
		
		System.out.println(name);

	}

}
