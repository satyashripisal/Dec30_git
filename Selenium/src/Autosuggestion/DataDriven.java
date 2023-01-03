package Autosuggestion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/Chrome102/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FileInputStream excel = new FileInputStream("C:/Users/dell/DNYANESHWAR/Desktop/pqr.xlsx/");
		
		
		Sheet s = WorkbookFactory.create(excel).getSheet("Sheet2");
		
		String a = s.getRow(1).getCell(3).getStringCellValue();
		long b = (long) s.getRow(2).getCell(3).getNumericCellValue();
		
		driver.findElement(By.name("email")).sendKeys(a);
		driver.findElement(By.name("pass")).sendKeys(""+b);
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
