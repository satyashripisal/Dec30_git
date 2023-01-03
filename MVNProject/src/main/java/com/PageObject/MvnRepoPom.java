package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MvnRepoPom {

	  WebDriver driver;
	
	  @FindBy(how = How.XPATH,using= "//input[@name='q']")
	private WebElement search;
	
	@FindBy(how = How.XPATH,using ="//input[@value='Search']")
	private WebElement btn_search;

	
	
	public MvnRepoPom(WebDriver driver) {
		this.driver = driver;
		
	}

    public WebElement getSearch() {
		return search;
	}



	public WebElement getBtn_search() {
		return btn_search;
	}



	
}
