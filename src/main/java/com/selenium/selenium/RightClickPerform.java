package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickPerform {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		Actions ac= new Actions(driver);
		WebElement wb= driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[3]/a"));
		
		ac.contextClick(wb).perform();

	}

}
