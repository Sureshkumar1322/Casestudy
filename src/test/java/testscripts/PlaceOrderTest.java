package testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.TestBase;
import pages.HomePage;
import pages.ItemPage;
import pages.ShoppingCartpage;

public class PlaceOrderTest extends TestBase {
	HomePage homepage;
	ItemPage itempage;
	ShoppingCartpage shoppingcart;
	ExtentReports extentreports;
	ExtentSparkReporter spark;
	ExtentTest extenttest;

	@BeforeTest
	public void launchapp() {
		initialize("url");
		
		extentreports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html");
		extentreports.attachReporter(spark);
	}

	@Test(priority = 1)
	public void searchtest() {
		extenttest = extentreports.createTest("homepage");
		homepage = new HomePage();
		itempage = homepage.searchItem("parry hotter");
		/*Avoiding instance we can return a page in pervious page*/
		itempage.viewitemDetails();
		itempage.addItems();

	}

	@Test(priority = 2)
	public void checkoutkart() {
		shoppingcart = new ShoppingCartpage();
		shoppingcart.checkout();
	}
	@AfterTest
	public void tearDown() {
		driver.close();

	}
}
