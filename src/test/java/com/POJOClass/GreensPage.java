package com.POJOClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePack.BaseClass;

public class GreensPage extends BaseClass {

	public GreensPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courses;
	
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement java;
	

	@FindBy(xpath="//span[text()='J2EE Training']")
	private WebElement j2ee;
	

	@FindBy(xpath="//span[text()='Software Testing ']")
	private WebElement software;
	
	@FindBy(xpath="//span[text()='Jmeter ']")
	private WebElement jmeter;
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement contactus;

	public WebElement getCourses() {
		return courses;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getJ2ee() {
		return j2ee;
	}

	public WebElement getSoftware() {
		return software;
	}

	public WebElement getJmeter() {
		return jmeter;
	}

	public WebElement getContactus() {
		return contactus;
	}
	
	
	
}
