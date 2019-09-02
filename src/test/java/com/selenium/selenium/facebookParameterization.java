package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebookParameterization {

	static WebDriver driver;
	@BeforeClass
	public void setup1() {
	System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
	
			driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
	}
	@Test(dataProvider="person_info")
	public void setup(String f, String l) {
//		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
//WebDriver driver;
//		driver = new ChromeDriver();
//		driver.get("http://www.facebook.com");

	WebElement first_name = driver.findElement(By.xpath(".//*[@id='u_0_c']"));

	first_name.sendKeys(f);
	first_name.clear();

	WebElement last_name = driver.findElement(By.xpath(".//*[@id='u_0_e']"));
	last_name.sendKeys(l);
	last_name.clear();
	}
	


	@DataProvider(name="person_info")	
	public static Object[][] dataname(){
		
		
		Object [][] t = { {"Akanjee", "John"},
				{"Robin", "Roy"},
				{"Jibon","Das"}
				}; 
		return t;
		}
	
}