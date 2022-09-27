package testng.com;

import java.io.IOException;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class TestNg extends BaseClass{
	
	@BeforeClass
	private void browser() {
    System.out.println("Chrome");
	}
	
	@AfterClass
	private void browserClose() {
    System.out.println("close");
	}

	@Test
	public void tc3() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(), getData(2, 0));
	    fill(l.getTxtPass(), getData(2, 1));
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
		}

	@Test
	public void tc1() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(), getData(0, 0));
	    fill(l.getTxtPass(), getData(1, 1));
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
		}
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(), getData(1, 0));
	    fill(l.getTxtPass(), getData(1, 1));
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
		}
	
	@BeforeMethod
	private void startTime() {
    System.out.println(new Date());
    loadUrl("https://www.etsy.com");
	}
	
	@AfterMethod
	private void endTime() {
	System.out.println(new Date());
    System.out.println("End");
	}
}
