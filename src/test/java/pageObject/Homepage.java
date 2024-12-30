package pageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends Basepage{

	public Homepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='gh-ac']") 
	WebElement search;
	
	@FindBy(xpath="//select[@id='gh-cat']") 
	WebElement dropdown;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement searchcon;
	
	@FindBy(xpath="//img[@alt='Readers Digest Condensed Books Lot of 10 - Random - Decorative Covers - Reading']") 
	WebElement selectbooks;
	//span[text()='Add to cart']
	@FindBy(xpath="//span[text()='Add to cart']") 
	WebElement addcart;
	
	//span[normalize-space()='My Account']
	public void searchcontent()
	{
		search.sendKeys("books");
		//my_account.submit();
		//Actions cs=new Actions(driver);
		//cs.moveToElement(search).click().perform();
	}
	
	public void dropdownsel()
	{
		dropdown.click();
		Select sl=new Select(dropdown);
		sl.selectByValue("267");
		//Register.submit();
	}
	
	public void button()
	{
		searchcon.click();
	}
	
	public void selectthebooks()
	{
		selectbooks.click();
	}
	
	public void addbookscart()
	{
		Set<String>windows=driver.getWindowHandles();
		List<String> windowlist=new ArrayList<>(windows);
		String parent=windowlist.get(0);
		String childwindow=windowlist.get(1);
		driver.switchTo().window(childwindow);
		addcart.click();

		
	}
}
