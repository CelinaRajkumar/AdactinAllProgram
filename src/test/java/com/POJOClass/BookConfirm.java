package com.POJOClass;

import com.basePack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirm extends BaseClass {
	
	public BookConfirm() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	
	

}
