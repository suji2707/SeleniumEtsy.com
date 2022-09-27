package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	//Non-Parameterized Constructor
	public LoginPojo() {
      PageFactory.initElements(driver, this);
	
	}
	
	// private WebElement
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(name="Login")
	private WebElement btnLogin;
	

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getSearch() {
		return getSearch();
	}
	 
	
	
	
	

}
