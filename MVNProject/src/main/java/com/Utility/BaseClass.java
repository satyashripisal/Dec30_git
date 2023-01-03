package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	@BeforeSuite
	public void BS() throws Exception {
		config = new ConfigDataProvider(); 
		excel = new ExcelDataProvider();
	}
	
	@Parameters({"Browser"})
	@BeforeMethod()
	public void LaunchBrowser(@Optional String Browser)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://mvnrepository.com/");
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	    driver.get("https://mvnrepository.com/");
		}
	    driver.manage().window().maximize();
}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
