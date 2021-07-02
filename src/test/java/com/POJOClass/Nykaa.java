package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class Nykaa extends BaseClass {

	public Nykaa() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (xpath="//a[text()='brands']")
	private WebElement brand;
	
	
	@FindBy (id="brandSearchBox")
	private WebElement brandsrch;
	
	
	@FindBy (xpath="//b[text()='lakme']")
	private WebElement lakme;

	@FindBy (xpath="//b[text()='m.a.c']")
	private WebElement mac;

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getBrandsrch() {
		return brandsrch;
	}

	public WebElement getLakme() {
		return lakme;
	}

	public WebElement getMac() {
		return mac;
	}
	
	
	
	
}
