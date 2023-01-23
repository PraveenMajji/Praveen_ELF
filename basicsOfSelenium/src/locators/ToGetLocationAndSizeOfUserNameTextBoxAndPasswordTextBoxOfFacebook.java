package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetLocationAndSizeOfUserNameTextBoxAndPasswordTextBoxOfFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.id("pass"));
		Dimension userNameTbSize = userName.getSize();
		Dimension passwordTbSize = password.getSize();
		Point usernameTbLocation = userName.getLocation();
		Point passwordTbLocation = password.getLocation();
		System.out.println("location of Username TextBox is = "+usernameTbLocation);
		System.out.println("Size of Username textBox is = "+userNameTbSize);
		System.out.println("location of  Password TextBox is ="+passwordTbLocation);
		System.out.println("Size of Password TextBox is = "+passwordTbSize);
		double minGap=0.03;
		int xlocationOfUsernameTextBox = usernameTbLocation.getX();
		int xlocationOfPasswordtextBox = passwordTbLocation.getX();
		int yLocationOfUsernameTextBox = usernameTbLocation.getY();
		int yLocationOfpasswordtextBox = passwordTbLocation.getY();
		int xLocationPlusWidthOfUsernameTextBox = userNameTbSize.getWidth()+xlocationOfUsernameTextBox;
		int xLocationPlusWidthOfPasswordTextBox = passwordTbSize.getWidth()+xlocationOfPasswordtextBox;
		int ylocationPlusHeightOfUsernameTextBox=userNameTbSize.getHeight()+yLocationOfUsernameTextBox+(int)minGap;
		int ylocationPlusHeightOfPasswordTextBox = passwordTbSize.getHeight()+yLocationOfpasswordtextBox+(int)minGap;
		System.out.println("Ylocaton of Username textBox  is = "+ylocationPlusHeightOfUsernameTextBox);
		System.out.println("Ylocation of Password textbox is = "+ylocationPlusHeightOfPasswordTextBox);
		if(ylocationPlusHeightOfPasswordTextBox<=ylocationPlusHeightOfPasswordTextBox) {
			System.out.println("No Overlapping");
		}
		else {
			System.out.println("Overlapping");
		}
		//Left Alignment Check
		if(xlocationOfUsernameTextBox==xlocationOfPasswordtextBox) {
			System.out.println("Username Text field and Password text field is alligned properly");
		}
		else {
			System.out.println("Username Text field and Password text field is not  alligned properly");
		}
		//Right Allignment check
		if(xLocationPlusWidthOfPasswordTextBox==xLocationPlusWidthOfUsernameTextBox) {
			System.out.println("Username Text field and Password text field is alligned properly");
		}
		else {
			System.out.println("Username Text field and Password text field is not  alligned properly");
		}
		
	}

}
