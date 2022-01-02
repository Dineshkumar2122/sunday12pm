package org.mnexc;

import org.openqa.selenium.WebElement;

public class SearchHotel extends BaseClassLibGlobal {

	public static void main(String[] args) {
		
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		
		WebElement user = locatorsById("username");
		send(user, "Yuvashree");
		
		WebElement pass = locatorsById("password");
		send(pass, "Test@1234");
		
		WebElement log = locatorsById("login");
		
		log.click();

		WebElement locat = locatorsById("location");
		
		selectByValue(locat, "London");
		
		WebElement hote = locatorsbyName("hotels");
		selectByValue(hote, "Hotel Hervey");
		
		WebElement roomtype = locatorsbyName("room_type");
		selectByValue(roomtype, "Deluxe");
		
		WebElement noofrooms = locatorsbyName("room_nos");
		selectByValue(noofrooms, "3");
		
	//	WebElement datefrom = locatorsbyName("datepick_in");
	//	selectByValue(datefrom, "23/12/2021");
		
		
	//	WebElement dateto = locatorsbyName("datepick_out");
	//	selectByValue(dateto, "24/12/2021");
		
		
		WebElement adults = locatorsbyName("adult_room");
		selectByValue(adults, "3");
		
		WebElement child = locatorsById("child_room");
		selectByValue(child, "4");
			
		WebElement subm = locatorsbyName("Submit");
		subm.click();
		
		
		//Select Hotel
		
		WebElement selhotel = locatorsbyName("radiobutton_0");
		selhotel.click();
		
		WebElement conti = locatorsbyName("continue");
		conti.click();
	
		//Book a hotel
		
		WebElement firstname = locatorsbyName("first_name");
		send(firstname, "krishna");
		
		WebElement lastname = locatorsbyName("last_name");
	     send(lastname, "kumar");
	
	WebElement address = locatorsById("address");
	send(address, "74 omr street thoraipakkam,chennai 600096");
	
	
	WebElement cardno = locatorsbyName("cc_num");
	send(cardno, "0987876543098776");
	
	WebElement cardtype = locatorsById("cc_type");
	selectByindex(cardtype, 2);
	
	WebElement expmnth = locatorsbyName("cc_exp_month");
	selectByindex(expmnth, 12);
	
	WebElement expyr = locatorsbyName("cc_exp_year");
	selectByindex(expyr, 12);
	
	WebElement cvv = locatorsById("cc_cvv");
	send(cvv, "123");
	
	WebElement booknow = locatorsbyName("book_now");
	booknow.click();
	
	
	
	
	
	}
	

}
