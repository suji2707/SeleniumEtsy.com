package org.selenium;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {

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
		
		//For Robot class object creation
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		//To get parent window id
		String parentId=driver.getWindowHandle();
		
		//To get all window id 
		Set<String> allwindowid=driver.getWindowHandles();
		
		
		for (String each : allwindowid) {
			if(!parentId.equals(each)) {
		    driver.switchTo().window(each);
				
			}			
}
	}

	private void keyRelease(int vkDown) {
		
	}

	private void keyPress(int vkDown) {
		
	}
}
