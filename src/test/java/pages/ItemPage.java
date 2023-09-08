package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ItemPage extends TestBase {
	@FindBy(css = "ul li.preview")
	WebElement itemicon;
	@FindBy(css = "div.detail-wrapper>button.call-to-action")
	WebElement addtocart;

	public ItemPage() {
		PageFactory.initElements(driver, this);
	}

	public void viewitemDetails() {
		itemicon.click();
	}

	public void addItems() {
		addtocart.click();
	}
}
