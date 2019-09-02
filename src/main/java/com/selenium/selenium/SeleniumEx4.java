package com.selenium.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		WebElement search;
		
        search = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
        
        search.sendKeys("learning Webdriver");
        
        search.submit();
        
        
        
        
		
		//List<WebElement> button;
		//button = driver.findElements(By.xpath("//*[@type='radio']")) ;  //(By.xpath("html/body/div[1]/div[1]/input[2]"));
		//button.size();
	}

}
