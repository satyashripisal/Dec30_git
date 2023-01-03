package selenium_programing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arrow_up_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.id("searchDropdownBox"));
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("arguments[0].click();", a);
		a.click();
		Actions actions = new Actions(driver);
		for(int i=0;i<=7;i++) {
			actions.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);	
		}
		for(int i=0;i<=5;i++) {
			actions.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(2000);	
		}
		
		
	}

}
