package sauceDemoProjectTestClassPOMWithPF;

import sauceDemoProjectPOMClassWithPF.SauceDemoCheckoutInformationPageClass;
import sauceDemoProjectPOMClassWithPF.SauceDemoHomePageClass;
import sauceDemoProjectPOMClassWithPF.SauceDemoLoginPageClass;
import sauceDemoProjectPOMClassWithPF.SauceDemoLogoutPageClass;
import sauceDemoProjectPOMClassWithPF.SauceDemoOverviewPageClass;
import sauceDemoProjectPOMClassWithPF.SauceDemoYourCartPageClass;
import sauceDemoProjectPOMClassWithPF.sauceDemoCompletePageClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

@Listeners (listeners.Listeners.class)
public class SauceDemoTestClassWithPOMPFTestNG extends BrowserLaunchImplementation {
	SauceDemoTestClassWithPOMPFTestNG s;
	SauceDemoLoginPageClass s1;
	SauceDemoHomePageClass s2;
	SauceDemoLogoutPageClass s3;
	SauceDemoYourCartPageClass s4;
	SauceDemoCheckoutInformationPageClass s5;
	SauceDemoOverviewPageClass s6;
	sauceDemoCompletePageClass s7;
	JavascriptExecutor j;

	@Test
	public void click() throws InterruptedException {
		s2 = new SauceDemoHomePageClass(w);
		s2.verifySauceLabsBikeLight();
		Thread.sleep(2000);
		Thread.sleep(2000);
		//System.out.println("Test Scenario is passed and Successfully clicked");
	}

	@Test
	public void test2() throws InterruptedException {
		j = ((JavascriptExecutor) w);
		s2.verifysauceLabsBackpackadd2cart();
		Thread.sleep(2000);
		s2.verifyshoppingcart();
		Thread.sleep(2000);
		s4 = new SauceDemoYourCartPageClass(w);
		s4.verifycheckout();
		Thread.sleep(2000);
		s5 = new SauceDemoCheckoutInformationPageClass(w);
		s5.setSauceDemoFirstname();
		s5.setSauceDemoLastname();
		s5.setSauceDemoPostalcade();
		Thread.sleep(2000);
		j.executeScript("scroll(0, 300)");
		Thread.sleep(2000);
		s5.verifySauceDemocontinuebutton();
		Thread.sleep(2000);
		j.executeScript("scroll(0, -300)");
		Thread.sleep(2000);
		s6 = new SauceDemoOverviewPageClass(w);
		j.executeScript("scroll(0, 300)");
		s6.verifySauceDemofinish();
		Thread.sleep(2000);
		s7 = new sauceDemoCompletePageClass(w);
		j.executeScript("scroll(0, 300)");
		Thread.sleep(2000);
		s7.verifyBackHomebutton();
		j.executeScript("scroll(0, -300)");
		//System.out.println("Test2 Scenario is Passed order confirmed");
	}

	@Test
	public void test3() {
		s2.verifysauceLabsBikeLightadd2cart();
		s2.verifyshoppingcart();
		s4 = new SauceDemoYourCartPageClass(w);
		s4.verifyremoveproduct();
		//System.out.println("Test3 scenario is passed product removed");
		Reporter.log("passed");

	}

	@BeforeMethod
	public void logintoapplication() throws InterruptedException {
		//System.out.println("Logging into application");
		s1 = new SauceDemoLoginPageClass(w);
		s1.setsaucedemousername();
		s1.setsaucedemopassword();
		s1.verifysaucedemologinbutton();
		Thread.sleep(2000);
		//System.out.println("Logged in Successfully");
	}

	@AfterMethod
	public void logoutapplication() throws InterruptedException {
		//System.out.println("Logging out application");
		s3 = new SauceDemoLogoutPageClass(w);
		s3.verifyOpenMenu();
		s3.verifyLogout();
		Thread.sleep(2000);
		//System.out.println("Logged Out Successfully");

	}

	@BeforeClass
	public void launchbrowser() throws InterruptedException {

		s = new SauceDemoTestClassWithPOMPFTestNG();
		s.launchBrowser();
		Thread.sleep(2000);
		//System.out.println("Browser opened Successfully");
	}

	@AfterClass
	public void closedbrowser() {
		s = new SauceDemoTestClassWithPOMPFTestNG();
		w.quit();
		//System.out.println("Browser Closed Successfully");
	}

}
