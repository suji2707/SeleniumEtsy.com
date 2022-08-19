package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	

	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		//configure the browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		//launch the Site
	    driver.get("https://www.etsy.com/");
	    //Maximize
	    driver.manage().window().maximize();
	    
	    WebElement btnsignin = driver.findElement(By.xpath("//select[@id='locale-overlay-select-region_code']"));
	    btnsignin.click();
	    	    
	   WebElement dropDown = driver.findElement(By.tagName("select"));
	    
	    Select s = new Select (dropDown);
	    
	  //My drop is multiple or not 

	    boolean a = s.isMultiple();
	    System.out.println(a);
	    
	 // Select the dropdown by value
	    s.selectByValue("FR");
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
}