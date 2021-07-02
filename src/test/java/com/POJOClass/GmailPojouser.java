package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class GmailPojouser extends BaseClass {
	
	
	public GmailPojouser() {
		
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	
	
	@FindBy(id="identifierId")
	private WebElement username;
	
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getNext() {
		return next;
	}
	
	
}
