package testCases;

import org.testng.annotations.Test;

import pageObject.Addcart;

public class Addcart1 extends Baseclass{
	
	
	@Test
	public void addcartt()
	{
		logger.info("starting the test case forthe addcart");
		
		Addcart add=new Addcart(driver);
		add.selectthebooks();
        add.addbookscart();
		
	}
	

}
