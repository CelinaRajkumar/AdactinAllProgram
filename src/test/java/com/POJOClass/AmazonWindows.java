package com.POJOClass;

import com.basePack.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWindows extends BaseClass {
	
	public AmazonWindows() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({
		
		@FindBy(id="twotabsearchtextbox"),		
		@FindBy(xpath="//input[@name='field-keywords']")
	})
	
	private WebElement txtbox;

	
	@FindAll({
		
		@FindBy(id="nav-search-submit-button"),		
		@FindBy(xpath="//input[@value='Go']")
	})
	
	private WebElement srchclk;


	public WebElement getTxtbox() {
		return txtbox;
	}


	public WebElement getSrchclk() {
		return srchclk;
	}
	
	
}
