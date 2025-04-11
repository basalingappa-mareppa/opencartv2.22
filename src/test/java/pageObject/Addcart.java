package pageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addcart extends Basepage{

	public Addcart(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//img[@alt='Readers Digest Condensed Books Lot of 10 - Random - Decorative Covers - Reading']") 
	WebElement selectbooks;
	//span[text()='Add to cart']
	@FindBy(xpath="//span[text()='Add to cart']") 
	WebElement addcart;
	
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
