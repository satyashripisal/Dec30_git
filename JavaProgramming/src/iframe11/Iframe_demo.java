package iframe11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/Chrome102/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@text()='By.Remotable']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		
	}

}
