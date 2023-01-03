package selenium_programing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText_intoDisabledTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value ='satyashripisal91@gmail.com'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('pass').value=''");
		js.executeScript("document.getElementById('pass').value='7350346689'");
		//js.executeScript("document.getElementById('pass').type='button'");

	}

}
