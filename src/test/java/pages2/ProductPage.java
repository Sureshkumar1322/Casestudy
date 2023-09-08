package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ProductPage extends TestBase {
	By deleteloc  = By.xpath("//a[text()='Delete']");
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
    public void deleteicon() {
    	driver.findElement(deleteloc).click();

	}
}
