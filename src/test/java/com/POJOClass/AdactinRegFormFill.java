package com.POJOClass;
import com.basePack.BaseClass;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinRegFormFill extends BaseClass {
	
	public AdactinRegFormFill() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({
		
		@FindBy(id="username"),
		@FindBy(xpath="//input[@name='username']")
		
	})
	
	private WebElement txtusr;
	

	@FindBys({
		
		@FindBy(id="password"),
		@FindBy(xpath="//input[@name='password']")
		
	})
	
	private WebElement txtpass;
	
	
	@FindBys({
		
		
		@FindBy(id="re_password"),
		@FindBy(xpath="//input[@name='re_password']")
		
	})
	
	private WebElement ConfirmPass;
	
	
@FindBys({
		
		
		@FindBy(id="full_name"),
		@FindBy(xpath="//input[@name='full_name']")
		
	})
	
	private WebElement fullname;

@FindBys({
	
	
	@FindBy(id="email_add"),
	@FindBy(xpath="//input[@name='email_add']")
	
})

private WebElement email;



@FindBy(id="captcha")
private WebElement captchaimg;

@FindBys({
	
	
	@FindBy(id="captcha-form"),
	@FindBy(xpath="//input[@type='text'][4]")
	
})

private WebElement captxt ;


@FindBys({
	
	
	@FindBy(id="tnc_box"),
	@FindBy(xpath="//input[@type='checkbox']")
	
})

private WebElement chkbox ;

@FindBys({
	
	
	@FindBy(id="Submit"),
	@FindBy(xpath="//input[@type='submit']")
	
})

private WebElement register ;

public WebElement getTxtusr() {
	return txtusr;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getConfirmPass() {
	return ConfirmPass;
}

public WebElement getFullname() {
	return fullname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getCaptchaimg() {
	return captchaimg;
}

public WebElement getCaptxt() {
	return captxt;
}

public WebElement getChkbox() {
	return chkbox;
}

public WebElement getRegister() {
	return register;
}


	
}