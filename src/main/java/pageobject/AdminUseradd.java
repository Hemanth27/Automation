package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AdminUseradd {
  public WebDriver driver;
 
  By adduser= By.xpath(".//*[@id='systemUserDiv']/div/a");
  By employeename=By.xpath(".//*[@id='selectedEmployee_value']");
  By selectedone=By.xpath(".//*[@class='angucomplete-row']");
  
  By userclick=By.xpath(".//*[@id='user_name']");
 // By adminrole=By.xpath(".//*[@id='adminrole_inputfileddiv']/div/input");
  By passwordadd=By.xpath(".//*[@id='password']");
  By confirmpass=By.xpath(".//*[@id='confirmpassword']");
  
  By save=By.xpath(".//*[@id='systemUserSaveBtn']");
  
  
  public AdminUseradd(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
  
  public WebElement getadderuser()
  {
	  return driver.findElement(adduser);
  }
  
 
  public WebElement getemployeename()
  {
	  return driver.findElement(employeename);
  }
  
  public WebElement getselectedone()
  {
	  return driver.findElement(selectedone);
  }
  
  
  
  public WebElement getuserclick()
  {
	  return driver.findElement(userclick);
  }
  
  
  
  public WebElement getpasswordadd()
  {
	  return driver.findElement(passwordadd);
  }
  
  public WebElement getconfirmpass()
  {
	  return driver.findElement(confirmpass);
  }
  
  public WebElement getsave()
  {
	  return driver.findElement(save) ;
  }
  
  
  
}
