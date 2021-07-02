package com.POJOClass;

import com.basePack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		
	@FindBy(id="first_name"),	
	@FindBy(xpath="//input[@class='reg_input'][1]")
	
	
	})
	private WebElement fn;
	
	
	@FindAll({
		
		@FindBy(id="last_name"),	
		@FindBy(xpath="//input[@class='reg_input'][2]")
		
		
		})
		private WebElement ln;
			
	@FindAll({
		
		@FindBy(id="address"),	
		@FindBy(xpath="//input[@class='reg_input'][2]")
		
		
		})
		private WebElement ba;
	
	@FindAll({
		
		@FindBy(id="cc_num"),	
		@FindBy(xpath="//input[@name='cc_num']")
		
		
		})
		private WebElement ccno;
	
	
	@FindAll({
		
		@FindBy(id="cc_type"),	
		@FindBy(xpath="//select[@name='cc_type']")
		
		
		})
		private WebElement ctype;
	
	
	@FindAll({
		
		@FindBy(id="cc_exp_month"),	
		@FindBy(xpath="//select[@name='cc_exp_month']")
		
		
		})
		private WebElement expdate;
	
	@FindAll({
		
		@FindBy(id="cc_exp_year"),	
		@FindBy(xpath="//select[@name='cc_exp_year']")
		
		
		})
		private WebElement yr;
	
	@FindAll({
		
		@FindBy(id="cc_cvv"),	
		@FindBy(xpath="//input[@name='cc_cvv']")
		
		
		})
		private WebElement cvv;
	
	@FindAll({
		
		@FindBy(id="book_now"),	
		@FindBy(xpath="//input[@type='button'][1]")
		
		
		})
		private WebElement bkbtn;

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getBa() {
		return ba;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getExpdate() {
		return expdate;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBkbtn() {
		return bkbtn;
	}
	
	
	
}
