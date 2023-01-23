package automationBasics;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOperaBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver", "./drivers//operadriver.exe");
		OperaDriver driver=new OperaDriver();
		

	}

}
