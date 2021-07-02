package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class ItenaryPage extends BaseClass{
	
	public  ItenaryPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement Bookiten;


	public WebElement getBookiten() {
		return Bookiten;
	}
	

}
