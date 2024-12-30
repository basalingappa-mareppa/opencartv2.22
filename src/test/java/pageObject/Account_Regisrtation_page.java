package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Regisrtation_page extends Basepage{

	public Account_Regisrtation_page(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement frist_name;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement last_name;
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	@FindBy(xpath="//input[@id='input-password']") WebElement password;
	@FindBy(xpath="//input[@name='agree']") WebElement check;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement continu;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement sucess;
	
	
	public void frstname(String fname)
	{
		frist_name.sendKeys(fname);
	}
	
	public void lname(String lname)
	{
		last_name.sendKeys(lname);
	}
	
	public void email(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void pass(String poss)
	{
		password.sendKeys(poss);
	}
	
	public void check()
	{
		check.click();
	}
	
	public void conti()
	{
		continu.click();
	}
	
	public String getconfirmation()
	{
		try
		{
			return (sucess.getText());
		}catch
			(Exception e)
			{
				return (e.getMessage());
			}
		}
	}
