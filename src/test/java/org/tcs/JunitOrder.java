package org.tcs;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class JunitOrder extends BaseClass{
	
	@BeforeClass
	public static void BrowserLaunch() {
		launchChrome();
		winMax();
			}
	
    @Before
    public void startTime() {
    loadUrl("https://www.etsy.com");
    Date d= new Date();
    System.out.println(d);
	}
	
    //Valid username and invalid password
	@Test
	public void tc1() throws IOException, InterruptedException {
    LoginPojo l = new LoginPojo();
    fill(l.getTxtUser(), getData(1, 0));
    fill(l.getTxtPass(), getData(1, 1));
    btnClick(l.getBtnLogin());
    Thread.sleep(2000);
	}

	//Valid username and valid password
		@Test
		public void tc2() throws IOException, InterruptedException {
	    LoginPojo l = new LoginPojo();
	    fill(l.getTxtUser(), getData(2, 0));
	    fill(l.getTxtPass(), getData(2, 1));
	    btnClick(l.getBtnLogin());
	    Thread.sleep(2000);
	    String current= driver.getCurrentUrl();
	    Assert.assertTrue("Verify the current Url of incorrect page", current.contains("greens"));
	    System.out.println("TEST 2 IS PASSED");
		}
	

	@After
	public void endTime() {
	 Date d= new Date();
	 System.out.println(d);
	}
	@AfterClass
	public static void Browserclose() {
		Browserclose();

	}
		
}
