package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public WebDriver driver;
 
 By username=By.cssSelector("input[id='txtUsername']");
 By pwd=By.cssSelector("input[id=txtPassword]");
 By signinbtn=By.cssSelector("#btnLogin");
 
 By logoutmenu=By.cssSelector("#user-dropdown");
 By logout = By.xpath(".//*[@id='user_menu']/li[4]/a");
 
 public LoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 this.driver=driver;
 }
 
 public WebElement getusername()
 {
	 return driver.findElement(username) ;
 }
 
 public WebElement getpassword()
 {
	 return driver.findElement(pwd);
 }

 public WebElement getsigninbtn()
 {
	 return driver.findElement(signinbtn);
 }
 
 public WebElement getlogoutmenu()
 {
	 return driver.findElement(logoutmenu);
 }
 
 public WebElement getlogout()
 {
	 return driver .findElement(logout);
 }

}
