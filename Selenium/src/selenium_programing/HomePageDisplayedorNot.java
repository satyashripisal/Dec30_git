package selenium_programing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageDisplayedorNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("satyashripisal91@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("7350346689");
		driver.findElement(By.name("login")).click();
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "yahoo";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Home Page is Displayed");
		}else {
			System.out.println("Home Page is not Displayed");
		}
	}

}
