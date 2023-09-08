package pages2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ProductlistPage extends TestBase{
	By samusungmbl = By.xpath("//a[text()='Samsung galaxy s6']");
	
	public ProductlistPage() {
		PageFactory.initElements(driver, this);
	}
   public CartPage clickmobile() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.findElement(samusungmbl).click();
	   return new CartPage();

}
}
