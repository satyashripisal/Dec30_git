package selenium_programing;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		Date d = new Date();
		String date1 = d.toString();
		System.out.println(date1);
		String date2 = date1.replaceAll(":", "-");
		System.out.println(date2);
		driver.get("https://www.google.com/");
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desfile = new File("C://Users//dell//DNYANESHWAR//Desktop//capturescreenshot.bmp/");
		FileUtils.copyFile(srcfile, desfile);
		
		
	}

}
