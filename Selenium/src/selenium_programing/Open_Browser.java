package selenium_programing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		Point p = new Point(200, 300);
		driver.manage().window().setPosition(p);
		String src = driver.getPageSource();
		System.out.println(src);
		
		Dimension d = new Dimension(500,700);
		driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		String title = driver.getTitle();
		System.out.println(title);
		String wnd = driver.getWindowHandle();
		System.out.println(wnd);
		driver.close();
		
		
		
		
	}

}
