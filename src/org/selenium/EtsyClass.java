package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumEtsy\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		WebElement btnsignin = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
	    btnsignin.click();
	    
	    WebElement txtuser = driver.findElement(By.name("email"));
	    txtuser.sendKeys("Greens");
	   
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("Greens@123");
	   
	    WebElement signin = driver.findElement(By.xpath("//button[@value='sign-in']"));
        signin.click();
		
		
		
	}

}
