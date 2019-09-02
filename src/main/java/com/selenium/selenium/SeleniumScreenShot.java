package com.selenium.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://http://godadasolutions.com/training/");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File sourcefile = screen.getScreenshotAs(OutputType.FILE);
		
		String location = "screenshot1/screen.png";
		
		File dest_file = new File(location);
		
		FileUtils.copyFile(sourcefile, dest_file);
		
	}

}
