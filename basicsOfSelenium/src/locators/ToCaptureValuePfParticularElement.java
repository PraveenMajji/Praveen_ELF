package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureValuePfParticularElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		String attriVal = usernameTextField.getAttribute("value");
		System.out.println(attriVal);
	}

}
