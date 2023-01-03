package selenium_programing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
        
		
		
		FileInputStream excel = new FileInputStream("C:/Users/dell/DNYANESHWAR/Desktop/pqr.xlsx");
		
		Sheet s = WorkbookFactory.create(excel).getSheet("Sheet2");
		
		String a = s.getRow(1).getCell(3).getStringCellValue();
		long b = (long)s.getRow(2).getCell(3).getNumericCellValue();
		Thread.sleep(1000);
		System.out.println(a);
		System.out.println(""+b);
		

	}

}
