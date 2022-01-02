package org.mnexc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends BaseClassLibGlobal {

	private void loginpojo() {
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(id="email")
	private WebElement txtusername;
	@FindBy (id="pass")
	private WebElement txtpass;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}*/
	
	
	
	@FindBys({@FindBy(id="raja"),
		@FindBy(xpath="//input[@type='t']")})
	
	private WebElement txtusername;
	
	@FindAll({@FindBy(id="passlkoi"),@FindBy(name="pakjhjss")})
	private WebElement password;

	public WebElement getUsername() {
		return txtusername;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
	
	}


