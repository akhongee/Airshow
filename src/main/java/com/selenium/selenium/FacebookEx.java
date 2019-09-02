package com.selenium.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookEx {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		String sourcefile = "fb/facebook.xlsx";
		FileInputStream in = new FileInputStream(sourcefile);
		ArrayList<String> alist = new ArrayList<String>();
		Workbook wb = new XSSFWorkbook(in);

		Sheet st = wb.getSheetAt(0);
		for (Row r : st) {

			for (Cell c : r) {
				String s;
				switch (c.getCellType()) {
				case Cell.CELL_TYPE_STRING:

					
					s = c.getStringCellValue();
					alist.add(s);
					break;
					
				case Cell.CELL_TYPE_NUMERIC:
				double i=c.getNumericCellValue();

					
					s = Integer.toString((int )i);
					alist.add(s);
				}
			}
		}

		System.out.println(alist);
		System.out.println(alist.get(4));
		for (int i = 4; i < alist.size(); i = i + 4) {

			WebElement firstname;
			// *[@id="u_0_c"]
			firstname = driver.findElement(By.xpath(".//*[@id='u_0_c']"));
			firstname.click();
			firstname.clear();
			firstname.sendKeys(alist.get(i));

			WebElement lastname;
			lastname = driver.findElement(By.xpath(".//*[@id='u_0_e']"));
			lastname.clear();
			lastname.sendKeys(alist.get(i + 1));

			WebElement email;
			email = driver.findElement(By.xpath(".//*[@id='u_0_h']"));
			email.clear();
			email.sendKeys(alist.get(i + 2));

			WebElement password;
			password = driver.findElement(By.xpath(".//*[@id='u_0_o']"));
			password.clear();
			password.sendKeys(alist.get(i + 3));

			TakesScreenshot screen = (TakesScreenshot) driver;

			File src = screen.getScreenshotAs(OutputType.FILE);

			String location = "fb1/screen" + i + ".png";

			File dest_file = new File(location);

			FileUtils.copyFile(src, dest_file);
		}
	}

}
