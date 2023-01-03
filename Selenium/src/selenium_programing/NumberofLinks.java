package selenium_programing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberofLinks {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int count = list.size();
		System.out.println(count);
		String s = list.get(1).getText();
		System.out.println(s);
		
//		for(int i=0;i<=count-1;i++) {
//			String link = list.get(i).getText();
//			System.out.println(link);
//		}

	}

}
