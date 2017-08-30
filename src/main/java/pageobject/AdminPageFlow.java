package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminPageFlow {

	public WebDriver driver;
	By admin=By.xpath(".//*[@id='menu_admin_viewAdminModule']/a");
	By usermanage=By.xpath(".//*[@id='menu_admin_viewAdminModule']/div/ul/li[1]/a");
	By user= By.xpath(".//*[@id='menu_admin_viewAdminModule']/div/ul/li[1]/div/ul/li[1]/a");
	
	
	
	public AdminPageFlow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
}
