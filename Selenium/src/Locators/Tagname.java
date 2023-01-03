package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement>list = driver.findElements(By.tagName("li"));
		int count = list.size();
		System.out.println(count);
		
		for(int i=0;i<=count-1;i++) {
			String str = list.get(i).getText();
			System.out.println(str);
			Thread.sleep(1000);
		}
		
		
	    
		
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("gb_f")).click();
		
	}

}
