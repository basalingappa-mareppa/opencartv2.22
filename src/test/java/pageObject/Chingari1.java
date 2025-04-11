package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
  
public class Chingari1 {
	WebDriver driver;
	public Chingari1(WebDriver driver)
	{
		this.driver=driver;
	}
		By otp1=By.xpath("//input[@type='text'][1]");
		By otp2=By.xpath("//input[@type='text'][2]");
		By otp3=By.xpath("//input[@type='text'][3]");
		By otp4=By.xpath("//input[@type='text'][4]");
		By otp5=By.xpath("//input[@type='text'][5]");
		By otp6=By.xpath("//input[@type='text'][6]");
		By clcik=By.xpath("//button[text()='Submit & Verify']");
		
		//action methodss
		
		
		public void setotp11(String otp)
		{
			driver.findElement(otp1).sendKeys(otp);
		}
		public void setotp2(String otp21)
		{
			driver.findElement(otp2).sendKeys(otp21);
		}
		public void setotp3(String otp31)
		{
			driver.findElement(otp3).sendKeys(otp31);
		}
		public void setotp4(String otp41)
		{
			driver.findElement(otp4).sendKeys(otp41);
		}
		public void setotp5(String otp51)
		{
			driver.findElement(otp5).sendKeys(otp51);
		}
		public void setotp6(String otp61)
		{
			driver.findElement(otp6).sendKeys(otp61);
		}
		public void tap()
		{
			driver.findElement(clcik).click();
		}
	}
