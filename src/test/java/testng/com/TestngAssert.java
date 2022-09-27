package testng.com;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.LoginPojo;

public class TestngAssert extends LoginPojo{
	@BeforeClass
	private void browser() {
		launchChrome();
		winMax();
		}
	@AfterClass
	private void browserclose() {
		browser();
	}
	        //soft assert
		@Test
		private void tc3() throws InterruptedException {
			SoftAssert s=new SoftAssert();
			s.assertTrue(true, "testing");
			LoginPojo p=new LoginPojo();
			fill(p.getSearch(),"clocks");
			webeleclick(p.getBtnLogin());
			Thread.sleep(3000);
			
			
			System.out.println("test3");
			
		}
		private void webeleclick(WebElement btnLogin) {
				// TODO Auto-generated method stub
				
			}
		//hard assert
		@Test
		private void tc2() {
			Assert.assertTrue(true);
			
			System.out.println("test2");
		}
		//SoftAssert to AssertAll
		@Test
		private void tc1() throws InterruptedException {SoftAssert s=new SoftAssert();
		s.assertTrue(true, "testing");
		LoginPojo p=new LoginPojo();
		fill(p.getSearch(),"Dresses");
		webeleclick(p.getBtnLogin());
		Thread.sleep(3000);
		
			
			System.out.println("test1");
			System.out.println("");
			s.assertAll();
			System.out.println("success");
		}
		
		@BeforeMethod
		private void start() {
			System.out.println(new Date());
			loadUrl("https://www.etsy.com");
		}
		@AfterMethod
		private void end() {
			System.out.println(new Date());
			
		}
		
	


}
