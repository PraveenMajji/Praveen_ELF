package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleUrlAndPageSourceOfFlipkartWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		

	}

}
