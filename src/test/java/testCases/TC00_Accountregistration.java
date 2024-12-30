package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Addcart;
import pageObject.Homepage;

public class TC00_Accountregistration extends Baseclass{

	@Test(groups={"sanity","Master"})
	public void verifiy_account_registration()
	{
		logger.info("starting the verify test case and the this");
		try
		{
		Homepage hp=new Homepage(driver);
		hp.searchcontent();
        hp.dropdownsel();
        hp.button();
       // hp.selectthebooks();
       // hp.addbookscart();
		}
		catch(Exception e)
		{
			logger.error("testfail");
			logger.debug("debug logs...");
			AssertJUnit.fail();
		}
		logger.info("finishing the testcases execution");

	}
	
}
