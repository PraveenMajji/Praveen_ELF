package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleAutoItScriptOFFreshersWorldWebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		Actions action=new Actions(driver);
		 driver.findElement(By.xpath("//div[@id=\"qq-template\"]"));
		 action.click().perform();
		Runtime.getRuntime().exec("./AutoITPrograms//freshersWorld.exe");

	}

}
