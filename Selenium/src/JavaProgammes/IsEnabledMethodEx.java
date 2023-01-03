package JavaProgammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful-Correct  title is displayed on the home webpage");
			
		}else {
			System.out.println("Verification Failed-Incorrrect title is displayed on the home webpage");
		}
		WebElement searchBox = driver.findElement(By.name("q"));
		if(searchBox.isEnabled()) {
			System.out.println("SearchBox is enabled.Return: "+searchBox.isEnabled());
		}else {
			System.out.println("SearchBox is disabled.Return: "+searchBox.isEnabled());
		}
		WebElement sendText = driver.findElement(By.xpath("//input[@name='q']"));
		sendText.sendKeys("Selenium Tool");
		WebElement searchButton = driver.findElement( By.xpath("//input[@name='btnK']"));
		if(searchButton.isEnabled()) {
			System.out.println("SearchButton is enabled.Return: "+searchButton.isEnabled());
			
		}else {
			System.out.println("SearchButton is not enabled.Return: "+searchButton.isEnabled());
		}
		searchButton.click();
		driver.close();
		
		
		
		
		
		
	}

}
