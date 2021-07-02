package com.POJOClass;

import com.basePack.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWindNxtPage extends BaseClass {
	public AmazonWindNxtPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(xpath="//span[contains(text(),'Dell Inspiron 15 (3501) 15.6\" (39.62cms) FHD')]")
	
	
		private WebElement srchObj;


		public WebElement getSrchObj() {
			return srchObj;
		}
		
		
}
