package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Base {

	
	public SelectHotel() {
	
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement contin;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContin() {
		return contin;
	}

	                                                                                     
}
