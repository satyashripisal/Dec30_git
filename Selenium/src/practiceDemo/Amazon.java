package practiceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/dell/DNYANESHWAR/Desktop/software/NEW97/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	   driver.manage().window().maximize();
	   
	   Thread.sleep(2000);
	   
	   WebElement a = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
	 
	    Actions b=new Actions(driver);
		b.click(a).build().perform();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("ap_email")).sendKeys("8888680330");//invalid username 
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("");//invalid password
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("The sign in process on amezon is completed");
	}
}
