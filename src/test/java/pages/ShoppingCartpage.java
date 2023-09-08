package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartpage extends TestBase {
	@FindBy(css = "div.cart>button.call-to-action")
	WebElement checkoutbtn;

	public ShoppingCartpage() {
		PageFactory.initElements(driver, this);
	}

	public void checkout() {
		checkoutbtn.click();
	}

}
