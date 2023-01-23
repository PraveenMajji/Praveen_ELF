package workingWithTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingDependOnMethod {
	@Test
	public void register() {
		Reporter.log("From register",true);
	}
/*	@Test(dependsOnMethods = {"createAccount","modify"})
	public void delete() {
		Reporter.log("From Delete",true);
	}*/
	@Test(dependsOnMethods = {"register","createAccount"})
	public void amountTransfer() {
		Reporter.log("From Amount",true);
	}
	@Test
	public void createAccount() {
		Reporter.log("From Create",true);
	}
	/*@Test(dependsOnMethods = "createAccount")
	public void modify() {
		int a=1/0;
		Reporter.log("From Modify",true);
	}*/

	
}
