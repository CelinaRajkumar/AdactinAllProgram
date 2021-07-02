package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class GmailSentItem extends BaseClass {
	
	public GmailSentItem() {
		
		PageFactory.initElements(driver,this);
			
	}
	
	@FindBy(xpath="//a[text()='Sent']")
	private WebElement sentt;

	public WebElement getSentt() {
		return sentt;
	}
	
	
	

}
