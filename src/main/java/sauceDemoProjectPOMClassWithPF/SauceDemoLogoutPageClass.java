package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLogoutPageClass {

	@FindBy(xpath = ("//button[text() ='Open Menu']"))
	private WebElement openmenu;

	@FindBy(xpath = ("//a[text() ='Logout']"))
	private WebElement logout;

	WebDriver w;

	public SauceDemoLogoutPageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);

	}

	public void verifyOpenMenu() {
		openmenu.click();
	}

	public void verifyLogout() {
		logout.click();
	}

}
