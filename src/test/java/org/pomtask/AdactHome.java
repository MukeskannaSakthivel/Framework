package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactHome extends BaseClass {
	public AdactHome() {
		PageFactory.initElements(driver, this);
	
	}
	@CacheLookup
	@FindBy(id="username")
	private WebElement username;
	
	@CacheLookup
	@FindBy(id="password")
	private WebElement password;
	
	@CacheLookup
	@FindBy(id="login")
	private WebElement login;
	
	@CacheLookup
	@FindBy(id="location")
	private WebElement location;
	
	@CacheLookup
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@CacheLookup
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@CacheLookup
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@CacheLookup
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@CacheLookup
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@CacheLookup
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@CacheLookup
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	
	@CacheLookup
	@FindBy(id="Submit")
	private WebElement search;
	
	@CacheLookup
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	
	@CacheLookup
	@FindBy(id="continue")
	private WebElement cont;
	
	@CacheLookup
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@CacheLookup
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@CacheLookup
	@FindBy(id="address")
	private WebElement address;
	
	@CacheLookup
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	
	@CacheLookup
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@CacheLookup
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@CacheLookup
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@CacheLookup
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@CacheLookup
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	@CacheLookup
	@FindBy(name="order_no")
	private WebElement orderNo;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
	
	
	
}
