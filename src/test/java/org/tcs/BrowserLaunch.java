package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) {

    launchChrome();
    winMax();
    loadUrl("https://www.etsy.com");
	printTitle();
	printCurrentUrl();
	
	WebElement btnSignin = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
	btnSignin.click();

	 WebElement txtUser = driver.findElement(By.id("email"));
	 fill(txtUser, "greens");
	 
	 WebElement txtPass = driver.findElement(By.id("password"));
	 fill(txtPass, "greens@123");
	 
	 WebElement btnLogin = driver.findElement(By.name("Login"));
	 btnClick(btnLogin);
	 
	}
	
}
