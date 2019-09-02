package com.selenium.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExrepeat {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		String sourcefile = ("gmailSignUp/gmail.xlsx");
		FileInputStream input = new FileInputStream(sourcefile);
		Workbook wb = new XSSFWorkbook();
		ArrayList<String> alist = new ArrayList<String>();
		
		Sheet st;
		
		st= wb.getSheetAt(0);
		
		//for
		
		
	}

}
