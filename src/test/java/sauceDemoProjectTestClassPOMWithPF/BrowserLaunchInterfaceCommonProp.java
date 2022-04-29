package sauceDemoProjectTestClassPOMWithPF;

public interface BrowserLaunchInterfaceCommonProp {
	// Declaration
	String key = "webdriver.chrome.driver";
	String path = "B:\\Velocitytraining\\Setup\\Driver\\Chrome_Driver\\chromedriver.exe";
	String url = "https://www.saucedemo.com/";

	void launchBrowser();
}
