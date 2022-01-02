package org.mnexc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class FacebookTestng extends BaseClassLibGlobal {
	public SoftAssert s;
	@BeforeClass
	private void browser() throws InterruptedException {
		getDriver();
		loadUrl("https://www.instagram.com/?hl=en");
		maximizeWindow();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
	}
	@Test
	private void tc1() {
		WebElement user = locatorsbyName("username");
		user.sendKeys("rajaraman");
		s=new SoftAssert();
		s.assertEquals(user.getAttribute("value"), "rajaraman");
		
		WebElement pass = locatorsbyName("password");
		pass.sendKeys("google");
		s.assertEquals(pass.getAttribute("value"), "google");
		s.assertAll();
		
	}
	@Test
	private void tc02() {
		s=new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		s.assertTrue(title.contains("Instagram"));
		s.assertAll();
	}
	@AfterClass
	private void clo() {
		driver.quit();
	}
	

	}


