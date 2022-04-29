package sauceDemoProjectTestClassPOMWithPF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchImplementation implements BrowserLaunchInterfaceCommonProp {

	 protected static WebDriver w;

	public void launchBrowser() {
		System.setProperty(key, path);
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().deleteAllCookies();
		//System.out.println("Launching The Browser");
		w.get(url);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println("Entering The Login Credintial");
	}
}
