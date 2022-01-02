package org.mnexc;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class PomMain extends BaseClassLibGlobal {

	public static void main(String[] args)throws IOException {
		
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximizeWindow();
		
		
		
		PomClass p=new PomClass();
		WebElement txtusername = p.locatorsById("email");
		send(txtusername, "manjunathan");
		
		WebElement password =p.locatorsbyName("pass");
		send(password, "rajakumar");
		
			
	}

}