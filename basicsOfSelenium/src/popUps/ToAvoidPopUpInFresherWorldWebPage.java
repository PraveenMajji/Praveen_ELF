package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidPopUpInFresherWorldWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("file-upload")).sendKeys("E:\\MY DOCC/01 (1).jpg");
		Alert alertRef = driver.switchTo().alert();
		System.out.println(alertRef.getText());
		alertRef.accept();
		driver.findElement(By.id("file-upload")).sendKeys("E:\\MY DOCC/10th marks sheet.pdf");
		

	}

}
