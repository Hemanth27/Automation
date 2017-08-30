package Hrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import resources.BaseClass;

public class BaseTest extends BaseClass{

	@BeforeTest
	public void basePagenavigation() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fip=new FileInputStream("/home/pace/Music/ProjectSelenium/OrangeHrm/src/main/java/resources/data.properties");
		prop.load(fip);
		String urlbrowser=prop.getProperty("url");
		driver=initializeBrowser();
		driver.get(urlbrowser);
	}
	
	
	@AfterTest
	public void closebrowser()
	{
		//System.out.println("Closing the Browser");
		driver.close();
		driver=null;
	}

}

