package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionConcept {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumEtsy\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		WebElement Wedding= driver.findElement(By.xpath("//span[@id=\"catnav-primary-link-10983\"]"));
		
        //create an object for actions class
		
		Actions a = new Actions(driver);
		a.moveToElement(Wedding).perform();
		
		WebElement Partysupplies= driver.findElement(By.xpath("//span[@class='side-nav-item wt-p-xs-0 wt-display-block active']"));
		a.moveToElement(Partysupplies).perform();
		
		WebElement Baking= driver.findElement(By.xpath("//a[@id=\"catnav-l3-10986\"]/text()"));
		a.moveToElement(Baking).click().build().perform();
		
		
		
}
}
