package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static String getscreenpath(WebDriver driver) throws IOException {
	TakesScreenshot screen = (TakesScreenshot)driver;
	File src = screen.getScreenshotAs(OutputType.FILE);
	String srcFile = System.getProperty("user.dir")
			+ "webdriversampleValeo\\screenshot"
			+System.currentTimeMillis()
			+ ".png";
	File dest = new File(srcFile);
	try {
		FileUtils.copyFile(src, dest);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return srcFile;
	}
}
