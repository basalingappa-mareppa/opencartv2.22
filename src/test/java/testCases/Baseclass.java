package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Baseclass {
	
	public Logger logger;
    public WebDriver driver;
    public Properties p;
	
	@BeforeClass(groups= {"sanity","Master","Regression"})
	@Parameters({"os","browser"})
	public void setup(String os ,String br) throws IOException
	{
		
		//loading the config.properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		logger=LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge"  :  driver=new EdgeDriver(); break;
		case "firfox": driver=new FirefoxDriver(); break;
		default : System.out.println("invalid browser name");return;
		
		}
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
//	@SuppressWarnings("deprecation")
//	public String geraterandomstring()
//	{
//		String rondommstring=RandomStringUtils.randomAlphabetic(5);
//		return rondommstring;
//	}
//	
//	
//	public String randonnumber()
//	{
//		@SuppressWarnings("deprecation")
//		String randomalphnumeric=RandomStringUtils.randomAlphanumeric(10);
//		return randomalphnumeric;
//	}
//	
//	
//	public String bothstring_and_number()
//	{
//		String rondommstring1=RandomStringUtils.randomAlphabetic(5);
//		String randomalphnumeric2=RandomStringUtils.randomAlphanumeric(10);
//		return rondommstring1+randomalphnumeric2;
//	}

}
