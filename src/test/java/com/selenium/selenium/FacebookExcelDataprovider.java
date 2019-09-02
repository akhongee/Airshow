
package com.selenium.selenium;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FacebookExcelDataprovider {

	
static WebDriver driver;
	
	static Sheet excelSheet;
	

	
	
	@DataProvider(name="personinfo")
	
	public static Object[][]dataname() throws IOException{
	
		
		//read excel file
		//1. FileInputStream
		//2. WorkBook
		//3. Sheet
		//4. for/row/cell
		//read each cell and put into array.
		//String s =Cell.getStrin();
		//Ojbect[][]
		
		//int []x;
		//x = new int[6];
		//x[0]=s;
		Object[][] tabArray;
		String filePath = "name.xls";
		FileInputStream excelFileRead = new FileInputStream(filePath);
		Workbook excelWBook = new HSSFWorkbook(excelFileRead);
		excelSheet = excelWBook.getSheet("Sheet1");
		
		int totalRows = excelSheet.getPhysicalNumberOfRows();
		int totalCols = excelSheet.getRow(0).getPhysicalNumberOfCells();
		
		//t[row][col]
		// deduct one row because of header row
		tabArray = new Object[totalRows-1][totalCols];
		
		for(int row=1; row<totalRows; row++) {
			for(int col=0; col<totalCols; col++) {
				// add row+1 to get data after header row
				tabArray[row-1][col] = getCellData(row, col);
			}
		}
		return tabArray;

//		
//		Object[][]t = {{"jibon", "Roy"},
//	                {"Akash","Roy"},
//	                 {"sargor","Roy"}
//		
//	        };
//		
//		    return t;
	}
	public static String getCellData(int row, int col) {
		Cell cell = excelSheet.getRow(row).getCell(col);

		String cellData = cell.getStringCellValue().trim();
		//convert to string by using switch statement.
		return cellData;
		}

	
	@Test(dataProvider="personinfo")
		
	public void createfb(String f,String l) throws InterruptedException {
		WebElement fname;
		fname=driver.findElement(By.xpath(".//*[@id='u_0_c']"));
		fname.sendKeys(f);
	    

		
		WebElement lname;
		lname=driver.findElement(By.xpath(".//*[@id='u_0_e']"));
		lname.sendKeys(l);
		
		Thread.sleep(3000);
		fname.clear();
		lname.clear();
		
	}
	

	@ BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	

}


	
	

