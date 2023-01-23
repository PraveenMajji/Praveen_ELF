package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCodeOfThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.samsung.com/in/smartphones/?product1=sm-g781bzggins&product2=&product3=sm-s908ezkhinu&cid=in_paid_ppc_google_allproducts_none_allproducts-eshop-bau-dsa_text_20200105_17924215676-140077037736---614139100219-dsa-546668199249-1ur-501336l-2022");
		String sourceCodeOfPage=driver.getPageSource();
		System.out.println(sourceCodeOfPage);
	}

}
