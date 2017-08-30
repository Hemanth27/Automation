package Hrm;

import org.testng.annotations.Test;

import pageobject.AdminPageFlow;

public class AdminPageFlowTest extends BaseTest{

	@Test
	public void flowDetails()
	{
		AdminPageFlow flow= new AdminPageFlow(driver);
		
	}
}
