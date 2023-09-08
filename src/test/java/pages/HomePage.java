package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	@FindBy(name = "searchbar")
	WebElement searchbox;

	@FindBy(id = "button-search")
	WebElement searchbutton;

	@FindBy(id = "cart")
	WebElement cartbtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public ItemPage searchItem(String expectedtext) {
		searchbox.sendKeys(expectedtext);
		searchbutton.click();
		return new ItemPage();
	}

	public void viewCart() {
		cartbtn.click();
	}

}
