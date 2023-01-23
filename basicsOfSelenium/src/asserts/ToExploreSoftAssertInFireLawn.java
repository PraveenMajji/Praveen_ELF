package asserts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToExploreSoftAssertInFireLawn {
	@Test
	public void loginPage() {
		String expectedTitle="Firelawn";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,12);
		driver.get("https://firelawn.com/user-signin");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expectedTitle,driver.getTitle(), "Login page is not Displayed");
		Reporter.log("Login  page Displayed");
		WebElement emailTextBox = driver.findElement(By.id("fl_email"));
		WebElement loginButton = driver.findElement(By.id("fl_login"));
		loginButton.click();
		System.out.println(emailTextBox.getCssValue("border"));
		sa.assertEquals(emailTextBox.getCssValue("0px none rgba(0, 0, 0, 0.87)"), "0px none rgba(0, 0, 0, 0.87)", "Border color mismatched");
		sa.assertAll();
	}
}
