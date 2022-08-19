package org.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
private static Object down;

public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		driver.manage().window().maximize();
		
	WebElement txtUser = driver.findElement(By.xpath("//input[contains@placeholder,'Enter your email')]"));
	txtUser.sendKeys("greens");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("argument[0].ScrollIntoView(false)", down);
	
	   
		
		
}
}