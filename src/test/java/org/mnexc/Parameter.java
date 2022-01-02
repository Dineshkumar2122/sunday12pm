package org.mnexc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends BaseClassLibGlobal {
	@Parameters({"Username","Password"})
	@Test
	private void tc1(String user,String pass) {
		WebElement username = locatorsById("email");
		send(username, user);
	
	WebElement password = driver.findElement(By.id("pass"));
	send(password,pass );

	}
	@Test
	private void tc2() {
System.out.println("test2");
	}
	@BeforeClass
	private void bfrclass() {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximizeWindow();
	}
}
