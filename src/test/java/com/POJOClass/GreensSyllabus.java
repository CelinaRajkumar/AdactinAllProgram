package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class GreensSyllabus extends BaseClass{
	
public GreensSyllabus() {
		
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//span[text()='Syllabus']")
	private WebElement syllb;



	public WebElement getSyllb() {
		return syllb;
	}
	
	

}



