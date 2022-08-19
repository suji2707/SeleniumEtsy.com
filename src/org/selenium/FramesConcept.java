package org.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {
public static void main(String[] args) throws InterruptedException, AWTException  {
		
		//configure the browser
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		//launch the Site
	    driver.get("https://www.etsy.com/");
	    //Maximize
	    driver.manage().window().maximize();
	    
	    WebElement txtEmail = driver.findElement(By.xpath("//input[contains@placeholder,'Enter your email')]"));
		
		//Down casting in javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].scrollIntoView(false)", txtEmail);
		
		//switch into frame
	    driver.switchTo().frame("Go to Help Center");
		
		WebElement GoToCenter = driver.findElement(By.xpath("//a[@class,'wt-mt-xs-2 button wt-btn wt-text-black wt-btn--outline']"));
		GoToCenter.click();
		
		//Come out of frame
		driver.switchTo().defaultContent();
		
		//To check whether we came out of frame
		WebElement search=driver.findElement(By.xpath("//input[@placeholder,'Enter your email]"));
		search.sendKeys("greens");

		
		}

}