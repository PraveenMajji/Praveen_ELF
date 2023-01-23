package pomDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHomePage {
	public BusHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="One way")
	public WebElement oneWayLink;
	
	@FindBy(linkText="Round trip")
	public WebElement roundTripLink;
	
	@FindBy(linkText="Packages")
	public WebElement packageLink;
	
	@FindBy(id="src")
	private WebElement fromtextField;
	
	@FindBy(id="dest")
	private WebElement toTextField;
	
	@FindBy(id="departure")
	private WebElement departureField;
	
	@FindBy(id="return")
	private WebElement returnField;
	
	@FindBy(xpath="(//input[@value='Search Buses' and contains(@class,'search-btn')])[1]")
	private WebElement searchBusesButton;
	
	@FindBy(xpath="//li[.='Bangalore']")
	private  WebElement bangaloreSearchSuggestion;
	
	@FindBy(xpath="//li[.='Goa']")
	private WebElement goaSearchSuggestion;
	
	@FindBy(xpath="//li[.='Chennai']")
	private WebElement chennaiSearchSuggestion;
	
	

}
