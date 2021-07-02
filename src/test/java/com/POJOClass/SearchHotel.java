package com.POJOClass;

import com.basePack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="location")
	private WebElement loc;
	
	@CacheLookup
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noOfrooms;
	
	@CacheLookup
	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@CacheLookup
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@CacheLookup
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@CacheLookup
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getNoOfrooms() {
		return noOfrooms;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	

}
