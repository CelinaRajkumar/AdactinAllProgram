package com.POJOClass;

import com.basePack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass {

	public Logout() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id="logout"),
		@FindBy(xpath="//a[text()='Logout']")
		
	})
	private WebElement lo;

	public WebElement getLo() {
		return lo;
	}
}
