package com.POJOClass;

import com.basePack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		
		PageFactory.initElements(driver, this);		
	}
	
	
	//ask Sir --- if we can create may find bys for all radio buttons avaialble. 
	

		
		@FindBy(id="radiobutton_1")
		private WebElement selhotel1;
		
		@FindBy(id="radiobutton_2")
		private WebElement selhotel2;
		
		@FindBy(id="radiobutton_3")
		private WebElement selhotel3;
		
		@FindBy(id="radiobutton_4")
		private WebElement selhotel4;
	
		@FindBy(id="continue")
		private WebElement contd;

		public WebElement getSelhotel1() {
			return selhotel1;
		}

		public WebElement getSelhotel2() {
			return selhotel2;
		}

		public WebElement getSelhotel3() {
			return selhotel3;
		}

		public WebElement getSelhotel4() {
			return selhotel4;
		}

		public WebElement getContd() {
			return contd;
		}

		
		
		
		
		
		
}
