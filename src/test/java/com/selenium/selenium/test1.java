package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		// String s = driver.getTitle();
		// System.out.println(s);
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		WebElement email;
		email = driver.findElement(By.xpath(".//*[@id='identifierId']"));

		email.sendKeys("akhongee");

		WebElement nextbutton;

		nextbutton = driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span"));
		nextbutton.click();

		
		Thread.sleep(3000);
		WebElement password;
		password = driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));

		password.sendKeys("052814052814");

		WebElement pnextbutton;

		pnextbutton = driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
		pnextbutton.click();

	}

}
