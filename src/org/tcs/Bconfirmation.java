package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bconfirmation extends Base{
	
	public Bconfirmation() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="order_no")
	private WebElement ordernumber;


	public WebElement getOrdernumber() {
		return ordernumber;
	}
}
