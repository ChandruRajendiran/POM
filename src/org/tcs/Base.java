package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

 static WebDriver driver;
public static WebDriver getDriver() {
	// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\greens tech\\Desktop\\hariraj\\Adactin\\driver\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	return driver;
	

}
public static  void type(WebElement element, String name) {
	// TODO Auto-generated method stub
	
	element.sendKeys(name);

}
public static  void select(WebElement element, int index) {
	// TODO Auto-generated method stub
	
Select s=new Select(element);
s.selectByIndex(index);
}


public static void btnClick(WebElement element) {
	// TODO Auto-generated method stub
element.click();
}

public static  void loadUrl(String url) {
	// TODO Auto-generated method stub
driver.get(url);
}
public static  void quitBrowser() {
	// TODO Auto-generated method stub
driver.quit();
}

public static  void getAttribute(WebElement element,String value) {
	// TODO Auto-generated method stub
	String attribute = element.getAttribute(value);
	System.out.println(attribute);

}
}