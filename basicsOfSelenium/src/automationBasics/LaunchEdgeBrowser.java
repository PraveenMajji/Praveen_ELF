package automationBasics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./drivers//msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();

	}

}
