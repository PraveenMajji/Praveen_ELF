package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheAttributeOfParticularElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To get the attribute value
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		String attributeValue = driver.findElement(By.xpath("//a[text()='Outdoor']")).getAttribute("href");
		System.out.println(attributeValue);
		
		
	}

}
