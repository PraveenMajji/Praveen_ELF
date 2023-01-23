package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheToolTipText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedTooltip="Do not select if this computer is shared";
		 WebElement tooltip = driver.findElement(By.id("keepMeLoggedInCaptionContainer"));
		 String actual = tooltip.getAttribute("title");
		System.out.println(actual);
		System.out.println((expectedTooltip.equals(actual)));

	}

}
