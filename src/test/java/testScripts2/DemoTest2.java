package testScripts2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages2.CartPage;
import pages2.Homepage1;
import pages2.ProductlistPage;

public class DemoTest2 extends TestBase{
	Homepage1 homepage;
	CartPage cart;
	ProductlistPage product;
	
	@BeforeTest
	public void launchapp() {
		initialize("url2");
		
	}
	@Test
	public void userLogin() {
		homepage = new Homepage1();
		homepage.loginButton();
		product=homepage.usernamepassword();
		cart=product.clickmobile();
		cart.clickaddToCart();
		
	
		
		
		
	}
}
