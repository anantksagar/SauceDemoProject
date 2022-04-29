package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import sauceDemoProjectTestClassPOMWithPF.BrowserLaunchImplementation;

public class Screenshot extends BrowserLaunchImplementation{

	WebDriver w;
	
	String path = "B:\\Velocitytraining\\Setup\\Screenshot\\Sauce_Demo_Screenshot\\saucedemosceenshot";

	public void screen() {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd_hhmmss");
		String s = sdf.format(d);
		TakesScreenshot ts = ((TakesScreenshot)super.w);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+s+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
