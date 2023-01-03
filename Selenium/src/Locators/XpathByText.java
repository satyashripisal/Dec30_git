package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/dell/DNYANESHWAR/Desktop/software/Chrome102/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		  driver.findElement(By.id("searchDropdownBox")).click();
		  Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 for(int i=0;i<=7;i++) {
			 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 }
		 Thread.sleep(2000);
		 for(int i=0;i<6;i++) {
			 act.sendKeys(Keys.ARROW_UP).build().perform();
		 }
		 
		
		
		//driver.findElement(By.xpath("//div[text()='Sell on Flipkart']")).click();

	}

}
