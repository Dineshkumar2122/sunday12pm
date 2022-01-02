package org.mnexc;

import org.openqa.selenium.WebElement;

public class AdactinhotelappLogin extends BaseClassLibGlobal{

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
	}

}
