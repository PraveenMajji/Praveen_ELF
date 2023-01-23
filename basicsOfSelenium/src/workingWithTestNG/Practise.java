package workingWithTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practise {
	@Test(dependsOnMethods = "testCase_001")
	public void testCase_002() {
		
		Reporter.log("2nd executed");
		
	}
	@Test
	public void testCase_001() {
		Reporter.log("1st executed");
		
	}

}
