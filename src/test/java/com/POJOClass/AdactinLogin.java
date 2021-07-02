package com.POJOClass;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class AdactinLogin extends BaseClass{
	
	
	public AdactinLogin() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement btnclk;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnclk() {
		return btnclk;
	}
}
