package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class SilksSareeSite extends BaseClass {
	
	public SilksSareeSite() {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath="//a[text()='Shop by Category']")
	private WebElement catogery;
	
	@FindBy (xpath="(//span[text()='Cotton'])[1]")
	private WebElement cotton;
	
	@FindBy (xpath="(//span[text()='Silk'])[1]")
	private WebElement silk;

	public WebElement getCatogery() {
		return catogery;
	}

	public WebElement getCotton() {
		return cotton;
	}

	public WebElement getSilk() {
		return silk;
	}
	
	
	
}
