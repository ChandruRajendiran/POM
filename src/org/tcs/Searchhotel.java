package org.tcs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel extends Base{
	
	public Searchhotel() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement rooms;
	
	
	@FindBy(id="room_nos")
	private WebElement room;
	
	@FindBy(id="datepick_in")
	
	private WebElement datepick;
	
	@FindBy(id="datepick_out")
	
	private WebElement datepick11;
	
	
	@FindBy(id="child_room")
	
	private WebElement childroom;
	
	
	@FindBy(id="Submit")
	
	private List<WebElement> submit;


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRooms() {
		return rooms;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getDatepick() {
		return datepick;
	}


	public WebElement getDatepick11() {
		return datepick11;
	}


	public WebElement getChildroom() {
		return childroom;
	}


	public List<WebElement> getSubmit() {
		return submit;
	}
	
	
	
}
