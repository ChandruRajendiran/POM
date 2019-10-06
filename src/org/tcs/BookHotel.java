package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Base{
	
	
	public BookHotel() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
@FindBy(id="first_name")
private WebElement firname;
@FindBy(id="last_name")
private WebElement lname;

@FindBy(id="address")
private WebElement address1;

@FindBy(id="cc_type")
private WebElement cctype;

@FindBy(id="cc_exp_month")
private WebElement month;

@FindBy(id="cc_exp_year")
private WebElement year;

@FindBy(id="cc_num")
private WebElement num;
@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement booknow;

public WebElement getFirname() {
	return firname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAddress1() {
	return address1;
}

public WebElement getCctype() {
	return cctype;
}
public WebElement getCcnum() {
	return num;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBooknow() {
	return booknow;
}



}
