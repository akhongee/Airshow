
package com.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebook {

	static WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

	}

	@Test(priority = 0)
	public void title_test() {
		driver.getTitle();

		String s;
		s = driver.getTitle();

		System.out.println(s);
	}

	@Test(priority = 1)
	public void createAccount() {
		WebElement first_name = driver.findElement(By.xpath(".//*[@id='u_0_c']"));

		first_name.sendKeys("akash");

		WebElement last_name = driver.findElement(By.xpath(".//*[@id='u_0_e']"));
		last_name.sendKeys("akhongee");

		WebElement mobile = driver.findElement(By.xpath(".//*[@id='u_0_h']"));
		mobile.sendKeys("9294275375");

		WebElement password = driver.findElement(By.xpath(".//*[@id='u_0_o']"));
		password.sendKeys("9294275375");
//
//		WebElement month;
//		month.findElement(By.xpath(".//*[@id='month']"));
//		Select m = new Select(month);
//		m.selectByValue("Jan");
//
//		WebElement day;
//		day.findElement(By.xpath(".//*[@id='month']"));
//		Select d = new Select(month);
//		d.selectByValue("Jan");
//
//		WebElement year;
//		year.findElement(By.xpath(".//*[@id='month']"));
//		Select y = new Select(month);
//		y.selectByValue("Jan");
//	Assert.assertEquals(s, "Facebook - Log In or Sign Up");
	}

}
