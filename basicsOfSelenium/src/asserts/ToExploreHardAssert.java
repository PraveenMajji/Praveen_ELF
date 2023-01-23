package asserts;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Max;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToExploreHardAssert {
	@Test
	public void loginAsAdmin() {
		String expectedTitle="actiTIME - Login";
		String userNameData="admin";
		String passwordData="manager";
		String expectedHomePage="";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,  "Login Page is Not Displayed");
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys(userNameData);
		Assert.assertEquals(userName.getAttribute("value"), userNameData, "Invalid User");
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys(passwordData);
		Assert.assertEquals(passwordData, password.getAttribute("value"), "Invalid password");
		driver.findElement(By.id("loginButton")).click();
		
	}

}