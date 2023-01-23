package dropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDeopDownsInFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select daySelect=new Select(dayDropDown);
		System.out.println("Day dropdown:"+daySelect.isMultiple());
		List<WebElement> dayDropdownOptions = daySelect.getOptions();
		for(WebElement ele:dayDropdownOptions) {
			System.out.println(ele.getText()+" ");
		}
		daySelect.selectByIndex(22);
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
		Select monSelect=new Select(monthDropDown);
		List<WebElement> monthDropdownOptions = monSelect.getOptions();
		for(WebElement ele:monthDropdownOptions) {
			System.out.println(ele.getText()+" ");
			
		}
		monSelect.selectByIndex(11);
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		Select yearSelect=new Select(yearDropDown);
		List<WebElement> yearDropdownOptions = yearSelect.getOptions();
		for(WebElement ele:yearDropdownOptions) {
			System.out.println(ele.getText()+" ");
		}
		yearSelect.selectByValue("1998");
		

	}

}
