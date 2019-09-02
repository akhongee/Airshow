package com.selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		
		//Launching sample website
		driver.get("https://www.google.com/search?ei=ITdLXe_NBamm_QamyJCwDw&q=amazon.com&oq=amazon.com&gs_l=psy-ab.3..0j0i131j0i10j0i131j0i7i30j0j0i131l2j0j0i131.4143.4143..7868...0.0..0.107.107.0j1......0....1..gws-wiz.......0i71.Hrt_WZoWxKg&ved=&uact=5");
		driver.manage().window().maximize();
		
		//Get list of web-elements with tagName  - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		allLinks.size();
		System.out.println(allLinks.size());
		
		//Traversing through the list and printing its text along with link address
		//for(WebElement link:allLinks){
			//System.out.println(link.getText() + " - " + link.getAttribute("href"));
		//}
		
		//Commenting driver.quit() for user to verify the links printed
		//driver.quit();

	}

}
