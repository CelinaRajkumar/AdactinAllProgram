package com.basePack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static JavascriptExecutor js;
	
	public static Select s; 
	
	public static Actions a;
	
	public static Alert ar;
	
	public static void launch() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		
	}
	
 public static void launchurl(String url) {
	
	 driver.get(url);
}
 
 public static void maximize() {
	 
	 driver.manage().window().maximize();
	
}
 
 public static void impWait() {
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
 
 
 public static void toInput(WebElement e, String value) {
	 
	 e.sendKeys(value);
	 
	
}
 
 public static void alertHandlingDismiss() {
	 
	 
	 
	 ar.dismiss();
 }
 

 
 
 public static void toInputjs(WebElement jwe,String data) {
	
	  js= (JavascriptExecutor) driver;
	 
	  js.executeScript("arguments[0].setAttribute('value','"+data+"')", jwe);
	 
}
 
 public static void clkjs(WebElement jsc) {
	 
	 js= (JavascriptExecutor) driver;
	 
	 js.executeScript("arguments[0].click",jsc);
 }
 
 public static String getAtt(WebElement c) {
	 
	 String g = c.getAttribute("Value");
	return g;
	 
 }
 
 public static String geturl() {
	 
	String currentUrl = driver.getCurrentUrl();
	
	return currentUrl;
	 
 }
 
 public static String getTitle() {
	 
	String getTitle = driver.getTitle();
	
	return getTitle;
	 
 }
 
 public static void clk(WebElement we) {
	 
	 we.click();
	 
 }
 
 public static void mvToElement(WebElement m) {
	 
	 a= new Actions (driver);
	 
	 a.moveToElement(m);
 }
 
 
 public static void windhand() {
	 
	 driver.getWindowHandle();
 }
 
public static void windhands() {
	 
	 driver.getWindowHandles();
 }
 
public static void windID(String id) {
	
	
	driver.switchTo().window(id);
}

 
 public static void Visbledropdown(WebElement v, String value) {
	 
	 s= new Select(v);
	 s.selectByVisibleText(value);
 }
 
 public static void exit() {
	 driver.quit();
 }
 
 public static void takeSnap(String filename) throws Throwable {
	 
	 TakesScreenshot ts= (TakesScreenshot) driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File des= new File (System.getProperty("user.dir") + "\\Adactin\\src\\test\\resources\\Reports\\Screeshot\\" +filename+ ".png");
	 FileUtils.copyFile(src, des);
 }
 
 public static void failtesttakeSnap(Scenario s) throws Throwable {
	 
	 
	 TakesScreenshot ts= (TakesScreenshot) driver;
	 byte[] snap = ts.getScreenshotAs(OutputType.BYTES);
	 s.embed(snap, "image/png");
	 
 }
 
}
