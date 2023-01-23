package webDriverMethods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSizeAndPostionOfTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.udemy.com/courses/free/");
		Dimension sizeOfTheBrowser=driver.manage().window().getSize();
		int heightOfTheBrowser=sizeOfTheBrowser.getHeight();
		int widthOfTheBrowser=sizeOfTheBrowser.getWidth();
		System.out.println(heightOfTheBrowser);
		System.out.println(widthOfTheBrowser);
		 Point positionOfTheBrowser=driver.manage().window().getPosition();
		 System.out.println(positionOfTheBrowser.getX());
		 System.out.println(positionOfTheBrowser.getY());
		
		
		

	}

}
