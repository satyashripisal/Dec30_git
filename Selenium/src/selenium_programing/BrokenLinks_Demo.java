package selenium_programing;

import java.io.IOException;
import java.net.HttpURLConnection;


import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Demo {
	
	private static WebDriver driver = null;

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe/");
	    driver = new ChromeDriver();
		String homepage = "http://www.zlti.com";
		String url = "";
		//the methods in the package allow the tester to send HTTP requests and capture HTTP response code when they returned by the code 
		HttpURLConnection huc = null;
		int respCode = 200;
		driver.manage().window().maximize();
		driver.get(homepage);
		
		//collect all links on the webpage
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) {
			/*This step is about checking if a certain URL belongs to a third party domain or if it is empty/null
			 * the code below will retrieve the href of the anchor tag and store it in the URL variable */
			
		url = it.next().getAttribute("href");
		System.out.println(url);
		
		if(url==null||url.isEmpty()) {
			System.out.println("URL is either not configured for anchor tag or it is Empty");
			continue;
			
		}
		/* If URL belongs to the main domain ,continue .If it belongs to a third party domain,skip the step after it */
		if(!url.startsWith(homepage)) {
			System.out.println("URL belongs to another domain,skipping it.");
			continue;
		}
		
		try {
			/*Methods in the HttpURLConnection class will send HTTP requeests and capture the HTTP response code
			 * Therefore the o/p of openConnection() method (URLConnection) is type-casted to HttpURLConnection   */
			try {
				huc = (HttpURLConnection)(new URL(url)).openConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/* If tester set request type as "Head" instead of "GET" only headers will be returned , not the document body */
			huc.setRequestMethod("Head");
			/* when the tester invokes the connect() method the actual connection to the URL is established and the HTTP request is sent*/
			huc.connect();
			//validate links 
			/* Use the getResonseCode() method to get he HTTP response code for the previously sent HTTP request */
			respCode = huc.getResponseCode();
			/* Check link status (broken or not) based on the response code*/
			if(respCode>=400) {
				System.out.println(url+" is a Broken Link");
			}
			else {
				System.out.println(url+" is a Valid Link");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		driver.quit();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
