package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> a = driver.findElements(By.tagName("li"));
		int num = a.size();
		System.out.println(num);
		System.out.println(a.get(num-11).getText());
		
		
//		for(int i=0;i<=num-1;i++) {
//			String str = a.get(i).getText();
//			System.out.println(str);
//			
//		}
//		String str1 = a.get(2).getText();
//		System.out.println(str1);
//		a.get(8).click();
				
	}

}
