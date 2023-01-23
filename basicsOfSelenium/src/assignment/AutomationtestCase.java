package assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationtestCase {
		public static void main(String[] args) throws InterruptedException {
			Scanner sc = new Scanner(System.in);
			//User Credentials
			String url = "https://www.firelawn.com/";
			/*String emailId = sc.nextLine();
			String password = sc.nextLine();*/
			String emailId = "pragathi22032000@gmail.com";
			String password = "Pragathi9108@";
			//Step-1 Launch empty browser and to maximize the browser
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Step-2 Enter the valid URL
			driver.get("https://www.firelawn.com/");
			if(url.equals(driver.getCurrentUrl())) {
				System.out.println("We reached to a correct website");
			}
			else {
				System.out.println("URL missmatch");
			}
			//Step-3 Enter Valid Credentials
			driver.findElement(By.id("fl_login_btn")).click();
			driver.findElement(By.id("fl_email")).sendKeys(emailId,Keys.TAB);
			driver.findElement(By.id("fl_password")).sendKeys(password);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			//Step-4 Login success popup should be displayed
			//At the top right corner the popup should come saying successfully logged in
			//driver.close();
		}

	}
