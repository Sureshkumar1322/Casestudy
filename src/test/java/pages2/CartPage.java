package pages2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase{
	By addtocart = By.xpath("//a[text()='Add to cart']");
	By cartbutton = By.xpath("//a[@id='cartur']");
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickaddToCart() {
		driver.findElement(addtocart).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Alert alert = driver.switchTo().alert();
		 alert.accept();

	}
	public ProductPage cartbutton() {
		driver.findElement(cartbutton).click();
		return new ProductPage();
		
	}

}
