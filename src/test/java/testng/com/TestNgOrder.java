package testng.com;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class TestNgOrder extends BaseClass {
	
	@BeforeClass
	private void browser() {

     launchChrome();
     winMax();
	}
	
	@AfterClass
	private void browserClose() {
    System.out.println("close");
	}

	@Test(enabled=false)
	private void tc3() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(), getData(2, 0));
	    fill(l.getTxtPass(), getData(2, 1));
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
}
    @Test(groups={"sanity","cricket"})
    private void tc2() throws IOException, InterruptedException {
    	LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(), getData(1, 0));
	    fill(l.getTxtPass(), getData(1, 1));
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
	}
  
    //valid username and valid password
    @Parameters({"cricket", "fruits"})
    @Test
    private void tc1(String s1, String s2) throws IOException, InterruptedException {
    	LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(),s1);
	    fill(l.getTxtPass(), s2);
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
	}
  
    @BeforeMethod
    private void start() {
    	System.out.println(new Date());
 loadUrl("https://www.etsy.com");
 WebElement btnSignin = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
	btnSignin.click();
	WebElement txtUser = driver.findElement(By.name("email"));
	fill(txtUser, "greens");
	 	}
    
    @AfterMethod
    private void end() {
System.out.println(new Date());
	}



}



