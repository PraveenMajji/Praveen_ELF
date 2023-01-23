package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Step: creating input Stream type object
		File absPath=new File("./testData/configuration2.properties");
		FileInputStream fis=new FileInputStream(absPath);
		
		//Step:2 Creating object of file type
		Properties properties=new Properties();
		properties.load(fis);
		
		//Step:3 Reading methods
		
		String key = properties.get("ChromeBrowserKey").toString();
		String value = properties.get("ChromeDriverPath").toString();
		String url = properties.get("url").toString();
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);

	}

}
