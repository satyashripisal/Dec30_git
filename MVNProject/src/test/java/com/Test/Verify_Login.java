package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.MvnRepoPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verify_Login extends BaseClass {

	@Test
	public void  verify_tc_001() {
		//System.out.println("Test");
		MvnRepoPom mvnrepopage = PageFactory.initElements(driver, MvnRepoPom.class);
		Library.custom_sendKeys(mvnrepopage.getSearch(),excel.getStringData("Sheet1", 0, 0), "SearchBar");
		Library.custom_click(mvnrepopage.getBtn_search(), "Search");
		mvnrepopage.getBtn_search().click();
		
		String data1 = excel.getNumericData("Sheet1", 1, 0);
		System.out.println(data1);
		System.out.println(System.getProperty("user.dir"));
	}
}
