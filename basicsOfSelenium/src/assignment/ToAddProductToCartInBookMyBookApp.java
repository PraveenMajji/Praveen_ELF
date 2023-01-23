package assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddProductToCartInBookMyBookApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int var=sc.nextInt();
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookmybook.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("srchtxtsticky")).sendKeys("Fictional and Non-Fictional Books",Keys.ENTER);
		Thread.sleep(5000);
		String costOfBook = driver.findElement(By.xpath("(//span//span[@class='amount'])["+var+"]")).getText();
		System.out.println(costOfBook);
		costOfBook=costOfBook.replace(",", "");
		costOfBook=costOfBook.trim();
		int inRupees = Integer.parseInt(costOfBook);
		if(inRupees<500) {
			driver.findElement(By.xpath("(//span[text()='Add'])["+var+"]/..")).click();
		}
		else {
			System.out.println("Too Pricey");
		}
		
	}

}
