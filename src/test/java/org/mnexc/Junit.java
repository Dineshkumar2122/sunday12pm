package org.mnexc;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	public static WebDriver driver;
	
	@Test
	public void tc1() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("rajaram mohan roie");
		String attribute = user.getAttribute("value");
		Assert.assertEquals("check attribute","rajaram mohan roie" , attribute);
		System.out.println(attribute);
	}
	@Test
	public void tc2() {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234567890");
		String pass = password.getAttribute("value");
		Assert.assertEquals("checkpass", "1234567890", pass);
		System.out.println(pass);
		
	}@Test
	public void tc3() {
		String title = driver.getTitle();
		System.out.println(title);

		//Assert.assertTrue("title", title.equals("facebook"));
		
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
	}
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Before
	public  void before() {
		Date d=new Date();
		System.out.println(d);
		
	}
	
	@After
	public void AfterClass() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public  static void afterClass() {
		driver.quit();
	}
}
