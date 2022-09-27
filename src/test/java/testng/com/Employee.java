package testng.com;

import org.testng.annotations.Test;

public class Employee {

                       //OR Operator
	@Test(groups={"sanity","cricket"})
	private void tc4() {
System.out.println("Test 4");
	}

	@Test(groups="smoke")
	private void tc2() {
System.out.println("Test 2");
	}
	
	@Test(groups={"regression","cricket"})
	private void tc1() {
System.out.println("Test 1");
	}
	
	@Test(groups="regression")
	private void tc3() {
System.out.println("Test 3");
	}
}
