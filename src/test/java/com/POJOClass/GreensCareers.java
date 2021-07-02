package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class GreensCareers extends BaseClass{
	
	public GreensCareers() {
		
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement careers;



	public WebElement getCareers() {
		return careers;
	}
	

	
	
}
