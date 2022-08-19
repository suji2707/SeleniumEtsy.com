package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		driver.manage().window().maximize();
		
		
		TakesScreenshot tk= (TakesScreenshot)driver;
		
		//get the screenshot
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		// mention the desired location
		File des = new File("C:\\Users\\LIBIN\\eclipse-workspace\\SeleniumEtsy\\screenshot\\open.jpg");
		
		//copy from source file to desired location
		FileUtils.copyFile(src, des);
		
	}


}
