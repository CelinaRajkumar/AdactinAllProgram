package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class gmailPojopass extends BaseClass {
		
		
		public gmailPojopass() {
			
			PageFactory.initElements(driver, this);
		}

		@CacheLookup
		
		

		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy(xpath="//span[text()='Next']")
		private WebElement next1;

		public WebElement getPassword() {
			return password;
		}

		public WebElement getNext1() {
			return next1;
		}
		
		
		
}
