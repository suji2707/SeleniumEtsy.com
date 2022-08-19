package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		//configure the browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		//launch the Site
	    driver.get("https://www.etsy.com/");
	    //Maximize
	    driver.manage().window().maximize();
	    
	   //title of my page
		String title=driver.getTitle();
		System.out.println(title);
	  	
	   //getting current url
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);

		WebElement click=driver.findElement(By.xpath("//a[text()='Go to Help Center']"));
		click.click();
		Thread.sleep(3000);


}
}