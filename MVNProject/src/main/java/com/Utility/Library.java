package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class Library {

	public static void custom_sendKeys(WebElement element, String  value, String fieldname) {
		try {
			element.sendKeys(value);
			ObjectRepo.test.log(Status.PASS, fieldname + ": value successfully send==> "+ value);
		}catch(Exception e){
			ObjectRepo.test.log(Status.FAIL, "value unable to send "+e);
		}
	}
	public static void custom_click(WebElement element, String fieldname) {
		try {
			element.click();
			ObjectRepo.test.log(Status.PASS, "successfully clicked "+ fieldname);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, "unable to click"+e);
		}
	}
	
}
