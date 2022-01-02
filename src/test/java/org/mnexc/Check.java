package org.mnexc;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Check extends BaseClassLibGlobal {

	public static void main(String[] args) throws IOException {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximizeWindow();

		WebElement username = locatorsById("email");
		send(username, readExcel(0, 0));

		WebElement passwor = locatorsById("pass");
		send(passwor, readExcel(0, 1));

		WebElement btnclk = locatorsbyName("login");
		btnclk.click();

	}

}