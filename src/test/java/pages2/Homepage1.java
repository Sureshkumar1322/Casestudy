package pages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Homepage1 extends TestBase {
	By loginbutton = By.xpath("//a[@id='login2']");
	By username = By.xpath("//input[@id='loginusername']");
	By password = By.xpath("//input[@id='loginpassword']");
	By logiloc  = By.xpath("//button[text()='Log in']");
	
	
	public Homepage1() {
		PageFactory.initElements(driver, this);
	}
      public void loginButton() {
    	  driver.findElement(loginbutton).click();
	}
      public ProductlistPage usernamepassword() {
    	  driver.findElement(username).sendKeys("sureshkumar");
    	  driver.findElement(password).sendKeys("Welcome@123456789");
    	  driver.findElement(logiloc).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    	  return new ProductlistPage();
      }
}
